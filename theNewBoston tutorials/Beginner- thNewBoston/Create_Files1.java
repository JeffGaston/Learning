import java.util.*;

class Create_Files1{
   public static void main(String[] args){
      
      final Formatter x;
      
      try{
         x = new Formatter("AAfred.txt");
         System.out.println("You created a file");
      }
      catch(Exception e){
         System.out.println("You got an error");
      }
   }
}