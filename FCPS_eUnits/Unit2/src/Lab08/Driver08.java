	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class Driver08
   {
      public static void main(String[] args)
      {
      JFrame frame = new JFrame("Flower Turtles");
      frame.setSize(700,700);
      frame.setLocation(200,100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new TurtlePanel());
      frame.setVisible(true);
      Turtle.clear(Color.white);
      
      FlowerTurtle flowerTurtle1 = new FlowerTurtle(100,45,Color.red);
      FlowerTurtle flowerTurtle2 = new FlowerTurtle(250,45,Color.yellow);
      FlowerTurtle flowerTurtle3 = new FlowerTurtle(400,45,Color.BLUE);
      FlowerTurtle flowerTurtle4 = new FlowerTurtle(550,45,Color.black);
      
      Thread t1 = new Thread(flowerTurtle1);
      Thread t2 = new Thread(flowerTurtle2);
      Thread t3 = new Thread(flowerTurtle3);
      Thread t4 = new Thread(flowerTurtle4);
      
      t1.start();
      t2.start();
      t3.start();
      t4.start();      
      }
   }