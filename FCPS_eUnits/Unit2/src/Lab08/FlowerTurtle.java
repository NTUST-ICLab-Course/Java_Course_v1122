	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   public class FlowerTurtle extends Turtle implements Runnable
   {
      private double mySize;
      private Color myColor;
      public FlowerTurtle()
      {
         mySize = 50.0;
         myColor = Color.RED;
      }
      public FlowerTurtle(double x, double n, Color c)
      {
         super(x, 300.0, 90.0);
         mySize = n;
         myColor = c;
      }
      public void setSize(double n)
      {
         mySize = n;
      }
      public void setColor(Color c)
      {
         myColor = c;
      }
      private void drawPetals() //starts and ends at center facing north
      {
         super.setColor(myColor);
         double interiorAngle = 360/30;
         for(int i=1; i<=30;i++){
            forward(mySize);
            turnLeft(180);
            forward(mySize);
            turnLeft(180);
            turnLeft(interiorAngle);
         }
      }
      private void drawStem() //starts at top of stem facing south, ends at bottom
      {
      
         setColor(Color.green);
         super.setColor(myColor);
         turnLeft(180);
         forward(mySize*3);
         turnLeft(180);
         forward(mySize/3);
         
         turnLeft(60);
         forward(mySize/2);
         turnLeft(180);
         forward(mySize/2);
         turnLeft(60);
         
         turnLeft(15);
         forward(mySize/1.2);
         turnLeft(180);
         forward(mySize/1.2);
      }
      public void drawShape()
      {
         drawPetals();
         drawStem();
      }
      
      public void run(){
         drawShape();
      }
   }