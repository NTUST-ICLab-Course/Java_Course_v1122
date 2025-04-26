   //Name:    Date:
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
 public class ProjectPanel extends JPanel
{
   private static final int FRAME = 400;
   private static final ImageIcon Thomas = new ImageIcon("Thomas.jpg");
   private BufferedImage myImage;
   private Graphics2D myBuffer;
   private int xPos = 250;
   private int yPos = 180;
   private Timer t1,t2;
	//constructor   
    public ProjectPanel()
   {
      xPos = 50;
      myImage = new BufferedImage(700,500,BufferedImage.TYPE_INT_RGB);
      myBuffer = (Graphics2D)myImage.getGraphics();
      t1 = new Timer(120, new Listener_1());
      t1.start();
      t2 = new Timer(3000, new Listener_2());
   }
    public void paintComponent(Graphics g)
   {
      g.drawImage(myImage,0,0,getWidth(),getHeight(),null);
   }
    private class Listener_1 implements ActionListener
   {
       public void actionPerformed(ActionEvent e)
      {
         int xPoints[] = {xPos,xPos,xPos + 50,xPos,xPos - 50,xPos,
            xPos,xPos - 50,xPos,xPos + 50};
         int yPoints[] = {yPos,yPos + 50,yPos,yPos + 50,yPos,
            yPos + 50,yPos + 100,yPos + 150,yPos + 100,yPos + 150};
         myBuffer.setColor(Color.gray);
         myBuffer.fillRect(0,0,700,350);
         myBuffer.setColor(Color.darkGray);
         myBuffer.fillRect(0,335,700,500);
         myBuffer.drawImage(Thomas.getImage(),xPos - 50,50,105,125,null);
         myBuffer.setStroke(new BasicStroke(10.0f));
         myBuffer.drawPolyline(xPoints,yPoints,10);
         
         repaint();
         xPos = xPos + 5;
         if(xPos >= 200){
            myBuffer.setFont(new Font("Monospaced",Font.BOLD,24));
            myBuffer.drawString("How much money should you",280,130);
            myBuffer.drawString("take with you on typhoon day?",260,150);
            myBuffer.drawOval(250,80,400,100);
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
         myBuffer.setFont(new Font("Monospaced",Font.BOLD,24));
         myBuffer.drawString("I can't type words with",320,250);
         myBuffer.drawString("Chinese,so just watch",320,270);
         myBuffer.drawString("the video :)",320,290);
         myBuffer.drawOval(280,190,400,130);
         repaint();
      }
   }   
}