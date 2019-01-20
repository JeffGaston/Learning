import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JColorChooser2 extends JFrame{
   
   private JButton b;
   private Color color = (Color.WHITE);
   private JPanel panel;
   
   public JColorChooser2(){
      super("The Title");
      panel = new JPanel();
      panel.setBackground(color);
      
      b = new JButton("Choose a Color");
      b.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent event){
               color = JColorChooser.showDialog(null, "Pick color", color);
               if(color == null)
                  color= (Color.WHITE);
                  
               panel.setBackground(color);
            }
         }
      );
      
      add(panel, BorderLayout.CENTER);
      add(b, BorderLayout.SOUTH);
      setSize(425, 150);
      setVisible(true);
   }
}