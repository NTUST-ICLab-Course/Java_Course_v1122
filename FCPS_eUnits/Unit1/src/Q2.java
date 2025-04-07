import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class Q2{
   public static void main(String[] args){
   
      Display.openWorld("../maps/Q2.map");
      Display.setSize(15, 15);
      Display.setSpeed(5);
      Athlete yifong = new Athlete(1,1,Display.EAST,0);
      Athlete sb = new Athlete(8,8,Display.SOUTH,0);
      int [] counterArray1 = new int[8];
      int [] counterArray2 = new int[8];
      for(int i = 0;i < 4;i++){
         for(int j = 0;j < 4;j++){
            sb.move();
         }
         sb.turnLeft();
      }
      for(int i = 0;i < counterArray1.length;i++){
         while(yifong.nextToABeeper()){
            yifong.pickBeeper();
            counterArray1[i]++;   
         }
         if(i>0){
            for(int j = 0;j < counterArray1[i-1];j++){
               yifong.putBeeper();
            }
         }
         yifong.move();
      }
      yifong.turnLeft();
      yifong.move();
      yifong.turnLeft();
      yifong.move();
      for(int i = 0;i < counterArray2.length;i++){
         while(yifong.nextToABeeper()){
            yifong.pickBeeper();
            counterArray2[i]++;   
         }
         if(i>0){
            yifong.turnLeft();
            yifong.turnLeft();
            yifong.move();
            yifong.move();
            for(int j = 0;j < counterArray2[i-1];j++){
               yifong.putBeeper();
            }
            yifong.turnLeft();
            yifong.turnLeft();
            yifong.move();
            yifong.move();
         }
         yifong.move();
      }
   }
}