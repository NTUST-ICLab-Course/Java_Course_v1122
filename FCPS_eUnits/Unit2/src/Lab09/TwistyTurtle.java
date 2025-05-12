	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
    public class TwistyTurtle extends Turtle
   {
      private double mySize;
      private int mySides;
      
      private int drawmode;
      private int extensional;
       public TwistyTurtle(int mode)
      {
         super();
         drawmode = mode;
         mySize = 30.0;
      }
       public TwistyTurtle(double n, int s)
      {
         mySize = n;
         drawmode = s;
      }
      public TwistyTurtle(double x, double y, double h, int s)
      {
         super(x, y, h);
         mySize = 30;
         drawmode = s;
      }
       public TwistyTurtle(double x, double y, double h, double n, int s)
      {
         super(x, y, h);
         mySize = n;
         mySides = s;
      }
      
       public void setSize(double n)
      {
         mySize = n;
      }
      
       public void rotatetriangle(){
         for(int i=5;i<=400;i+=10){
            forward(i);
            turnLeft(123);
         }
       }
       public void rotatet(){
         for(int i=0;i<=150;i+=2){
            forward(i);
            turnLeft(30);
         }
       }
       
       public void rotatetsquare(){
         for(int i=0;i<=150;i+=5){
            forward(i);
            turnLeft(45);
            forward(i);
            turnLeft(90);
            forward(i);
            turnLeft(90);
            forward(i);
            turnLeft(90);
         }
       }
       
       public void FourthDraw(){
         for(int i=1;i<=5;i++){
            forward(150);
            turnLeft(150);
         }
       }
       
       public void octagon(){
         for(int i=1;i<=8;i++){
            forward(30);
            turnLeft(45);
         }
       }
       
       public void square(){
         for(int i=1;i<=4;i++){
            forward(30);
            turnLeft(90);
         }
       }
       public void drawShape(int g)
      {
         for(int i=3;i<=g;i++){
            for(int k=0;k<i;k++){
               forward(50);
               turnLeft(360/i);
            }
         }
      }
      public void drawShape()
      {
         switch(drawmode){
            case 1:
            super.setColor(Color.orange);
               rotatetriangle();
               break;
            case 2:
               super.setColor(Color.black);
               rotatet();
               break;
            case 3:
               super.setColor(Color.red);
               rotatetsquare();
               break;
            case 4:
               super.setColor(Color.yellow);
               octagon();
               break;
            default:
               break;
         }
      }

   }