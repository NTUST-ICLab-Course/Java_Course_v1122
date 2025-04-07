import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
    public class SB extends Athlete implements Runnable
   {
       public SB()
      {
         super(8,8,Display.SOUTH,0);
      }
       public void run()
      {
         for(int i = 0;i < 4;i++){
            for(int j = 0;j < 4;j++){
               move();
            }
            turnLeft();
         }
      }
   }