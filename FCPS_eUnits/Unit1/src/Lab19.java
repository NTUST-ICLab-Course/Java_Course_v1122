import javax.swing.JOptionPane;

import edu.fcps.karel2.Display;

public class Lab19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String filename = JOptionPane.showInputDialog("What robot world?");
        Display.openWorld("maps/"+filename+".map");
        Display.setSize(10, 10);
        Display.setSpeed(10);
		
		Dorothy dorothy = new Dorothy();
		while(dorothy.findPath()) {
			dorothy.followPath();
		}
	}

}
