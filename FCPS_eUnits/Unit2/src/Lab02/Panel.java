package Lab02;

import javax.swing.*;

import java.awt.*;

public class Panel extends JPanel
{
   public void paintComponent(Graphics g)
   {
      g.setColor(Color.RED);
      g.fillRect(0,0,400,400);
      
      g.setColor(Color.YELLOW);
      int x = 100;
      int y = 75;
      int r = 10;
      
      g.fillOval(x,y,r*2,r*2);
      for(int i = 1;i <= 9;i++){
         if(y == 75 || y == 255){
            for(int j = 1;j <= 7;j++){
               if(y == 75){
                  x += 20;
               }
               if(y == 255){
                  x -= 20;
               }
               g.fillOval(x,y,r*2,r*2);
            }
         }
         if(x == 240){
            y += 20;
            if(y == 255){
               i = 1;
            }
         }
         if(x == 100){
            y -= 20;
         }
         g.fillOval(x,y,r*2,r*2);
      }
      g.fillRect(110,85,140,180);
      
      ImageIcon thomas = new ImageIcon("../src/Lab02/tj.jpg");
      g.drawImage(thomas.getImage(),115,92,null);
      g.setColor(Color.WHITE);
      g.setFont(new Font("ScanSerif",Font.ITALIC,30));
      g.drawString("Our Fearless Leader",70,320);
   }
}