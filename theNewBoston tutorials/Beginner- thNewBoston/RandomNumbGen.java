import java.util.Random;

class RandomNumbGen{
   public static void main(String[] args){
      Random dice= new Random();
      int number;
      
      for(int counter=1; counter<=10; counter++){
         number= 1+ dice.nextint(6);
         System.out.println(number +" ");
      }
   }
}