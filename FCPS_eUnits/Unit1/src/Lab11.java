import edu.fcps.karel2.Display;
public class Lab11{
   
   public static void main(String[] args){
      Display.openDefaultWorld();
      Display.setSize(36, 32);
      Display.setSpeed(10);
      
      new Zero(1,19).display();
      new One(7,19).display();
      new Two(13,19).display();
      new Three(19,19).display();
      new Four(25,19).display();
      new Five(1,9).display();
      new Six(7,9).display();
      new Seven(13,9).display();
      new Eight(19,9).display();
      new Nine(25,9).display();
   }
}