import java.util.Scanner;

class Methods_Parameters{//Tutorial 15: Use Methods with Parameters
   public static void main(String[] args){
      Scanner kb= new Scanner(System.in);
      Hello HelloObject= new Hello();
      
      System.out.println("Please enter your name here: ");
      String name= kb.nextLine();
      
      HelloObject.message1(name);
   }
}