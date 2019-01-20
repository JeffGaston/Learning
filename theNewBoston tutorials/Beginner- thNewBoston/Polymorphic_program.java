
public class Polymorphic_program{
   
   public static void main(String[] args){
      
      Polymorphic_program2[] theList = new Polymorphic_program2[2];
      Polymorphic_program3 d= new Polymorphic_program3();
      Polymorphic_program4 f= new Polymorphic_program4();
      
      theList[0] = d;
      theList[1]= f;
      
      for(Polymorphic_program2 x: theList){
         x.noise();
      }
   }
}