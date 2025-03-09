import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;
public class Lab09{
   public static void main(String[] args){
   
      String filename = JOptionPane.showInputDialog("What robot world?");
      Display.openWorld("../maps/"+filename+".map");
      Display.setSize(10, 10);
      Display.setSpeed(5);
      Athlete yifong = new Athlete(1,1,Display.EAST,0);
      int [] counterArray = new int[10];
      for(int i = 0;i < counterArray.length;i++){
         while(yifong.nextToABeeper()){
            yifong.pickBeeper();
            counterArray[i]++;   
         }
         System.out.println(counterArray[i]);
         if(i>0){
            for(int j = 0;j < counterArray[i-1];j++){
               yifong.putBeeper();
            }
         }
         yifong.move();
      }
   }
}