import java.awt.*;
import java.awt.event.*;
import javax.swing.*;//doesn't import all the classes??
import javax.swing.JButton;
import javax.swing.event.*;

public class Multi_Selection_List2 extends JFrame{
   
   private JList leftlist;
   private JList rightlist;
   private JButton movebutton;
   private static String[] foods = {"Bacon", "Wings", "Ham", "Beef", "Cheese"};
   
   public Multi_Selection_List2(){
      super("The Title");
      setLayout(new FlowLayout());
      
      leftlist = new JList(foods);
      leftlist.setVisibleRowCount(3);
      leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
      add(new JScrollPane(leftlist));
      
      movebutton = new JButton("Move -->");//parameter "Move -->"
      movebutton.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent event){
               rightlist.setListData(leftlist.getSelectedValues());
            }
         }
      );
      add(movebutton);
      
      rightlist = new JList();
      rightlist.setVisibleRowCount(3);
      rightlist.setFixedCellWidth(100);
      rightlist.setFixedCellHeight(15);
      rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
      add(new JScrollPane(rightlist));
      
   }
}