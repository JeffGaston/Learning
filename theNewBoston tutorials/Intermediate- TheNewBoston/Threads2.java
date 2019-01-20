import java.util.*;

//Runnable interface contains run() method
public class Threads2 implements Runnable{
   String name;
   int time;
   Random r = new Random();
   
   public Threads2(String x){
      name = x;
      time = r.nextInt(999);//in milliseconds
   }
   
   public void run(){
      try{
         System.out.printf("%s is sleeping for %d\n", name, time);
         Thread.sleep(time);//Sleep means for the thread to do nothing for the time
         System.out.printf("%s is done\n", name);
      }catch(Exception e){
         
      }
   }
}