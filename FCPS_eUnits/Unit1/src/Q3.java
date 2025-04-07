import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
public class Q3{
   public static void main(String[] args){
   
      Display.openWorld("../maps/Q3.map");
      Display.setSize(15, 15);
      Display.setSpeed(5);
      
      Robot yifong = new Robot(8,1,Display.EAST,INFINITY);
      while(!yifong.nextToABeeper() && frontIsClear()){
         yifong.move();
      }
   }
}