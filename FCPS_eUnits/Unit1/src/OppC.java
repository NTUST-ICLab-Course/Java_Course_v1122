import edu.fcps.Digit;

public class OppC extends Digit implements Runnable{

   public OppC(int x,int y){
      super(x,y);
   }
   public void run(){
      segment1_On();
      segment2_On();
      segment3_On();
      segment4_On();
      segment5_Off();
      segment6_Off();
      segment7_Off();
   }
   public void display(){
      segment1_On();
      segment2_On();
      segment3_On();
      segment4_On();
      segment5_Off();
      segment6_Off();
      segment7_Off();
   }

}