import java.util.*;

public class addAll1{
   public static void main(String[] args){
      
      //Convert stuff array to a list
      String[] stuff = {"Apples", "Beef", "Corn", "Ham"};
      List<String> list1 = Arrays.asList(stuff);
      
      ArrayList<String> list2 = new ArrayList<String>();
      list2.add("Youtube");
      list2.add("Google");
      list2.add("Digg");
      
      for(String x: list2)
         System.out.printf("%s ", x);
      System.out.println();
         
      Collections.addAll(list2, stuff);
      
      for(String x: list2)
         System.out.printf("%s ", x);
   }
}