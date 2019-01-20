import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JButton2 extends JFrame{
   
   private JButton reg;
   private JButton custom;
   
   public JButton2(){
      super("The Title");//adds title to the window
      setLayout(new FlowLayout());//default layout
      
      reg = new JButton("Regular Button");//adds text to button
      add(reg);//Actually adds the button to the window
      
      Icon b = new ImageIcon(getClass().getResource("A.png"));//stores images in Icon obj
      Icon x = new ImageIcon(getClass().getResource("AA.png"));//^^^
      custom = new JButton("Custom", b);//sets default image without roll over
      custom.setRolloverIcon(x);//sets what it looks like when rolled over
      add(custom);//Adds button to window
      
      JButton3 handler = new JButton3();//created class to handle events
      reg.addActionListener(handler);//add functionality to button
      custom.addActionListener(handler);//add functionality to button
      
   }
   
   private class JButton3 implements ActionListener{
      
      public void actionPerformed(ActionEvent event){
         JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
      }
   }
}