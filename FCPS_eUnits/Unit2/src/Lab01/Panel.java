package Lab01;

import javax.swing.*;

import java.awt.*;

public class Panel extends JPanel
{
   public void paintComponent(Graphics g)
   {
      g.setColor(Color.LIGHT_GRAY);
      g.fillRect(0,0,400,400);
      
      g.setColor(Color.GREEN.darker());
      g.drawLine(0,350,400,350);
      
      g.setColor(Color.RED);
      g.drawRect(100,200,150,150);
      
      g.setColor(Color.BLACK);
      g.fillRect(150,275,50,75);
      
      int xPoint[] = {75,175,275};
      int yPoint[] = {200,150,200};
      g.drawPolygon(xPoint,yPoint,3);
      
      g.setColor(Color.YELLOW);
      g.fillOval(300,75,50,50);
      
      g.setColor(Color.WHITE);
      g.drawString("Welcome Home",40,40);
   }
}