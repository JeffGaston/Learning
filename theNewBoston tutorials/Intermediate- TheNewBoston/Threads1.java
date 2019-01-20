public class Threads1{
   public static void main(String[] args){
      
      Thread t1 = new Thread(new Threads2("One"));//Parameter class must implement runnable
      Thread t2 = new Thread(new Threads2("Two"));
      Thread t3 = new Thread(new Threads2("Three"));
      Thread t4 = new Thread(new Threads2("Four"));
      
      t1.start();//calls the run method
      t2.start();
      t3.start();
      t4.start();
   }
}