import java.util.*;

public class HashSet1{
   public static void main(String[] args){
      
      String[] things= {"Apple", "Bob", "Ham", "Bob", "Bacon"};
      List<String> list = Arrays.asList(things);
      
      System.out.printf("%s ", list);
      System.out.println();
      
      Set<String> set = new HashSet<String>(list);
      System.out.printf("%s ", set);
   }
}