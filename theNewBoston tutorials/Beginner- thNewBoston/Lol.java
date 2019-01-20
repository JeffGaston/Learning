public class Lol{
   private String girlName;
   
   public Lol(String name){
      girlName= name;
   }
   public void setName(String name){
      girlName= name;
   }
   public String getName(){
      return girlName;
   }
   public void saying(){
      System.out.printf("Your first gf was %s", getName());
   }
}