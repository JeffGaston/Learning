import java.io.*;
import java.lang.*;
import java.util.*;

public class WritingToFiles2{
   
   private Formatter x;
   
   public void openFile(){
      try{
         x = new Formatter("AAChinese.txt");
      }
      catch(Exception e){
         System.out.println("You have an error");
      }
   }
   
   public void addRecords(){
      x.format("%s%s%s", "20 ", "Jeff ", "Gaston ");
   }
   
   public void closeFile(){
      x.close();
   }
}