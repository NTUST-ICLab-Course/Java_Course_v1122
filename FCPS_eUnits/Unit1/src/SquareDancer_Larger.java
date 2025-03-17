public class SquareDancer_Larger extends Dancer{
   public SquareDancer_Larger(int x, int y, int dir, int beep){
      super(x, y, dir, beep);
   }
   
   public SquareDancer_Larger(){
      
   }
   
   @Override
   public void danceStep(){
      for(int i=0;i<4;i++){
         move();
         move();
         move();
         move();
         turnLeft();
      }
   }
}