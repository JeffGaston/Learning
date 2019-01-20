public class Array_Holding_Objects5{
   
   private Array_Holding_Objects2[] thelist= new Array_Holding_Objects2[5];
   private int i = 0;
   
   public void add(Array_Holding_Objects2 a){
      if(i <thelist.length){
         thelist[i] = a;
         System.out.println("Animal added at index : " + i);
         i++;
      }
   }
}