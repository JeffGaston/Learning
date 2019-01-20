import javax.swing.*;
import java.awt.*;
public class Gui{
   public static void main(String[] args){
      
      creatingWindows12_1();
   }
   public static void creatingWindows12_1(){
      JOptionPane.showMessageDialog(null, "Hello World");//displays message dialog 
      String name= JOptionPane.showInputDialog("Enter your name.");//displays input dialog. if user press OK button then name will refence the inputted string. if cancel button, then references null
      System.exit(0);//used when using JOptionPane(or classes that cause additional task to run in the JVM), causes the program to close faster.(May be used for threads too) The zero in the parameters indicates that the program ran succesfully
      
      JFrame window= new JFrame();//create a window
      window.setTitle("A simple Window");//Sets the title
      window.setSize(350, 250);//sets size in pixel. width, height
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Specifies what happens when the close button is clicked
      window.setVisible(true);//displays the window
      
   }
   /*Usually classes inherit from the Jframe class
   import javax.swing.*;
   public class SimpleWindow extends Jframe{
      public SimpleWindow(){
         final int WINDOW_WIDTH = 350; //in pixels
         final int WINDOW_HEIGHT = 250; //in pixels
         
         setTitle("A Simple Window");
         
         setSeize(WINDOW_WIDTH, WINDOW_HEIGHT);
         
         setDefaultCloseOperation(JFRAME.EXIT_ON_CLOSE);
         
         setVisible(true);  
      }
   }*/
   /*This class defines a GUI window and has its own main method
   import javax.swing.*;
   public class EmbeddedMain extends Jframe{
      final int WINDOW_WIDTH = 350; //in pixels
      final int WINDOW_HEIGHT = 250; //in pixels
      public EmbeddedMain(){
         
         setTitle("A Simple Window");
         
         setSeize(WINDOW_WIDTH, WINDOW_HEIGHT);
         
         setDefaultCloseOperation(JFRAME.EXIT_ON_CLOSE);
         
         setVisible(true);  
      }
      
      /**
         The main method creates an instance of the EmbeddedMain
         class, which causes it to display its window.
      **/
      
      /*
      public static void main(String[] args){
         new EmbeddedMain();//don't need a variable to reference instance of the class so just "new EmbeddedMain()" works
      }
   }*/
}