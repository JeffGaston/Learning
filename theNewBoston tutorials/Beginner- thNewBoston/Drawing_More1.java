import javax.swing.JFrame;
import java.awt.*;

public class Drawing_More1{
   public static void main(String[] args){
      
      JFrame f = new JFrame("The Title");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Drawing_More2 p = new Drawing_More2();
      p.setBackground(Color.WHITE);
      f.add(p);
      f.setSize(500, 270);
      f.setVisible(true);
      
   }
}