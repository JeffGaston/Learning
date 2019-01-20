import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Drawing_Graphics2 extends JPanel{
   
   public void paintComponent(Graphics g){
      super.paintComponent(g);
      this.setBackground(Color.WHITE);
      
      g.setColor(Color.BLUE);
      g.fillRect(25, 25, 100, 30);//x, y, width, height
      
      g.setColor(new Color(190,81,215));//RGB custom coloring
      g.fillRect(25, 65, 100, 30);
      
      g.setColor(Color.RED);
      g.drawString("This is some text", 25, 120);//iterator, x, y
      
   }
}