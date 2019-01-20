import javax.swing.JFrame;

public class Drawing_Graphics1{
   public static void main(String[] args){
      
      JFrame f = new JFrame("The Title");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Drawing_Graphics2 p = new Drawing_Graphics2();
      f.add(p);
      f.setSize(400,250);
      f.setVisible(true);
      
   }
}