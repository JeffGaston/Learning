import java.util.*;

public class ListsToArrays{
   public static void main(String[] args){
      
      String[] stuff = {"Babies", "Watermelon", "Melons", "Fudge"};
      LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));
      
      thelist.add("Pumpkin");
      thelist.addFirst("First thing");
      
      //convert back into an array
      stuff = thelist.toArray(new String[thelist.size()]);
      
      for(String x : stuff)
         System.out.printf("%s ", x);
   }
}