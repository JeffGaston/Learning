import java.awt.FlowLayout;
import javax.swing.JFrame;//gives basic window
import javax.swing.JLabel;//output texts on the screen

public class GUI_With_JFrame2 extends JFrame{//inherit from JFrame
   
   private JLabel item1;
   
   public GUI_With_JFrame2(){
      super("The title bar");//title 
      setLayout(new FlowLayout());//default layout
      
      item1 = new JLabel("this is a sentence");
      item1.setToolTipText("This is gonna show up on hover");
      add(item1);//adds the item to the window
   }
}