import edu.fcps.karel2.Display;
import edu.fcps.Digit;

public class Midterm1 {

   public static void main(String[] args) {
      Display.openDefaultWorld();
      Display.setSize(36, 32);
      Display.setSpeed(8);

      Digit[] digits = {
         new Two(8,30),
         new Cinverse(13,30),
         new Three(19,30),
         new Three(26,30),
         new Inversefour(8,18),
         new E(15,18),
         new Minus(22,18)
      };

      for (Digit d : digits) {
         new Thread(() -> d.display()).start();
      }
   }
}
