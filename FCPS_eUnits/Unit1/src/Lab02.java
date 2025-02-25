import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;


public class Lab02 {

	public static void main(String[] args) {

		Display.openWorld("../maps/maze.map");
      Display.setSize(8,8);
      Display.setSpeed(5);
      
		Athlete lisa = new Athlete();
      
      lisa.putBeeper();
      lisa.move();
      lisa.putBeeper();
      lisa.turnRight();
      lisa.move();
      lisa.putBeeper();
      lisa.turnRight();
      lisa.move();
      lisa.putBeeper();
      lisa.turnLeft();
      lisa.move();
      lisa.putBeeper();
      lisa.turnLeft();
      lisa.move();
      lisa.putBeeper();
      lisa.turnRight();
      lisa.move();
      lisa.putBeeper();
      lisa.move();
      lisa.putBeeper();
      lisa.turnRight();
      lisa.move();
      lisa.putBeeper();
      lisa.turnLeft();
      lisa.move();
      lisa.putBeeper();
      lisa.turnLeft();
      lisa.move();
      lisa.putBeeper();
      lisa.move();
      lisa.putBeeper();
      lisa.move();
      lisa.putBeeper();
      lisa.move();
      lisa.putBeeper();
      lisa.turnRight();
      lisa.move();
      lisa.putBeeper();
      lisa.move();
      lisa.putBeeper();
      
      
	}
}