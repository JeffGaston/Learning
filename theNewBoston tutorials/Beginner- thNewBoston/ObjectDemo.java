import java.util.Scanner;
import java.util.Random;
import java.io.*;

class ObjectDemo{
   public static void main(String[] args){
   
      int maxNumbers, number;
      
      Scanner kb= new Scanner(System.in);
      Random rand= new Random();
      PrintWriter outputFile= new PrintWriter("numbers.txt");
      
      System.out.println("How many random numbers should I write? ");
      maxNumbers= kb.nextInt();
      for(int counter=0;counter< maxNumbers; counter++){
         number= rand.nextInt();
         outputFile.println(number);
      }
      outputFile.close();
      System.out.println("Done");
      
   }
}