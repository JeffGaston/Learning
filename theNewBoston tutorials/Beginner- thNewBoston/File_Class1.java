import java.io.File;

public class File_Class1{
   public static void main(String[] args){
      
      File x = new File("AAJeff.txt");//put two back slashes when working with file paths for Windows
      
      if(x.exists())
         System.out.println(x.getName() + " exists!");
         
      else
         System.out.println("This thing doesn't exist");
   }
}