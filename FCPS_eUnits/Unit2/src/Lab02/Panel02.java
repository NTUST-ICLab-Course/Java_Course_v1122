package Lab02;
import javax.swing.*;
import java.awt.*;

public class Panel02 extends JPanel {
   public void paintComponent(Graphics g){
      g.setColor(Color.RED);
      g.fillRect(0, 0, 400, 400);
      g.setColor(Color.yellow);
      g.fillRect(110, 90, 140, 180);
      int x =100;
      int y = 80;
      int r = 10;
      
      for (int i = 1; i <= 9; i++){
         g.fillOval(x,y,r*2,r*2);
         g.fillOval(x+140, y, r*2, r*2);
         y += 20;
      }
      
      for (int i = 1; i <= 8 ; i++){
         g.fillOval(x,y,r*2,r*2);
         g.fillOval(x, y-180, r*2, r*2);
         x += 20;
      }
      
      ImageIcon thomas = new ImageIcon("C:/Kamui/ntust/Java_Course_v1122/FCPS_eUnits/Unit2/src/Lab02/tj.jpg");
      g.drawImage(thomas.getImage(), 115, 95, null);
      g.setColor(Color.WHITE);
      g.setFont(new Font("ScanSerif", Font.ITALIC, 30));
      g.drawString("Our Fearless Leader",70,320);
   }
}
   
