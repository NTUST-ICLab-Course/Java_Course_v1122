import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class Q2{
   public static void main(String[] args){
   
      Display.openWorld("../maps/Q2.map");
      Display.setSize(15, 15);
      Display.setSpeed(5);
      Thread t1 = new Thread(new yifong());
      Thread t2 = new Thread(new SB());
      
      t1.start();
      t2.start();
   }
}