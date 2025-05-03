   //Name:    Date:
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
    public class PingPongPanel extends JPanel
   {
      private static final int FRAME = 600;
      private static final int xwidth = 10;
      private static final int ywidth = 200;
      private static final Color BACKGROUND = new Color(204, 204, 204);
      private BufferedImage myImage;
      private Graphics myBuffer;
      private Bumper player1,player2;
      private int hits1,hits2;
      private Ball ball;
      private Polkadot pd;
      private Timer t;
      private int hits = 0;
      private boolean connected = false; 
		//constructor   
       public PingPongPanel()
      {
         myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
         myBuffer = myImage.getGraphics();
         
         player1 = new Bumper(0,250,xwidth,ywidth,Color.red);
         player2 = new Bumper(FRAME - xwidth,250,xwidth,ywidth,Color.blue);
         ball = new Ball();
         
         t = new Timer(10, new Listener());
         t.start();
         
         setFocusable(true);
         requestFocusInWindow();
         requestFocus();
         
         addKeyListener(new Key());
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
            
            BumperCollision.collide(player1,ball);
            BumperCollision.collide(player2,ball);
            myBuffer.drawString("Count: " + hits, 20, 400);
            
            ball.draw(myBuffer);
            player1.draw(myBuffer);
            player2.draw(myBuffer);
            
            if(ball.getX() - ball.getRadius() <= 0){
               hits1++;
               ball.jump(300,300);
            }
            if(ball.getX() + ball.getRadius() >= FRAME){
               hits2++;
               ball.jump(300,300);
            }
              
            myBuffer.setColor(Color.RED);
            myBuffer.setFont(new Font("Monospaced", Font.BOLD, 18));
            myBuffer.drawString("Use W,A,S,D to control black ball's location",50,40);
            myBuffer.drawString("Count: " + hits2, 25,80);
            myBuffer.drawString("Use 8 5 4 6 to control yellow ball's location",50,55);
            myBuffer.drawString("Count: " + hits2, FRAME-125,80);
            
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
      private class Key extends KeyAdapter{
         public void keyPressed(KeyEvent e){
            if(e.getKeyCode() == KeyEvent.VK_W){
               player1.setY(player1.getY() - 30);
               if(player1.getY() <= 0){
                  player1.setY(0);
               }
            }
            else if(e.getKeyCode() == KeyEvent.VK_S){
               player1.setY(player1.getY() + 30);
               if(player1.getY() >= FRAME - ywidth){
                  player1.setY(FRAME - ywidth);
               }
            }
            else if(e.getKeyCode() == KeyEvent.VK_A){
               player1.setX(player1.getX() - 30);
               if(player1.getX() <= 0){
                  player1.setX(0);
               }
            }
            else if(e.getKeyCode() == KeyEvent.VK_D){
               player1.setX(player1.getX() + 30);
               if(player1.getX() >= FRAME / 2 - xwidth){
                  player1.setX(FRAME / 2 - xwidth);
               }
            }
            
         
            if(e.getKeyCode() == KeyEvent.VK_NUMPAD8){
               player2.setY(player2.getY() - 30);
               if(player2.getY() <= 0){
                  player2.setY(0);
               }
            }
            else if(e.getKeyCode() == KeyEvent.VK_NUMPAD5){
               player2.setY(player2.getY() + 30);
               if(player2.getY() >= FRAME - ywidth){
                  player2.setY(FRAME - ywidth);
               }
            }
            else if(e.getKeyCode() == KeyEvent.VK_NUMPAD4){
               player2.setX(player2.getX() - 30);
               if(player2.getX() <= FRAME / 2){
                  player2.setX(FRAME / 2);
               }
            }
            else if(e.getKeyCode() == KeyEvent.VK_NUMPAD6){
               player2.setX(player2.getX() + 30);
               if(player2.getX() >= FRAME / 2 - xwidth){
                  player2.setX(FRAME / 2 - xwidth);
               }
            }
         }
      }
   }