// Torbert, 7.20.06
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
public class PingPong
{
   public static void main(String[] args)
   { 
      JFrame frame = new JFrame("PingPongGame");
      frame.setSize(600,600);    //makes the mouse location correct
      frame.setLocation(0, 0);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      PingPongPanel p = new PingPongPanel();
      frame.setContentPane(p);
      frame.setVisible(true);
      SwingUtilities.invokeLater(() -> p.requestFocus());
   }
}
