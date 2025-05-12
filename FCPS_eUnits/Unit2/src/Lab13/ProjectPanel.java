import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ProjectPanel extends JPanel
{
   private static final ImageIcon Thomas = new ImageIcon("tj.jpg");
   private BufferedImage myImage;
   private Graphics2D myBuffer;
   private Timer t1, t2;
   private int xPos=250;
   private int yPos = 180;

   public ProjectPanel() {
    xPos = 50;
    myImage = new BufferedImage(700, 500, BufferedImage.TYPE_INT_RGB);
    myBuffer = (Graphics2D) myImage.getGraphics();
    
    t1 = new Timer(120, new Listener_1());
    t1.start();
    t2 = new Timer(3000, new Listener_2());
}

   
   public void paintComponent(Graphics g)
      {
         g.drawImage(myImage,0,0,getWidth(),getHeight(),null);
      }
      
   public class Listener_1 implements ActionListener
      {
            public void actionPerformed(ActionEvent e) {
                int xPoints[] = { xPos,xPos, xPos + 50,xPos, xPos - 50,xPos,xPos, xPos - 50, xPos,  xPos + 50 };
                int yPoints[] = { yPos, yPos + 50, yPos, yPos + 50, yPos, yPos + 50, yPos + 100, yPos + 150,yPos+100, yPos + 150 };
            
                myBuffer.setColor(Color.gray);
                myBuffer.fillRect(0, 0, 700, 350);
                myBuffer.setColor(Color.darkGray);
                myBuffer.fillRect(0, 335, 700, 500);
                myBuffer.drawImage(Thomas.getImage(), xPos - 40, 50, 75, 125, null);
                myBuffer.setStroke(new BasicStroke(10.0f));
                myBuffer.drawPolyline(xPoints, yPoints, 10);
            
                repaint();
                xPos = xPos + 5;
                if (xPos >= 200) {
                    myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
                    myBuffer.drawString("颱風天要帶多少錢出門?", 300, 150);
                    myBuffer.drawOval(250, 80, 400, 100);
                    repaint();
                    t1.stop();
                    t2.start();
                }
            }
         
      }
      
      private class Listener_2 implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
            t2.stop();
            myBuffer.setFont(new Font("Monospaced", Font.BOLD,24));
            myBuffer.drawString("4千萬 因為...",320,250);
            myBuffer.drawString("颱風天沒事千萬不要出門",330,280);
            myBuffer.drawOval(250,190,400,130);
            repaint();
         }
      }
}