public class SteepleChaseRacer extends Racer
{
    public SteepleChaseRacer(int y)
    {
        super(y);
    }

    public void jumpRight()
    {
        // pseudocode: tL, m, tR, m, tR, m, tL
        turnLeft();
        move();
        turnRight();
        move();
        turnRight();
        move();
        turnLeft();
    }
}
