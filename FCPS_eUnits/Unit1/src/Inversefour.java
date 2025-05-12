import edu.fcps.Digit;

public class Inversefour extends Digit{

   public Inversefour(int x, int y){
      super(x, y);
   } 
     
   @Override
   public void display(){
      segment1_Off();
      segment2_On();
      segment3_Off();
      segment4_Off();
      segment5_On();
      segment6_On();
      segment7_On();   
   }
}