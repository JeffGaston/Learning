import java.awt.FlowLayout;//gives layout
import java.awt.event.ActionListener;//listens for action
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class Event_Handling2 extends JFrame{//code that reacts to what user does. event= user actions
   
   private JTextField item1;
   private JTextField item2;
   private JTextField item3;
   private JPasswordField passwordField;
   
   public Event_Handling2(){//creates window
      super("The Title");//title for window
      setLayout(new FlowLayout());
      
      
      item1 = new JTextField(10);
      add(item1);
      
      item2 = new JTextField("Enter text here");
      add(item2);
      
      item3 = new JTextField("uneditable", 20);
      item3.setEditable(false);//makes textfield uneditable
      add(item3);
      
      passwordField = new JPasswordField("mypass");
      add(passwordField);
      
      Event_Handling3 handler = new Event_Handling3();//builds an action listener object
      item1.addActionListener(handler);
      item2.addActionListener(handler);
      item3.addActionListener(handler);
      passwordField.addActionListener(handler);
      
   }
   
   private class Event_Handling3 implements ActionListener{//class that handles the events
      
      public void actionPerformed(ActionEvent event){
         
         String string = "";
         
         if(event.getSource() == item1)
            string = String.format("field 1: %s", event.getActionCommand());//get the text from event
         else if(event.getSource() == item2)
            string = String.format("field 2: %s", event.getActionCommand());
         else if(event.getSource() == item3)
            string = String.format("field 3: %s", event.getActionCommand());
         else if(event.getSource() == passwordField)
            string = String.format("password field is : %s", event.getActionCommand());
         
         JOptionPane.showMessageDialog(null, string);
      }
   }
}