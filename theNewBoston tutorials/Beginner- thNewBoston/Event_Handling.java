import javax.swing.JFrame;

public class Event_Handling{//code that reacts to what user does. event= user actions
   
   public static void main(String[] args){
      
      Event_Handling2 hand = new Event_Handling2();
      hand.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      hand.setSize(350, 100);
      hand.setVisible(true);
   }
}