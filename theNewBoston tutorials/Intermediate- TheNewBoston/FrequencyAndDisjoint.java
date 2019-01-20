import java.util.*;

public class FrequencyAndDisjoint{
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
      System.out.println();
         
      System.out.println(Collections.frequency(list2, "digg"));//returns frequncy of digg in list2
      
      boolean tof = Collections.disjoint(list1, list2);//returns true if nothing in common
      
      if(tof)
         System.out.println("These lists do not have anything in common");
      else
         System.out.println("These lists have something in common!");
   }
}