public class Composition{
   public static void main(String[] args){
      Composition2 Comp2Obj= new Composition2(4, 5, 6);
      Composition3 Comp3Obj= new Composition3("Greg", Comp2Obj);
      
      System.out.println(Comp3Obj);
   }
}