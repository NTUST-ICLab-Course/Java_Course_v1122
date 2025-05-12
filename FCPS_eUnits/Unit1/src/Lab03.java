import edu.fcps.karel2.Display;

public class Lab03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openWorld("../maps/mountain.map");
      Display.setSize(16, 16);
      Display.setSpeed(10);
      Climber climber = new Climber(8);
      climber.turnRight();
      climber.move();
      climber.climbUpRight();
      climber.climbUpRight();
      climber.climbUpRight();
      climber.climbdownRight();
      climber.climbdownRight();
      climber.pickBeeper();
      climber.turnAround();
      climber.climbUpLeft();
      climber.climbUpLeft();
      climber.climbdownLeft();      
      climber.climbdownLeft();      
      climber.climbdownLeft();      
      climber.move();
            //testllll
	}

}
