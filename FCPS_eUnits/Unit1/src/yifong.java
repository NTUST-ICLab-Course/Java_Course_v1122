import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class yifong extends Athlete implements Runnable
   {
   public yifong()
   {
      super(1,1,Display.EAST,0);
   }
   public void run(){
      int [] counterArray1 = new int[8];
      int [] counterArray2 = new int[8];
      for(int i = 0;i < counterArray1.length;i++){
         while(nextToABeeper()){
            pickBeeper();
            counterArray1[i]++;   
         }
         if(i>0){
            for(int j = 0;j < counterArray1[i-1];j++){
               putBeeper();
            }
         }
         move();
      }
      turnLeft();
      move();
      turnLeft();
      move();
      for(int i = 0;i < counterArray2.length;i++){
         while(nextToABeeper()){
            pickBeeper();
            counterArray2[i]++;   
         }
         if(i>0){
            turnLeft();
            turnLeft();
            move();
            move();
            for(int j = 0;j < counterArray2[i-1];j++){
               putBeeper();
            }
            turnLeft();
            turnLeft();
            move();
            move();
         }
         move();
      }
   }
   }