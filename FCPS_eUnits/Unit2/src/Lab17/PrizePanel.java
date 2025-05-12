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
		//constructor   
       public PrizePanel()
      {
         myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
         myBuffer = myImage.getGraphics();
         myBuffer.setColor(BACKGROUND);
         myBuffer.fillRect(0, 0, FRAME, FRAME);
         //ball part
         int xPos = (int)(Math.random()*(FRAME-100)+50);
         int yPos = (int)(Math.random()*(FRAME-100)+50);
         ball = new Ball(xPos, yPos, 50, Color.black);
         //polkadot part
         xPos = (int)(Math.random()*(FRAME-100)+50);
         yPos = (int)(Math.random()*(FRAME-100)+50);
         pd = new Polkadot(xPos, yPos,20, Color.red);
         
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
            myBuffer.fillRect(0, 0, FRAME, FRAME);
            ball.move(FRAME, FRAME);
            myBuffer.drawString("Count: " + hits, 20, 400);
            ball.draw(myBuffer);
            pd.draw(myBuffer);
            
            if(distance(ball.getX(),ball.getY(),pd.getX(), pd.getY())<= (ball.getRadius()+pd.getRadius())){
               pd.jump(FRAME,FRAME);
               pd.draw(myBuffer);
               hits++;
            }
            //string "count"
            myBuffer.setColor(Color.red);
            myBuffer.setFont(new Font("Monospaced", Font.BOLD, 24));
            myBuffer.drawString("Count: " + hits, 250, 25);
            //string "control black ball"
            myBuffer.setColor(Color.red);
            myBuffer.setFont(new Font("Monospaced", Font.BOLD, 12));
            myBuffer.drawString("Use↑ ↓ ← → to control black ball location", 50, 45);
            //string "control red ball"
            myBuffer.setColor(Color.red);
            myBuffer.setFont(new Font("Monospaced", Font.BOLD, 12));
            myBuffer.drawString("Use 8 4 5 6 to control red ball location", 50, 55);

            
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
       public double distance(double x1, double y1, double x2, double y2)
      {
         return Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2)); 	 // enter the calculation here.
      }
      
      private class Mouse extends MouseAdapter {
         public void mousePressed(MouseEvent e) {
            int button = e.getButton();
   
            if (button == MouseEvent.BUTTON3) { // Right-click
               ball.setX(e.getX());
               ball.setY(e.getY());
            } else if (e.isShiftDown()) { // Shift + Left-click
               ball.setdx(Math.random() * 12 - 6);
               ball.setdy(Math.random() * 12 - 6);
            } else if (button == MouseEvent.BUTTON1) { // Left-click
               pd.setX(e.getX());
               pd.setY(e.getY());
            }
         }
      }
      
      private class Key extends KeyAdapter {
         public void keyPressed(KeyEvent e) {
         //black ball part
            if (e.getKeyCode() == KeyEvent.VK_UP)
               ball.setY(ball.getY() - 20); // 上
            else if (e.getKeyCode() == KeyEvent.VK_DOWN)
               ball.setY(ball.getY() + 20); // 下
            else if (e.getKeyCode() == KeyEvent.VK_RIGHT)
               ball.setX(ball.getX() + 20); // 左
            else if (e.getKeyCode() == KeyEvent.VK_LEFT)
               ball.setX(ball.getX() - 20); // 右
               
        //red ball part
            if (e.getKeyCode() == KeyEvent.VK_NUMPAD8){
               pd.setY(pd.getY()-10);
               if(pd.getY()<= pd.getRadius()){
                  pd.setY(pd.getDiameter());
               }  
            }else if(e.getKeyCode() == KeyEvent.VK_NUMPAD5){
                  pd.setY(pd.getY()+10);
                  if(pd.getY()>= FRAME){
                     pd.setY(FRAME - pd.getDiameter());
                  }
               }
            else if(e.getKeyCode() == KeyEvent.VK_NUMPAD6){
                  pd.setX(pd.getX()+10);
                  if(pd.getX()>= FRAME){
                     pd.setX(FRAME - pd.getDiameter());
                  }
               }
            else if (e.getKeyCode() == KeyEvent.VK_NUMPAD4){
               pd.setX(pd.getX()-10);
               if(pd.getX()<= pd.getRadius()){
                  pd.setX(pd.getDiameter());
               } 
            }
         }
      }

   }