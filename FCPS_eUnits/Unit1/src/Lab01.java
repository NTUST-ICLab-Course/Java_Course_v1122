import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;


public class Lab01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openWorld("../maps/school.map");
		Robot lisa = new Robot();
      Robot pete = new Robot(4, 5, 3, 0);
      
      lisa.move();
      lisa.move();
      lisa.turnLeft();
      lisa.move();
      lisa.turnLeft();
      lisa.move();
      lisa.pickBeeper();
      
      lisa.move();
      lisa.turnLeft();
      lisa.move();
      lisa.putBeeper();
      lisa.move();
      lisa.turnLeft();
      lisa.turnLeft();
      
      
      //test
	}

}
