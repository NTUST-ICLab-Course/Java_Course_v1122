import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class Climber extends Athlete
{
    public Climber()
    {
        super();
    }

    public Climber(int x)
    {
        super(x, 1, Display.NORTH, 1);
    }

    public void climbUpRight()
    {
        // pseudocode: tL, m, m, tR, m
        turnLeft();
        move();
        move();
        turnRight();
        move();
    }
    public void climbUpLeft()
    {
        // pseudocode: tL, m, m, tR, m
        turnRight();
        move();
        move();
        turnLeft();
        move();
    }
    public void climbdownLeft()
    {
        // pseudocode: tL, m, m, tR, m
        move();
        turnLeft();
        move();
        move();
        turnRight();
    }
    public void climbdownRight()
    {
        // pseudocode: tL, m, m, tR, m
        move();
        turnRight();
        move();
        move();
        turnLeft();
    }

    // You must write three other instance methods.
}
