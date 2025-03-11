public class BoxTopRacer extends Racer
{
    public BoxTopRacer(int y)
    {
        super(y);
    }

    public void jumpRight()
    {
        // pseudocode: tL, m, tR, m, tR, m, tL
        turnLeft();
        while(!rightIsClear()){
         move();
        }
        turnRight();
        move();
        
        while(!rightIsClear()){
         move();
        }
        
        turnRight();
        move();


        
        while(!rightIsClear() && frontIsClear()){
         move();
        
        }
        turnLeft();
    }

}
