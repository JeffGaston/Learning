import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mouse_Events2 extends JFrame{
   private JPanel mousepanel;
   private JLabel statusbar;
   
   public Mouse_Events2(){
      super("The Title");
      
      mousepanel = new JPanel();
      mousepanel.setBackground(Color.WHITE);
      add(mousepanel, BorderLayout.CENTER);
      
      statusbar = new JLabel("Default");
      add(statusbar, BorderLayout.SOUTH);
      
      Mouse_Events3 handler = new Mouse_Events3();
      mousepanel.addMouseListener(handler);
      mousepanel.addMouseMotionListener(handler);
      
   }
   
   private class Mouse_Events3 implements MouseListener, MouseMotionListener{
      public void mouseClicked(MouseEvent event){
         statusbar.setText(String.format("Clicked at %d, %d", event.getX(), event.getY()));   
      }
      public void mousePressed(MouseEvent event){
         statusbar.setText("You pressed down the mouse");
      }
      public void mouseReleased(MouseEvent event){
         statusbar.setText("You released the button");
      }
      public void mouseEntered(MouseEvent event){
         statusbar.setText("You entered the area");
         mousepanel.setBackground(Color.RED);
      }
      public void mouseExited(MouseEvent event){
         statusbar.setText("The mouse has left the window");
         mousepanel.setBackground(Color.WHITE);
      }
      //these are mouse motion events
      public void mouseDragged(MouseEvent event){
         statusbar.setText("You are dragging the mouse");
      }
      public void mouseMoved(MouseEvent event){
         statusbar.setText("You moved the mouse");
      }
   }
}