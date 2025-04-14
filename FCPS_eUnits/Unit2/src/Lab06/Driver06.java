	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
    public class Driver06
   {
       public static void main(String[] args)
      {
         JFrame frame = new JFrame("Square Turtles");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
         
         Turtle.setCrawl(true);     //a class method
      
         SquareTurtle smidge = new SquareTurtle();
         smidge.setColor(Color.BLUE);
         smidge.setThickness(6);
         smidge.drawShape();
         smidge = new SquareTurtle(100);
         smidge.drawShape();
         
         smidge = new SquareTurtel(100,250,45,20);
         smidge.setColor(Color,red);
         smidge.setThickness(4);
         smidge.drawShape();
      
         for(int i=30;i<=150;i+=30){
            smidge = new SquareTurtle(500,250,45,i);
            smidge.setColor(Color.yellow);
            smidge.setThickness(2);
            smidge.drawShape();
         }
      
      }
   }