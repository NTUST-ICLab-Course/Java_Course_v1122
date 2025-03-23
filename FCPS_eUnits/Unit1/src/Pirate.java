	//Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 4.16.2003

   import edu.fcps.karel2.Display;
    public class Pirate extends Athlete
   {
       public Pirate()
      {
        super(1,1,Display.EAST,0);
      }
       public void approachPile()
      {
        while(!nextToABeeper()){
            move();
        }
      }
       public int numOfBeepersInPile()
      {
        int num = 0;
        while(nextToABeeper()){
            pickBeeper();
            num++;
        }
        return num;
      }
       public void turnAppropriately(int beepers)
      {
         if(beepers == 1){
            turnLeft();
         }
         else if(beepers == 2){
            turnAround();
         }
         else if(beepers == 3){
            turnRight();
         }
      }
   }