import edu.fcps.karel2.Display;
import edu.fcps.Digit;
public class Lab11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openDefaultWorld();
      Display.setSize(36, 32);
      Display.setSpeed(15);
      
      Zero zero = new Zero(1,30);
      zero.display(); 
        
      new One(7,30).display();        
      new Two(13,30).display();
      new Three(19,30).display();
      new Four(25,30).display();
      new Five(31,30).display();
      new Six(1,18).display();
      new Seven(7,18).display();
      new Eight(13,18).display();
      new Nine(20,18).display();
	}

}
