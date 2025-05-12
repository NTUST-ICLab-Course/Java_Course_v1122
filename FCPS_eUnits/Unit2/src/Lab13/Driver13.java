   //Torbert, e-mail: smtorbert@fcps.edu
	//version 6.17.2003

import javax.swing.JFrame;
public class Driver13
   {
       public static void main(String[] args)
      { 
         JFrame frame = new JFrame("Riddle Me This");
         frame.setSize(700, 500);
         frame.setLocation(0, 0);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       	frame.setContentPane(new ProjectPanel());
         frame.setVisible(true);
      }
   }