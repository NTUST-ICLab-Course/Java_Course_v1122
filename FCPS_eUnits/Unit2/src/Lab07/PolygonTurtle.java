	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
    public class PolygonTurtle extends Turtle
   {
      private double mySize;
      private int mySides;
       public PolygonTurtle()
      {
         super();
         mySize = 50.0;
         mySides = 6;
      }
       public PolygonTurtle(double n, int s)
      {
         mySize = n;
         mySides = s;
      }
       public PolygonTurtle(double x, double y, double h, double n, int s)
      {
         super(x, y, h);
         mySize = n;
         mySides = s;
      }
       public void setSize(double n)
      {
         mySize = n;
      }
       public void setSides(int s)
      {
         mySides = s;
      }
       public void drawShape()
      {
         for(int i = 1;i <= mySides;i++){
            forward(mySize);
            turnLeft(360/mySides);
         }
      }
       public void drawShape(int x){
         for(int i = 3;i <= x;i++){
            for(int k = 0;k < i;k++){
               forward(mySize);
               turnLeft(360/i);
            }
         }
       }
   }