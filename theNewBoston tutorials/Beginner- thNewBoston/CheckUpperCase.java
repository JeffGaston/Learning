import java.util.Scanner;
import java.lang.*;
public class CheckUpperCase{
   public static void main(String[] args){
   
   char ch1= 'K', ch2= 'k';
   boolean b1, b2;
   b1= Character.isUpperCase(ch1);
   b2= Character.isUpperCase(ch2);
   
   String str1= ch1 + " is uppercase char is "+ b1;
   String str2= ch2 + " is uppercase char is "+ b2;
   
   System.out.println(str1);
   System.out.println(str2);
   }
}