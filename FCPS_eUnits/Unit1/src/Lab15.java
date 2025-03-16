import edu.fcps.karel2.Display;
public class Lab15{
   
   public static void main(String[] args){
      Display.setSize(15, 15);
      Display.setSpeed(5);
      
      Dancer yifong = new BackAndForthDancer(2,5,Display.NORTH,0);
      Dancer tony = new SquareDancer(5,5,Display.NORTH,0);
      Dancer morris = new SquareDancer_Larger(5,5,Display.NORTH,0);  
          
      new Thread(yifong).start();
      new Thread(tony).start();
      new Thread(morris).start();
   }
}