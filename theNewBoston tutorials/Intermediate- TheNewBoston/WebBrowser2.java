import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class WebBrowser2 extends JFrame{
   
   private JTextField addressBar;
   private JEditorPane display;
   
   //constructor 
   public WebBrowser2(){
      super("The Browser");
      
      addressBar = new JTextField("enter a URL here!");
      addressBar.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent event){
               loadCrap(event.getActionCommand());//getActionCommand gets the String
            }
         }
      );
      add(addressBar, BorderLayout.NORTH);
      
      display = new JEditorPane();
      display.setEditable(false);//can't edit website content
      display.addHyperlinkListener(
         new HyperlinkListener(){
            public void hyperlinkUpdate(HyperlinkEvent event){
               if(event.getEventType() == HyperlinkEvent.EventType.ACTIVATED){
                  loadCrap(event.getURL().toString());
               }
            }
         }
      );
      add(new JScrollPane(display), BorderLayout.CENTER);
      setSize(500, 300);
      setVisible(true);
   }
   
   //load crap to display on the screen
   private void loadCrap(String userText){
      try{
         display.setPage(userText);
         addressBar.setText(userText);
      }catch(Exception e){
         System.out.println("Crap!");
      }
   }
}