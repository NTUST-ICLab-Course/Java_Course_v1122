import edu.fcps.karel2.Display;

public class Q1 {
   public static void main(String[] args) {
      Display.openDefaultWorld();
      Display.setSize(36, 32);
      Display.setSpeed(15);
      
      Thread t1 = new Thread(new Two(7, 19));
      Thread t2 = new Thread(new OppC(13, 19));
      Thread t3 = new Thread(new Three(19, 19));
      Thread t4 = new Thread(new Three(25, 19));
      Thread t5 = new Thread(new Five(7, 9));
      Thread t6 = new Thread(new OppFour(13, 9));
      Thread t7 = new Thread(new Dash(19, 9));
      t1.start();
      t2.start();
      t3.start();
      t4.start();
      t5.start();
      t6.start();
      t7.start();
   }
}