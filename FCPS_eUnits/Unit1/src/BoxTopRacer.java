public class BoxTopRacer extends Racer{
   
   public BoxTopRacer(){
   
   }
   
   public BoxTopRacer(int y){
      super(y);
   }
   
   public void jumpRight(){
      turnLeft();
      while(!rightIsClear()){
         move();
      }
      turnRight();
      move();
      while(!rightIsClear()){
         move();
      }
      turnRight();
      while(forntIsClear()){
         move();
      }
      turnLeft();
   }
}