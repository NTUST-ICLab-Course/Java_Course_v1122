   //Torbert, e-mail: smtorbert@fcps.edu
	//version 6.17.2003

   import javax.swing.JFrame;
    public class Driver14
   {
       public static void main(String[] args)
      { 
         JFrame frame = new JFrame("Unit2, Lab14");
         frame.setSize(400, 400);
         frame.setLocation(175, 50);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       	frame.setContentPane(new BumperPanel());
         frame.setVisible(true);
      }
   }