import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener{

	JFrame frame=new JFrame();
	JButton loginButton = new JButton("Login");
	JButton ResetButton = new JButton("Reset");
	JTextField userIDField =new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel("userID:");
	JLabel userPasswordLabel = new JLabel("password:");
    JLabel messageLabel= new JLabel();
	HashMap<String,String> logininfo =new HashMap<String,String>();
		
	LoginPage(HashMap<String,String> loginInfoOriginal){
		
			
		logininfo =loginInfoOriginal;
		
		userIDLabel.setBounds(50,100,75,25);
		userPasswordLabel.setBounds(50,150,75,25);
		
		
		messageLabel.setBounds(125,250,250,35);
		messageLabel.setFont(new Font(null,Font.ITALIC ,25));
		
		userIDField.setBounds(125,100, 200, 25);
		userPasswordField.setBounds(123, 150,200, 25);
		
		loginButton.setBounds(125,200,100,25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		ResetButton.setBounds(225,200,100,25);
		ResetButton.setFocusable(false);
		ResetButton.addActionListener(this);
		
		
		frame.add(messageLabel);
		frame.add(userIDLabel);
		frame.add(userPasswordLabel);
		frame.add(userIDField);
		frame.add(userPasswordField);
		frame.add(loginButton);
        frame.add(ResetButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==ResetButton) {
			userIDField.setText("");
			userPasswordField.setText("");
		}
       if(e.getSource()==loginButton) {
    	   String userID= userIDField.getText();
    	   String password = String.valueOf(userPasswordField.getPassword())
    			   ;
    	  if(logininfo.containsKey(userID)) {
    		  if(logininfo.get(userID).equals(password)) {
    			  messageLabel.setForeground(Color.green);
    			  messageLabel.setText("Successful");
    			  frame.dispose();
    			  WelcomePage welcomePage= new WelcomePage(userID);
    			  
    		  }
    		  else {
    			  messageLabel.setForeground(Color.red);
    			  messageLabel.setText("Incorrect!!");
    			    
    		  }
    		  
    		  }
    	      else {
    	    	  messageLabel.setForeground(Color.red);
    			  messageLabel.setText("User not Found!!");
    	  }
       }
		
	}
	

}