public class Enumeration{
   public static void main(String[] args){
      for(Enumeration2 people: Enumeration2.values())
         System.out.printf("%s \t %s \t %s \n", people, people.getDesc(), people.getYear());
   }
}