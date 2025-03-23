public class Democrat extends MazeEscaper{

   public void walkDownCurrentSegment(){
      if(!leftIsClear() && frontIsClear() && !nextToABeeper()){
         move();
      }
   }
   
   public void turnToTheNextSegment(){
      if(leftIsClear()){
         turnLeft();
         move();
      }
      else{
         turnRight();
      }
   }
}