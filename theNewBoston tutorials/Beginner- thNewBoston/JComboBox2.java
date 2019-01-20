import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComboBox2 extends JFrame{
   
   private JComboBox box;
   private JLabel pic;
   
   private static String[] fileName = {"A.png", "AA.png"};
   private Icon[] pics = {new ImageIcon(getClass().getResource(fileName[0])), new ImageIcon(getClass().getResource(fileName[1]))};
   
   public JComboBox2(){
      super("The Title");
      setLayout(new FlowLayout());
      
      box = new JComboBox(fileName);
      
      //anonymous inner class
      box.addItemListener(
         //decleration for anonymous inner class 
         new ItemListener(){//beginning of anynomous class
            public void itemStateChanged(ItemEvent event){
               if(event.getStateChange() == ItemEvent.SELECTED){
                  pic.setIcon(pics[box.getSelectedIndex()]);
               }
            }
         }//End of anonymous class
      );
      
      add(box);
      pic = new JLabel(pics[0]);
      add(pic);
   }
}