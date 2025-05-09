   //Name:    Date:
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
    public class PrizePanel extends JPanel
   {
      private static final int FRAME = 400;
      private static final Color BACKGROUND = new Color(204, 204, 204);
      private BufferedImage myImage;
      private Graphics myBuffer;
      private Ball ball;
      private Polkadot pd;
      private Timer t;
      private int hits = 0;
      private boolean connected = false; 
		//constructor   
       public PrizePanel()
      {
         myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
         myBuffer = myImage.getGraphics();
         myBuffer.setColor(BACKGROUND);
         myBuffer.fillRect(0, 0, FRAME,FRAME);
         
         int xPos = (int)(Math.random()*(FRAME - 100) + 50);
         int yPos = (int)(Math.random()*(FRAME - 100) + 50);
         ball = new Ball(xPos,yPos,50,Color.BLACK);
         
         int xDot = (int)(Math.random()*(FRAME - 100) + 50);
         int yDot = (int)(Math.random()*(FRAME - 100) + 50);
         pd = new Polkadot(xDot,yDot,20,Color.YELLOW);
         
         addMouseListener(new Mouse());
         t = new Timer(10, new Listener());
         t.start();
         
         addMouseListener(new Mouse());
         addKeyListener(new Key());
         setFocusable(true);
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
            
            ball.move(FRAME, FRAME);
            myBuffer.drawString("Count: " + hits, 20, 400);
            collide(ball, pd);
            ball.draw(myBuffer);
            pd.draw(myBuffer);
              
            myBuffer.setColor(Color.RED);
            myBuffer.setFont(new Font("Monospaced", Font.BOLD, 11));
            myBuffer.drawString("Use UP DOWN LEFT RIGHT to control black ball's location",10,40);
            
            myBuffer.setColor(Color.RED);
            myBuffer.setFont(new Font("Monospaced", Font.BOLD, 11));
            myBuffer.drawString("Use 8 5 4 6 to control yellow ball's location",10,55);
            
            myBuffer.setColor(Color.RED);
            myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
            myBuffer.drawString("Count: " + hits, FRAME + 250, 25);
            
            repaint();

         }
      }   
      private void collide(Ball b, Polkadot pd)
      {
        double d = distance(pd.getX(),pd.getY(),ball.getX(),ball.getY());  
		  if(d <= b.getRadius() + pd.getRadius()){
            hits++;
            pd.jump(FRAME,FRAME);
        }
		  
      }
      private double distance(double x1, double y1, double x2, double y2)
      {
         return Math.sqrt(Math.pow(x1 - x2,2)+Math.pow(y1 - y2,2));
      }
      private class Mouse extends MouseAdapter{
         public void mousePressed(MouseEvent e){
            if(e.getButton() == MouseEvent.BUTTON3){
               ball.setX(e.getX());
               ball.setY(e.getY());
            }
            else if(e.isShiftDown()){
               ball.setdx(Math.random()*12 - 6);
               ball.setdy(Math.random()*12 - 6);
            }
            else{
               pd.setX(e.getX());
               pd.setY(e.getY());
            }
         }
      }
      private class Key extends KeyAdapter{
         public void keyPressed(KeyEvent e){
            if(e.getKeyCode() == KeyEvent.VK_UP){
               ball.setY(ball.getY() - 20);
            }
            if(e.getKeyCode() == KeyEvent.VK_DOWN){
               ball.setY(ball.getY() + 20);
            }
            if(e.getKeyCode() == KeyEvent.VK_LEFT){
               ball.setY(ball.getX() - 20);
            }
            if(e.getKeyCode() == KeyEvent.VK_RIGHT){
               ball.setY(ball.getX() + 20);
            }
         
            if(e.getKeyCode() == KeyEvent.VK_NUMPAD8){
                  pd.setY(pd.getY() - 10);
                  if(pd.getY() <= pd.getRadius()){
                     pd.setY(pd.getDiameter());
                  }
            }
            if(e.getKeyCode() == KeyEvent.VK_NUMPAD5){
                  pd.setY(pd.getY() + 10);
                  if(pd.getY() >= FRAME){
                     pd.setY(FRAME - pd.getDiameter());
                  }
            }
            if(e.getKeyCode() == KeyEvent.VK_NUMPAD4){
                  pd.setX(pd.getX() - 10);
                  if(pd.getX() <= pd.getRadius()){
                     pd.setX(pd.getDiameter());
                  }
            }
            if(e.getKeyCode() == KeyEvent.VK_NUMPAD6){
                  pd.setX(pd.getX() + 10);
                  if(pd.getX() >= FRAME){
                     pd.setX(FRAME + pd.getDiameter());
                  }
            }
         }
      }
   }