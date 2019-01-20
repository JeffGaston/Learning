import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Adapter_Class2 extends JFrame{
   private String details;
   private JLabel statusbar;
   
   public Adapter_Class2(){
      super("The title");
      
      statusbar = new JLabel("This is default");
      add(statusbar, BorderLayout.SOUTH);
      addMouseListener(new Adapter_Class3());
   }
   
   private class Adapter_Class3 extends MouseAdapter{
      public void mouseClicked(MouseEvent event){
         details = String.format("You clicked %d ", event.getClickCount());
         
         if(event.isMetaDown()){
            details += "with right mouse button";
         }
         else if(event.isAltDown()){
            details += "with center mouse button";
         }
         else{
            details += "with left mouse button";
         }
         statusbar.setText(details);
      }
   }
}