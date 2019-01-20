public class MoreStringMethods{
   public static void main(String[] args){
      
      //indexof, returns -1 if not found
      String s = "jeffGastonjeffGastonjeffGaston";
      System.out.println(s.indexOf('f', 4));//indexOf "f" ignoring first 4 characters
      
      //another way to concat Strings
      String a = "Jeff ";
      String b = "Gaston";
      System.out.println(a.concat(b));
      
      //replace characters in string
      System.out.println(a.replace('f','b'));
   
   }
}