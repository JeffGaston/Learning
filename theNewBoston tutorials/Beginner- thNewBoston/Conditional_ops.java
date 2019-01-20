import java.lang.*;
class Conditional_ops{
   public static void main(String[] args){
      int age= 21;
      String apple= "Hello";
      
      int x = 1;
      int y = 2;
      int z = 3;
      
      System.out.println(Math.min(Math.min(x, y), z));
      System.out.println(age >50 ? "You are old" : "You are young");//boolean checks if true or false and is told what to do
   }
}