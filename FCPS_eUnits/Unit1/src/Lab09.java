import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;


public class Lab09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openWorld("../maps/first.map");
		Athlete oo = new Athlete(1, 1, Display.EAST, 0);
      String filename = JOptionPane.showInputDialog("What robot world?");
      Display.openWorld("../maps/" + filename + ".map");
      Display.setSize(10, 10);
      Display.setSpeed(1);
      
      
      int[] counter = new int[10];
      for(int i=0;i<10;i++){
         while(oo.nextToABeeper()){
            oo.pickBeeper();
            counter[i]++;
         }
         if(i>0){
            for(int k=0;k<counter[i-1];k++){
               oo.putBeeper();
            }
         }
         oo.move();
      }
       
      
      
      //test
	}

}
