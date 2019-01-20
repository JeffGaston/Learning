import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;

public class FlowLayout2 extends JFrame{
   
   private JButton lb;
   private JButton cb;
   private JButton rb;
   private FlowLayout layout;
   private Container container;
   
   public FlowLayout2(){
      super("The Title");
      layout = new FlowLayout();
      container = getContentPane();
      setLayout(layout);
      
      //left stuff
      lb = new JButton("Left");
      add(lb);
      lb.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent event){
               layout.setAlignment(FlowLayout.LEFT);
               layout.layoutContainer(container);
            }
         }
      );
      
      //center stuff
      cb = new JButton("Center");
      add(cb);
      cb.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent event){
               layout.setAlignment(FlowLayout.CENTER);
               layout.layoutContainer(container);
            }
         }
      );
      
      //right stuff
      rb = new JButton("Right");
      add(rb);
      rb.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent event){
               layout.setAlignment(FlowLayout.RIGHT);
               layout.layoutContainer(container);
            }
         }
      );
   }
}