import edu.fcps.karel2.Display;

public class Lab03{

   public static void main(String[] args){
      Display.openWorld("../maps/mountain.map");
      Display.setSize(16,16);
      Display.setSpeed(10);
      Climber yf = new Climber(8);
      yf.turnRight();
      yf.move();
      yf.climbUpRight();
      yf.climbUpRight();
      yf.climbUpRight();
      yf.climbDownRight();
      yf.climbDownRight();
      yf.pickBeeper();
      yf.turnAround();
      yf.climbUpLeft();
      yf.climbUpLeft();
      yf.climbDownLeft();
      yf.climbDownLeft();
      yf.climbDownLeft();
      yf.move();  
   }
}