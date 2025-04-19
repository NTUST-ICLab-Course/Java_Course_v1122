	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class Driver08
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Polygon Turtles");
         frame.setSize(900,900);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
         Turtle.clear(Color.white);//background turn to white color
         
         FlowerTurtle flower1 = new FlowerTurtle(100,45,Color.red);
         FlowerTurtle flower2 = new FlowerTurtle(250,45,Color.yellow);
         FlowerTurtle flower3 = new FlowerTurtle(400,45,Color.blue);
         FlowerTurtle flower4 = new FlowerTurtle(550,45,Color.black);
         
         Thread t1 = new Thread(flower1);
         Thread t2 = new Thread(flower2);
         Thread t3 = new Thread(flower3);
         Thread t4 = new Thread(flower4);
         
         t1.start();
         t2.start();
         t3.start();
         t4.start();
      }
   }