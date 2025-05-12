import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Midterm2 {

   public static void main(String[] args) {

      Display.openWorld("../maps/mid2.map");
      Display.setSize(15, 15);
      Display.setSpeed(10);

      Athlete oo = new Athlete(1, 1, Display.EAST, 0);
      Athlete ooo = new Athlete(8, 8, Display.EAST, 0);

      Thread t1 = new Thread(() -> {
         for (int j = 0; j <= 3; j++) {
            for (int i = 0; i <= 3; i++) {
               ooo.move();
            }
            ooo.turnRight();
         }
      });

      Thread t2 = new Thread(() -> {
         int[] counter = new int[10];
         for (int i = 0; i < 8; i++) {
            while (oo.nextToABeeper()) {
               oo.pickBeeper();
               counter[i]++;
            }
            if (i > 0) {
               for (int k = 0; k < counter[i - 1]; k++) {
                  oo.putBeeper();
               }
            }
            oo.move();
         }

         oo.turnLeft();
         oo.move();
         oo.turnLeft();
         oo.move();

         int[] count = new int[10];
         for (int i = 0; i < 8; i++) {
            while (oo.nextToABeeper()) {
               oo.pickBeeper();
               count[i]++;
            }
            oo.turnAround();
            oo.move();
            if (i > 0) {
               for (int k = 0; k < count[i]; k++) {
                  oo.putBeeper();
               }
            }
            oo.turnAround();
            oo.move();
            oo.move();
         }
      });

      t1.start();
      t2.start();
   }
}
