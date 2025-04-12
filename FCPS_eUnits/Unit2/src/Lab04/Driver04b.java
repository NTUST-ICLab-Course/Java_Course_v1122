import javax.swing.*;
import edu.fcps.Bucket;
public class Driver04b
{
   public static void main(String args[])
   {
      JFrame frame = new JFrame("Buckets");
      frame.setSize(600, 400);
      frame.setLocation(100, 100);   
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new BucketPanel());
      frame.setVisible(true);
      Bucket.setSpeed(5);
      Bucket.useTotal(false);
      Bucket five = new Bucket(5);
      Bucket four = new Bucket(4);
      Bucket three = new Bucket(3);
      
      five.fill();//5
      five.pourInto(four);//5
      four.spill();//1
      five.pourInto(three);//1
      four.fill();//5
      five.fill();//10
      three.spill();//9
      four.spill();//5
      five.pourInto(three);//5
      three.spill();//2
      five.pourInto(three);//2
      four.fill();//6
      five.fill();//11
      three.fill();//12
      three.spill();//9
      four.pourInto(three);//9
      four.spill();//8
      five.spill();//3
      four.fill();//7
      three.spill();//4
   }
}