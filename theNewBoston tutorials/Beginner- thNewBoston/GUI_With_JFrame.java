import javax.swing.JFrame;

public class GUI_With_JFrame{//displays box based on OS to go with the look

   public static void main(String[]args){
      
      GUI_With_JFrame2 GUI = new GUI_With_JFrame2();
      GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Need this for clicking x button
      GUI.setSize(275, 180);
      GUI.setVisible(true);//allows you to see
      
   }
}