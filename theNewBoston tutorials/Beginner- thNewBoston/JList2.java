import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JList2 extends JFrame{
   
   private JList list;
   private static String[] colorNames = {"Black", "Blue", "Red", "White"};
   private static Color[] colors = {Color.BLACK, Color.BLUE, Color.RED, Color.WHITE};
   
   public JList2(){
      super("The Title");
      setLayout(new FlowLayout());
      
      list = new JList(colorNames);
      list.setVisibleRowCount(4);
      list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//Only one selection
      add(new JScrollPane(list));
      
      list.addListSelectionListener(
         new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event){
               getContentPane().setBackground(colors[list.getSelectedIndex()]);
            }
         }
      );
   }
}