   //Name:    Date:
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
   import javax.swing.*;
    public class PrizePanel extends JPanel
   {
      private static final int FRAME = 400;
      private static final Color BACKGROUND = new Color(204, 204, 204);
      private BufferedImage myImage;
      private Graphics myBuffer;
      private Ball ball;
      private Polkadot[] myPDarray;
      private Timer t; 
      private int hits = 0;
      int x=0;
      int y=0;
      int g = 50;
		//constructor   
       public PrizePanel()
      {
         myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
         myBuffer = myImage.getGraphics();
         myBuffer.setColor(BACKGROUND);
         myBuffer.fillRect(0, 0, FRAME, FRAME);
         ball = new Ball();
         //***********************************************************************
         myPDarray = new Polkadot[g];
         for(int k=0; k<myPDarray.length; k++)
         {
           int x = (int)(Math.random() *(FRAME -25) + 13);
           int y = (int)(Math.random() *(FRAME - 25) + 13);
           myPDarray[k] = new Polkadot(x, y, 25, Color.RED);
         }
         //***********************************************************************
         
         t = new Timer(5, new Listener());
         t.start();
      }

      public void paintComponent(Graphics g){
         g.drawImage(myImage,0,0,getWidth(),getHeight(),null);
      }

      private class Listener implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
            myBuffer.setColor(BACKGROUND);
            myBuffer.fillRect(0, 0, FRAME, FRAME);
            
            ball.move(FRAME, FRAME);
            for(int i=0;i<g;i++){
               collide(ball, myPDarray[i]);
               myPDarray[i].draw(myBuffer);
            }
            
            ball.draw(myBuffer);
            
            myBuffer.setColor(Color.BLACK);
            myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
            myBuffer.drawString("Count: " + hits, FRAME - 150, 25);
            
            repaint();

         }
      }   
       private void collide(Ball b, Polkadot pd)
      {
        double d = distance(pd.getX(),pd.getY(),b.getX(),b.getY());  
		   if(d<=b.getRadius()+pd.getRadius()){
            hits++;
            pd.jump(FRAME,FRAME);
         }
		  
      }
       private double distance(double x1, double y1, double x2, double y2)
      {
         return Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2)); 	 // enter the calculation here.
      }
   }