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
      
   	public void workCorner(){
         
      }
      
      public void moveOneBlock(){
      
      }
      
      public void turnToTheRight(){
      
      }
      
      public void turnToTheNorth(){
      
      }
      
      public void run(){
         int [] counterArray = new int[10];
         for(int i = 0;i < counterArray.length;i++){
            while(nextToABeeper()){
               pickBeeper();
               counterArray[i]++;   
            }
            System.out.println(counterArray[i]);
            if(i>0){
               for(int j = 0;j < counterArray[i-1];j++){
                  putBeeper();
               }
            }
            move();
         }
      }
   }