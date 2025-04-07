import edu.fcps.Digit;

public class OppFour extends Digit implements Runnable{

   public OppFour(int x,int y){
      super(x,y);
   }
   public void run(){
      segment1_Off();
      segment2_On();
      segment3_Off();
      segment4_Off();
      segment5_On();
      segment6_On();
      segment7_On();
   }
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