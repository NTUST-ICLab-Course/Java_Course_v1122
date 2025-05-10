import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
 public class PrizePanel extends JPanel
{
   private static final int FRAME = 800;
   private static final Color BACKGROUND = new Color(204, 204, 204);
   private final int num = 500;
   private BufferedImage myImage;
   private Graphics myBuffer;
   private Pinball pb;
   private Prize[] Parray;
   
   private Timer t;
   private int hits = 0; 

    public PrizePanel()
   {
      myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
      myBuffer = myImage.getGraphics();
      myBuffer.setColor(BACKGROUND);
      myBuffer.fillRect(0, 0, FRAME,FRAME);
      
      pb = new Pinball((int)(Math.random() + (FRAME - 100) + 50),(int)(Math.random() + (FRAME - 100) + 50),25,Color.black);
      pb.setbound(FRAME,FRAME);
      Parray = new Prize[num];
      for(int i = 0;i < Parray.length;i++){
         Parray[i] = new Prize((int)(Math.random() * FRAME),(int)(Math.random() * FRAME),Math.random() * 15,Color.RED);
      }
      
      t = new Timer(5, new Listener());
      t.start();
   }
    public void paintComponent(Graphics g)
   {
      g.drawImage(myImage,0,0,getWidth(),getHeight(),null);
   }
    private class Listener implements ActionListener
   {
       public void actionPerformed(ActionEvent e)
      {
         myBuffer.setColor(BACKGROUND);
         myBuffer.fillRect(0,0,FRAME,FRAME);
         
         for(int i = 0;i < num;i++){
            if(pb.intersect(Parray[i]) && Parray[i].getMyColor() == Color.RED){
               Parray[i].lightup();
            }
            Parray[i].draw(myBuffer);
         }
         pb.tick();
         pb.draw(myBuffer);
         
         repaint();
      }
   }   
}