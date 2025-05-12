//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class Driver09
   {
      public static void main(String[] args)
      {
      JFrame frame = new JFrame("Polygon Turtles");
      frame.setSize(400,400);
      frame.setLocation(300,100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new TurtlePanel());
      frame.setVisible(true);
      Turtle.clear(Color.white);
      
      TwistyTurtle ratatetriangle = new TwistyTurtle(1);
      TwistyTurtle rotatet = new TwistyTurtle(100,250,90,2);
      TwistyTurtle rotatetsquares = new TwistyTurtle(500,350,90,3);
      
         
      ratatetriangle.drawShape();
      rotatet.drawShape();
      rotatetsquares.drawShape();
      }
   }