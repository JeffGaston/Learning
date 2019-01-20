public class Abstract_and_Concrete_Classes5{
   private Abstract_and_Concrete_Classes3[] thelist = new Abstract_and_Concrete_Classes3[5];
   private int i= 0;
   
   public void add(Abstract_and_Concrete_Classes3 d){
      if(i < thelist.length){
         thelist[i] = d;
         System.out.println("Dog added at index : " + i);
         i++;
      }
   }
}