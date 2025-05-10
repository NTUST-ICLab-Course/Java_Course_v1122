import javax.swing.JFrame;
    public class Lab19
   {
       public static void main(String[] args)
      { 
         JFrame frame = new JFrame("Lab19");
         frame.setSize(400, 400);
         frame.setLocation(0, 0);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       	frame.setContentPane(new PrizePanel());
         frame.setVisible(true);
      }
   }