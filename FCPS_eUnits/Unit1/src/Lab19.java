import edu.fcps.karel2.Display;

import javax.swing.JOptionPane;
	
public class Lab19{

   public static void main(String[] args){
      String filename = JOptionPane.showInputDialog("What robot world?");
      Display.openWorld("../maps/"+filename+".map");
      Display.setSize(10,10);
      Display.setSpeed(10);
      
      Dorothy yifong = new Dorothy();
      while(yifong.findPath()){
         yifong.followPath();  
      }
   }
}