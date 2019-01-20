import java.util.EnumSet;

public class EnumSet_Range{
   public static void main(String[] args){
       for(EnumSet_Range2 people: EnumSet_Range2.values())
         System.out.printf("%s \t %s \t %s \n", people, people.getDesc(), people.getYear());
       
       System.out.println("\nAnd now for the range of constants!!\n");
       
       for(EnumSet_Range2 people : EnumSet.range(EnumSet_Range2.kelsey, EnumSet_Range2.candy))
       System.out.printf("%s \t %s \t %s \n", people, people.getDesc(), people.getYear());
   }   
}