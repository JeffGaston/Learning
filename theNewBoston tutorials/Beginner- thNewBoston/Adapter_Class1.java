import javax.swing.JFrame;

public class Adapter_Class1{
   public static void main(String[] args){
      
      Adapter_Class2 go = new Adapter_Class2();
      go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      go.setSize(300,200);
      go.setVisible(true);
      
   }
}