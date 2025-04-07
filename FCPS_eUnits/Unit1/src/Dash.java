import edu.fcps.Digit;

public class Dash extends Digit implements Runnable{

   public Dash(int x,int y){
      super(x,y);
   }
   public void run(){
      segment1_Off();
      segment2_Off();
      segment3_Off();
      segment4_Off();
      segment5_Off();
      segment6_Off();
      segment7_On();
   }
   public void display(){
      segment1_Off();
      segment2_Off();
      segment3_Off();
      segment4_Off();
      segment5_Off();
      segment6_Off();
      segment7_On();
   }
}