import java.util.*;

/*
   A Generic method performs the same action on all data types
   This helps to minimize overloaded methods
   when printMe is called, the compiler first searches for the printMe method that
      takes the same data type, then it looks for the generic method
*/

public class GenericMethods1{
   public static void main(String[] args){
      
      Integer[] iray = {1,2,3,4};
      Character[] cray= {'b', 'u', 'c', 'k', 'y'};
      
      printMe(iray);
      printMe(cray);
      
   }
   //generic method, have "<T>" before return type
   public static <T> void printMe(T[] x){
      for(T b : x)
         System.out.printf("%s ", b);
      System.out.println();
   }
}