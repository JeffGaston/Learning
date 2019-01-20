public class Final2{
   private final int NUMBER;
   private int sum;
   
   public Final2(int x){
      NUMBER= x;
   }
   public void add(){
      sum+= NUMBER;
   }
   public String toString(){
      return String.format("sum = %d\n", sum);
   }
}