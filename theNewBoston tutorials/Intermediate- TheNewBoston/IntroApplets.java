import java.awt.*;
import javax.swing.*;

public class IntroApplets extends JApplet{
   
   public void paint(Graphics g){
      super.paint(g);
      g.drawString("Wow this actually worked?", 25, 25); 
   }
}