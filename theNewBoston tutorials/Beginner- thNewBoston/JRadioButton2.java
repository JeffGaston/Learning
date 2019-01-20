import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JRadioButton2 extends JFrame{

   private JTextField tf;
   private Font pf;
   private Font bf;
   private Font itf;
   private Font bitf;
   private JRadioButton pb;
   private JRadioButton bb;
   private JRadioButton ib;
   private JRadioButton bib;
   private ButtonGroup group;//Allows for one button to be selected at a time
   
   public JRadioButton2(){
      super("The Title");
      setLayout(new FlowLayout());
      
      tf = new JTextField("My name is Jeff", 25);
      add(tf);
      
      pb = new JRadioButton("Plain", true);//set one to true
      add(pb);
      bb = new JRadioButton("Bold", false);
      add(bb);
      ib = new JRadioButton("Italic", false);
      add(ib);
      bib = new JRadioButton("Bold and Italic", false);
      add(bib);
      
      group = new ButtonGroup();
      group.add(pb);
      group.add(bb);
      group.add(ib);
      group.add(bib);
      
      pf = new Font("Serif", Font.PLAIN, 14);
      bf = new Font("Serif", Font.BOLD, 14);
      itf = new Font("Serif", Font.ITALIC, 14);
      bitf = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
      
      tf.setFont(pf);
      
      //waits for event to happen, pass in font object to constructor
      pb.addItemListener(new JRadioButton3(pf));
      bb.addItemListener(new JRadioButton3(bf));
      ib.addItemListener(new JRadioButton3(itf));
      bib.addItemListener(new JRadioButton3(bitf));
      
   }
   
   private class JRadioButton3 implements ItemListener{
      private Font font;
      
      //the font object gets variable font
      public JRadioButton3(Font f){
         font = f;
      }
      
      //Sets the font to the font object that was passed in
      public void itemStateChanged(ItemEvent event){
         tf.setFont(font);
      }
   }
}