import java.util.*;

public class GenericReturnTypes{
   public static void main(String[] args){
      
      System.out.println(max(23,42, 1));
      //Compares the first char of each string to find which comes last(ASCII)
      System.out.println(max("Apples", "Tots", "Chicken"));  
   }
   
   public static <T extends Comparable<T>> T max(T a, T b, T c){
      T m = a;//assum that a is the largest
      
      if(b.compareTo(a) > 0)//if less return negative, if equal return 0, if greater return positive num
         m= b;
      
      if(c.compareTo(m) > 0)
         m = c;
      
      return m;
   } 
}