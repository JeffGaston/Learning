import java.awt.*;
import javax.swing.*;

public class initForApplets extends JApplet{
   
   private double sum;
   
   public void init(){
      String fn= JOptionPane.showInputDialog("Enter first number");
      String sn= JOptionPane.showInputDialog("Enter first number");
      
      double n1 = Double.parseDouble(fn);
      double n2 = Double.parseDouble(sn);
      
      sum = n1+ n2;
   }
   
   public void paint(Graphics g){
      super.paint(g);
      g.drawString("The sum is "+ sum, 25, 30);
   }
}