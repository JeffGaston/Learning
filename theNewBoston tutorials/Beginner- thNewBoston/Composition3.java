public class Composition3{
   private String name;
   private Composition2 birthday;
   
   public Composition3(String theName, Composition2 theDate){
      name = theName;
      birthday = theDate;
   }
   
   public String toString(){
      return String.format("My name is %s, my birthday is %s", name, birthday);
   }
}