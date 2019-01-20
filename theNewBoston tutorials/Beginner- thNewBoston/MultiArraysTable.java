public class MultiArraysTable{
   public static void main(String[] args){
      int multi[][]= {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
      int multi2[][]= {{11, 12, 13, 14, 15}, {16, 17, 18}, {19, 20, 21, 22}};
      
      System.out.println("This is my first array");
      display(multi);
      
      System.out.println("\nThis is my second array");
      display(multi2);
   }
   
   public static void display(int lol[][]){
      for(int row= 0; row < lol.length; row++){
         for(int column= 0; column < lol[row].length; column++){
            System.out.print(lol[row][column] + "\t");
         }
         System.out.println();
      }
   }
}