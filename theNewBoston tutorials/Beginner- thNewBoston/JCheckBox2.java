import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBox2 extends JFrame{

   private JTextField tf;//Holds Textfield
   private JCheckBox boldbox;//Holds checkbox that says bold
   private JCheckBox italicbox;//Hold checkbox that says italics
   
   public JCheckBox2(){//Should have constructor to run GUIS
      super("The Title");//Title of Text Box
      setLayout(new FlowLayout());//Layout of text box
      
      tf = new JTextField("This is a sentence", 20);//Creates text field and populates
      tf.setFont(new Font("Serif", Font.PLAIN, 14));//sets the font for textBox
      add(tf);//adds it to window
      
      boldbox = new JCheckBox("Bold");//Creates box with bold name
      italicbox = new JCheckBox("Italics");//Creates box with Italics name
      add(boldbox);//adds to window
      add(italicbox);//adds to window
      
      JCheckBox3 handler = new JCheckBox3();//Object for handler class
      boldbox.addItemListener(handler);//events to be handled
      italicbox.addItemListener(handler);//events to be handled
   }
   
   private class JCheckBox3 implements ItemListener{
      
      public void itemStateChanged(ItemEvent event){
         Font font = null;
         
         if(boldbox.isSelected() && italicbox.isSelected()){
            font = new Font("Serif", Font.BOLD + font.ITALIC, 14);
         }
         else if(boldbox.isSelected()){
            font = new Font("Serif", Font.BOLD, 14);
         }
         else if(italicbox.isSelected()){
            font = new Font("Serif", Font.ITALIC, 14);
         }
         else{
            font = new Font("Serif", Font.PLAIN, 14);
         }
         
         tf.setFont(font);
      }
   }
}