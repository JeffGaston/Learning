import java.util.*;

public class Collections_Method_sort{
   
   public static void main(String[] args){
      
      String[] crap = {"Apples", "Lemons", "Geese", "Bacon", "YouTube"};
      List<String> l1 = Arrays.asList(crap);
      
      Collections.sort(l1);
      System.out.printf("%s\n", l1);// puts an an entire list as one string and then new line
      
      Collections.sort(l1, Collections.reverseOrder());
      System.out.printf("%s/n", l1);
   }
}