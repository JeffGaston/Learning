public class PublicPrivateThisApp{
   public static void main(String[] args){
      PPTClass PPTObject= new PPTClass();
      System.out.println(PPTObject.toM());
      System.out.println(PPTObject.toS());
      
      PPTObject.setT(13, 27, 6);
      System.out.println(PPTObject.toM());
      System.out.println(PPTObject.toS());
   }
}