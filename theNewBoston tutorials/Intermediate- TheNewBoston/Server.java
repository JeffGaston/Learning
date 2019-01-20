import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Server extends JFrame {
	
	private JTextField userText;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private ServerSocket server;
	private Socket connection;
	
	//constructor
	public Server(){
		super("Bucky's Instant Messenger Server");
		userText = new JTextField();
		userText.setEditable(false);
		userText.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent event){
					sendMessage(event.getActionCommand());
					userText.setText("");
				}
			}
		);
		add(userText, BorderLayout.NORTH);
		chatWindow = new JTextArea();
		add(new JScrollPane(chatWindow));
		setSize(300, 150); //Sets the window size
		setVisible(true);
	}
	
	public void startRunning(){
		try{
			server = new ServerSocket(6789, 100); //6789 is a dummy port for testing, this can be changed. The 100 is the maximum people waiting to connect.
			while(true){
				try{
					//Trying to connect and have conversation
					waitForConnection();
					setupStreams();
					whileChatting();
				}catch(EOFException eofException){
					showMessage("\n Server ended the connection! ");
				} finally{
					closeCrap();
				}
			}
		} catch (IOException ioException){
			ioException.printStackTrace();
		}
	}
	//wait for connection, then display connection information
	private void waitForConnection() throws IOException{
		showMessage(" Waiting for someone to connect... \n");
		connection = server.accept();
		showMessage(" Now connected to " + connection.getInetAddress().getHostName());
	}
	
   //get stream to send and receiver data
   private void setupStreams() throws IOException{
      output = new ObjectOutputStream(connection.getOutputStream());
      output.flush();
      input = new ObjectInputStream(connection.getInputStream());
      showMessage("\n Streams are now setup! \n");
   }
   
   //during the chat conversesation
   private void whileChatting() throws IOException{
      String message = " You are now connected! ";
      sendMessage(message);
      ableToType(true);
      
     do{
      //have a conversation
      try{
         message = (String) input.readObject();
         showMessage("\n " + message);
      }catch(ClassNotFoundException classNotFoundException){
         showMessage("\n I don't know what the user sent!");
      }
     }while(!message.equals("CLIENT - END"));
   }
   
   //close streams and sockets after you are done chatting
   public void closeCrap(){
      showMessage("\n Closing connections... \n");
      ableToType(false);
      try{
         output.close();
         input.close();
         connection.close();
      }catch(IOException ioException){
         ioException.printStackTrace();
      }
   }
   
   //send a message to client
   private void sendMessage(String message){
      try{
         output.writeObject("SERVER - "+ message);
         output.flush();
         showMessage("\nSERVER - "+ message);
      }catch(IOException ioException){
         chatWindow.append("\n ERROR: DUDE I CAN'T SEND THAT MESSAGE");
      }
   }
   
   //updates chatWindow
   private void showMessage(final String text){
      //set aside a thread to update a part of the GUI rather than whole thing
      SwingUtilities.invokeLater(
         new Runnable(){
           public void run(){
            chatWindow.append(text);
           }
         }
      );
   }
   
   //Allow user to type into their textbox
   public void ableToType(final boolean tof){
      SwingUtilities.invokeLater(
         new Runnable(){
           public void run(){
            userText.setEditable(tof);
           }
         }
      );
   }
}