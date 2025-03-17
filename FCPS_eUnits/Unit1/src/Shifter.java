	//Name______________________________ Date_____________
   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   public class Shifter extends Robot implements Runnable, Workable
   {
      private int myBeepers;
      public Shifter(int y)
      {
         super(1, y, Display.EAST, 0);
      
      }
   	@Override
      public void workCorner() {
          // TODO Auto-generated method stub
      }
      
      @Override
      public void moveOneBlock() {
          // TODO Auto-generated method stub
      }
      
      @Override
      public void turnToTheRight() {
          // TODO Auto-generated method stub
      }
      
      @Override
      public void turnToTheNorth() {
          // TODO Auto-generated method stub
      }
      
      @Override
      public void run() {
          // TODO Auto-generated method stub
         int[] counter = new int[10];
         for(int i=0;i<10;i++){
            while(nextToABeeper()){
               pickBeeper();
               counter[i]++;
            }
            if(i>0){
               for(int k=0;k<counter[i-1];k++){
                  putBeeper();
               }
            }
            move();

      }

   }
}