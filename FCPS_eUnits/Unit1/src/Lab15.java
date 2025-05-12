import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class Lab15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
      Display.setSize(15, 15);
      Display.setSpeed(8);
      
      Dancer dancer1 = new BackAndForthDancer(2,5,Display.NORTH,0);
      Dancer dancer2 = new SquareDancer(5,5,Display.NORTH,0);
      Dancer dancer3 = new SquareDancer_Larger(7,4,Display.NORTH,0);
      
      new Thread(dancer1).start();
      new Thread(dancer2).start();
      new Thread(dancer3).start();
	}

}
