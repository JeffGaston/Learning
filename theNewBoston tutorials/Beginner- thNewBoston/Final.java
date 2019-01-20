public class Final{
   public static void main(String[] args){
      Final2 finObject = new Final2(10);
      
      for(int i = 0; i < 5; i++){
         finObject.add();
         System.out.printf("%s", finObject);
      }
   }
}