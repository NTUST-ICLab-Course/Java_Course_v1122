package Lab02;

import javax.swing.JFrame;

public class Driver{

   public static void main(String[] args){
   
      JFrame frame = new JFrame("Lab02");
      frame.setSize(400,400);
      frame.setLocation(100,50);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new Panel());
      frame.setVisible(true);
   }
}