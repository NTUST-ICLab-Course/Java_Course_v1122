import edu.fcps.karel2.Display;

public class Midterm3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openWorld("mop.map");
      Display.setSize(10, 10);
      Display.setSpeed(10);
      Athlete lisa = new Athlete(8, 1, Display.WEST,Display.INFINITY);
      int counter = 0;
      while(counter!=4){
         lisa.putBeeper();
         while(lisa.frontIsClear()){
            lisa.move();
            lisa.putBeeper();
         }
         lisa.turnAround();
         while(!lisa.leftIsClear()){
            lisa.move();
         }
         lisa.turnLeft();
         lisa.move();
         lisa.turnLeft();
         while(lisa.frontIsClear()){
            lisa.move();
         }
         lisa.turnAround();
         lisa.putBeeper();
         while(lisa.frontIsClear()){
            lisa.move();
            lisa.putBeeper();
            }
         lisa.turnAround();
         while(!lisa.rightIsClear()){
            lisa.move();
         }
         lisa.turnRight();
         lisa.move();
         lisa.turnRight();
         while(lisa.frontIsClear()){
            lisa.move();
         }
         lisa.turnAround();
         counter++;
         }
         lisa.putBeeper();
         while(lisa.frontIsClear()){
            lisa.move();
            lisa.putBeeper();
         }
         lisa.turnAround();
         while(!lisa.leftIsClear()){
            lisa.move();
         }
         lisa.turnLeft();
         lisa.move();
         lisa.turnLeft();
         while(lisa.frontIsClear()){
            lisa.move();
         }
         lisa.turnAround();
         lisa.putBeeper();
         while(lisa.frontIsClear()){
            lisa.move();
            lisa.putBeeper();
            }

         lisa.turnAround();
         counter = 0;
         
         while (counter !=4){
            while(lisa.frontIsClear()){
               lisa.pickBeeper();
               lisa.move();
            }
            lisa.pickBeeper();
            lisa.turnAround();
            while(!lisa.rightIsClear()){
               lisa.move();
            }
            lisa.turnRight();
            lisa.move();
            lisa.turnRight();
            while(lisa.frontIsClear()){
               lisa.move();
            }
            lisa.turnAround();
            while(lisa.frontIsClear()){
               lisa.pickBeeper();
               lisa.move();
            }
            lisa.pickBeeper();
            lisa.turnAround();
            while(!lisa.leftIsClear()){
               lisa.move();
            }
            lisa.turnLeft();
            lisa.move();
            lisa.turnLeft();
            while(lisa.frontIsClear()){
               lisa.move();
            }
            lisa.turnAround();
            counter++;
         }
         while(lisa.frontIsClear()){
               lisa.pickBeeper();
               lisa.move();
            }
            lisa.pickBeeper();
            lisa.turnAround();  
            while(!lisa.rightIsClear()){
               lisa.move();
            }
            lisa.turnRight();
            lisa.move();
            lisa.turnRight();
            while(lisa.frontIsClear()){
               lisa.move();
            }
            lisa.turnAround();
            while(lisa.frontIsClear()){
               lisa.pickBeeper();
               lisa.move();
            }
            lisa.pickBeeper();
            lisa.turnAround();     
      }
         
	}




