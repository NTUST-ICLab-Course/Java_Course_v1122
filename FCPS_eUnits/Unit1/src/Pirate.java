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
        while(!nextToABeeper()) {
        	move();
        }
      }
       public int numOfBeepersInPile()
      {
    	   int nums=0;
        while(nextToABeeper()) {
        	pickBeeper();
        	nums++;
        }
        return nums;
      }
       public void turnAppropriately(int beepers)
      {
    	   if(beepers == 1) {
    		   turnLeft();
    	   }
    	   if(beepers == 2) {
    		   turnAround();
    	   }
    	   if(beepers == 3) {
    		   turnRight();
    	   }
      }
   }