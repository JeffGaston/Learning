import java.util.*;

//Collections are things like Sets, Lists, etc., unlike Arrays they are dynamic
public class IntroToCollections{
   
   public static void main(String[] args){
      String[] things = {"Eggs", "Lasers", "Hats", "Pie"};
      List<String> list1 = new ArrayList<String>();
      
      //add array items to list
      for(String x: things)
         list1.add(x);
         
      String[] moreThings= {"Lasers", "Hats"};
      List<String> list2= new ArrayList<String>();
      
      //add array items to list2
      for(String y: moreThings)
         list2.add(y);
       
      //print list1
      for(int i = 0; i < list1.size(); i++){
         System.out.printf("%s ", list1.get(i));
      }
      System.out.println();
      
      //print list2
      for(int i = 0; i < list2.size(); i++){
         System.out.printf("%s ", list2.get(i));
      }
   }
}