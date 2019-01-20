import java.util.Scanner;

class Many_Methods_Instances{
   public static void main(String[] args){
      Scanner kb= new Scanner(System.in);
      Hi HiObject= new Hi();
      System.out.println("Enter name of first gf here: ");
      String temp= kb.nextLine();
      HiObject.setName(temp);
      HiObject.saying();
   }
}