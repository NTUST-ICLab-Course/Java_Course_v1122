import edu.fcps.Bucket;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Driver4a{
       public static void main(String[] args) {
        JFrame frame = new JFrame("Buckets");
        frame.setSize(600, 400);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new BucketPanel());
        frame.setVisible(true);
        Bucket.setSpeed(5);
        Bucket.useTotal(true);
        Bucket five = new Bucket(5);
        Bucket three = new Bucket(3);
        
        three.fill();            // 3(3) 5(0)
         three.pourInto(five);    // 3(0) -> 5(3)
         three.fill();            // 3(3) 5(3)
         three.pourInto(five);    // 3(1) -> 5(5)
         five.spill();           // 3(0) 5(5)
         five.fill();             // 3(0) 5(5)
         three.spill();
         five.pourInto(three);
         three.spill();
         five.pourInto(three);
         five.fill();
         five.pourInto(three);
         three.spill();
         five.fill();
         three.fill();      
    }
}
