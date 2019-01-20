//Recursion is a Method that calls itself. Needs a base case
//Base case is a base to build from. 5!, base case is 1 which is then 1 *2, 2* 3, 6 *...
public class Recursion1{
   
   //main
   public static void main(String[] args){
      
      System.out.println(fact(5));
   }
   //factorial
   public static long fact(long n){
      if(n <= 1)
         return 1;//base case
      else
         return n * fact(n - 1);
   }
}