   public class StepClimber extends Climber {
   public StepClimber(){
   }

    public StepClimber(int x)
    {
        super(x);
    }

    public void climbUpRight()
    {
        // pseudocode: tL, m, m, tR, m
        turnLeft();
        move();
        turnRight();
        move();
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

   }