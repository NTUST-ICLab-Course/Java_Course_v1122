import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab04
{
  public static void takeTheField(Athlete arg)
  {
	arg.move();
	arg.move();
	arg.move();
	arg.move();
	arg.turnRight();
	arg.move();
	arg.move();
  }
  
  public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openWorld("../maps/arena.map");
      Display.setSize(10, 10);
      Display.setSpeed(10);
      Athlete athlete1 = new Athlete();
      Athlete athlete2 = new Athlete();
      Athlete athlete3 = new Athlete();
      Athlete athlete4 = new Athlete();
      Athlete athlete5 = new Athlete();
      Athlete athlete6 = new Athlete();
      Athlete coach = new Athlete(2,7,0,0);
      
      takeTheField(athlete1);
      athlete1.turnLeft();
      athlete1.move();
      athlete1.turnRight();
      athlete1.move();
      athlete1.turnRight();
      
      takeTheField(athlete2);
      athlete2.move();
      athlete2.move();
      athlete2.turnRight();
      
      takeTheField(athlete3);
      athlete3.move();
      athlete3.move();
      athlete3.move();
      athlete3.turnRight();
      
      takeTheField(athlete4);
      athlete4.move();
      athlete4.move();
      athlete4.move();
      athlete4.move();
      athlete4.turnRight();

      takeTheField(athlete5);
      athlete5.move();
      athlete5.move();
      athlete5.move();
      athlete5.move();
      athlete5.move();
      athlete5.turnLeft();
      athlete5.move();
      athlete5.turnAround();
      
      takeTheField(athlete6);
      athlete6.move();
      athlete6.move();
      athlete6.move();
      athlete6.turnLeft();
      athlete6.move();
      athlete6.move();
      athlete6.turnAround();
	}
}