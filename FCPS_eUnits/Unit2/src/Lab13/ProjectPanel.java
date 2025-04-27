import javax.swing.*;
import java.awt.*;
import java.awt.image.*;

public class ProjectPanel extends JPanel
{
   private static final ImageIcon THOMAS = new ImageIcon("tj.jpg");
   private BufferedImage myImage;
   private Graphics2D myBuffer;
   private Timer t1, t2;
   private int xPos;

   public ProjectPanel()
   {
      xPos = 50;
      myImage = new BufferedImage(700, 500, BufferedImage.TYPE_INT_RGB);
      myBuffer = (Graphics2D)myImage.getGraphics();
      t1 = new Timer(100, new Listener1());
      // ...
   }
}
