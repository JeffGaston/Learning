public class TimeClass_PublicPrivateAndThis{
   public static void main(String[] args){
      TimeClass TimeObject= new TimeClass();
      System.out.println(TimeObject.toMilitary());
      System.out.println(TimeObject.toString());
      
      System.out.println();
      
      TimeObject.setTime(22, 11, 11);
      System.out.println(TimeObject.toMilitary());
      System.out.println(TimeObject.toString());
      
      System.out.println();
      
      TimeObject.setTime2(22, 11, 11);
      System.out.println(TimeObject.toMilitary());
      System.out.println(TimeObject.toString());
   }
}