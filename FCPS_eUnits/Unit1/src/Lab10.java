import edu.fcps.karel2.Display;

public class Lab10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openWorld("../maps/maze3.map");
      Display.setSize(10, 10);
      Display.setSpeed(10);
      Athlete lisa = new Athlete(1, 1, Display.NORTH, Display.INFINITY);
      
      while(!lisa.nextToABeeper()){
         if(lisa.rightIsClear()){
            lisa.turnRight();
            }
         if(lisa.frontIsClear()){
            lisa.move();
         }
         else{
            lisa.turnLeft();
         }
      }
      
	}

}
