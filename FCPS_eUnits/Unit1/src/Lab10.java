import edu.fcps.karel2.Display;
public class Lab10{
   
   public static void main(String[] args){
   
      Display.openWorld("../maps/maze1.map");
      Display.setSize(10, 10);
      Display.setSpeed(10);
      Athlete yifong = new Athlete(1,1,Display.NORTH,Display.INFINITY);
      while(!yifong.nextToABeeper()){
         if(yifong.rightIsClear()){
            yifong.turnRight();
         }
         if(yifong.frontIsClear()){
            yifong.move();
         }
         if(!yifong.rightIsClear() && !yifong.frontIsClear()){
            yifong.turnLeft();
         }
      }
   }
}