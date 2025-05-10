// Torbert, 7.20.06

   import java.awt.*;
   import java.awt.image.*;

    public class Turtle
   {
      private static BufferedImage img;
      private static Graphics gra;
      private static int black = 0;
      private static int blue = 255;       // 2^8-1
      private static int green = 65280;    //(2^8-1)*2^8
      private static int red = 16711680;   //(2^8-1)*2^16
      private static int white = 16777215; // 2^24-1
      private boolean penDown;
      private Color turtleColor;
      private int x1,y1;
      private double x,y,theta;            // what does a Turtle know?
      static									 	 // a static initializer list
      {
         img = new BufferedImage(800,600,BufferedImage.TYPE_INT_RGB);
         gra = img.getGraphics();
      }
       public Turtle()
      {
        // img = new BufferedImage(800,600,BufferedImage.TYPE_INT_RGB);
         x = img.getWidth()/2;           //start at center
         y = img.getHeight()/2;          //start at center
         theta = 90;                     //start facing north
         this.setPenDown(true);           //Start drawing
      }
      
       public static Image getImage()
      {
         return img;
      }
      
       public Color setColor(){
         return turtleColor; 
      }
      
       public void setColor(Color turtleColor){
         this.turtleColor = turtleColor;
      }
      
       public void setPenDown(boolean down) {
         penDown = down;
      }
      
       public boolean isPenDown() {
         return penDown;
      }
       
       public void turnLeft(double a)
      {
         theta += a;
      }
      
       public void forward(double r)
      {
         if(isPenDown()){
            for(int i = 0;i <= (int)r;i++){
               x1 = (int)(x + i * Math.cos(theta * Math.PI / 180));
               y1 = (int)(y - i * Math.sin(theta * Math.PI / 180));
               img.setRGB(x1,y1,white);
            }
         }
         x = (int)(x + r * Math.cos(theta * Math.PI / 180));
         y = (int)(y - r * Math.sin(theta * Math.PI / 180));
      }
   }