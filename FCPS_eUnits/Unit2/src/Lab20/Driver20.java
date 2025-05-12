import javax.swing.JFrame;

public class Driver20 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Unit2, Lab19: Array of Prize");
        frame.setSize(800, 800);
        frame.setLocation(0, 0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new PrizePanel());
        frame.setVisible(true);
    }
}
