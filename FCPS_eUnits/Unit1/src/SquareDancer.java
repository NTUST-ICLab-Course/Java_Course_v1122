public class SquareDancer extends Dancer{
   public SquareDancer(int x, int y, int dir, int beep){
      super(x, y, dir, beep);
   }
   
   public SquareDancer(){
      
   }
   
   @Override
   public void danceStep(){
      for(int i=0;i<4;i++){
         move();
         move();
         turnLeft();
      }
   }
}