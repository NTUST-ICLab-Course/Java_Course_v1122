import edu.fcps.karel2.Display;

public class Lab05{
   public static void runTheRace(Racer arg){
      arg.move();
      arg.jumpRight();
      arg.shuttle(2,7);
      arg.shuttle(2,5);
      arg.shuttle(2,3);
      arg.turnAround();
      arg.sprint(6);
      arg.jumpLeft();
      arg.move();
      arg.put(15);
      arg.turnAround();
      arg.move();
   }
   public static void main(String[] args){
      Display.openWorld("../maps/shuttle.map");
      Display.setSize(10,10);
      Display.setSpeed(9);
      Racer racer1 = new Racer(1);
      Racer racer2 = new Racer(4);
      Racer racer3 = new Racer(7);
      runTheRace(racer1);
      runTheRace(racer2);
      runTheRace(racer3);
   }
}