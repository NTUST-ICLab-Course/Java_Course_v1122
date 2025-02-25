import edu.fcps.karel2.Display;

public class Lab02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openWorld("../maps/maze.map");
      Display.setSize(8, 8);
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
      //test
	}

}
