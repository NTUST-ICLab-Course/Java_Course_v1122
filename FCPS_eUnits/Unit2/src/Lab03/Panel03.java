	//Name______________________________ Date_____________
   package Lab03;
   import java.awt.*;
   import javax.swing.JPanel;
   import java.awt.image.BufferedImage;
   import javax.swing.JOptionPane;
   
   public class Panel03 extends JPanel
   {
      private BufferedImage myImage;
      public Panel03()
      {
         //final int N = 400; //width & height of buffered-image
         String inputStr = JOptionPane.showInputDialog("width & height of buffered-image","400");
         if(inputStr == null){
            return;
         }
         
         int N = Integer.parseInt(inputStr);
         
         myImage = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
         Graphics buffer = myImage.getGraphics();
         
         inputStr = JOptionPane.showInputDialog("the number of lines","12");
         if(inputStr == null){
            return;
         }
         int line = Integer.parseInt(inputStr);

      	//webbing
         buffer.setColor(Color.BLUE);
         buffer.fillRect(0, 0, N, N);
         buffer.setColor(Color.YELLOW);
         for(int k = 0; k <= 50; k++)
         {
            buffer.drawLine(N * k / line, 0 , N , N * k / line);
            buffer.drawLine(N , N * k / line , N - N * k / line , N);
            buffer.drawLine(N - N * k / line , N , 0 , N - N * k / line);
            buffer.drawLine(0 , N - N * k / line , N * k / line , 0);
         }
      
      	//sunshine
         int x = N / 2, y = N / 2; //center
         int x1, y1;							//endpoint for each ray
         int size = 100;					//length of each ray
         int r1 = 60, r2 = 55;			//radius of the sun
         
         buffer.setColor(Color.YELLOW);
         inputStr = JOptionPane.showInputDialog("the number of lines","12");
         if(inputStr == null){
            return;
         }
         int ray = Integer.parseInt(inputStr);
         
         int increment;
         increment = 360 / ray;
         for(int i = 0;i <= 360;i += increment){
            x1 = (int)(x + size * Math.cos(i * Math.PI / 180));
            y1 = (int)(x + size * Math.sin(i * Math.PI / 180));
            buffer.drawLine(x,y,x1,y1);
         }
         buffer.drawLine(x,y,100,199);
         
         buffer.setColor(Color.BLUE.brighter());
         buffer.fillOval(x - r1, y - r1, r1 * 2, r1 * 2);
         buffer.setColor(Color.YELLOW);
         buffer.fillOval(x - r2, y - r2, r2 * 2, r2 * 2);	
      }
      public void paintComponent(Graphics g)
      {
         g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      }
   }