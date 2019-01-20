public class MultiConstructors{
   public static void main(String[] args){
      
      MCApp MCAppObject= new MCApp();
      MCApp MCAppObject2= new MCApp(5);
      MCApp MCAppObject3= new MCApp(5, 13);
      MCApp MCAppObject4= new MCApp(5, 13, 43);
      
      System.out.printf("%s\n", MCAppObject.toMilitary());
      System.out.printf("%s\n", MCAppObject2.toMilitary());
      System.out.printf("%s\n", MCAppObject3.toMilitary());
      System.out.printf("%s\n", MCAppObject4.toMilitary());
   }
}