package ATM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ProcessHandle.Info;

import javax.swing.*;

public class login implements ActionListener{

private static JPanel panel = new JPanel();
private static JFrame frame = new JFrame();
private static JTextField userText;
private static JLabel passwordlabel;
private static JPasswordField passText;
private static JButton login;
private static JLabel validText;
protected static String accno;

public static void main(String[] args){
	 login loginobj = new login();
	 loginobj.loginwindow(); 
}	

public void loginwindow() {
frame.setSize(400, 400);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.add(panel);
panel.setLayout(null);

JLabel userlabel = new JLabel("Acc. Number");
userlabel.setBounds(10, 20, 80, 25);
panel.add(userlabel);

userText = new JTextField(20);
userText.setBounds(100,20,165,25);
panel.add(userText);

passwordlabel = new JLabel("Pin");
passwordlabel.setBounds(10,50,80,25);
panel.add(passwordlabel);

passText = new JPasswordField(20);
passText.setBounds(100,50,165,25);
panel.add(passText);

login = new JButton("Login");
login.setBounds(100,80,80,25);
panel.add(login);
login.addActionListener(new login());

validText = new JLabel("");
validText.setBounds(100,120,185,25);
panel.add(validText);



frame.setVisible(true);

}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	try {
		
	login_db log = new login_db();  
	char[] pas = passText.getPassword();
	String passtring = new String(pas);
	
	accno = userText.getText();
	
	//int valid =0;
	int valid = log.auth(accno, passtring);  
 
	if(valid == 1)
	{
     menu menuobj = new menu();
	  menuobj.getmenu();	
	  frame.dispose();
}
	else
	{
		validText.setText("Login Unsuccessful");
	}
	}
	
	catch(Exception e1) 
	{
		e1.printStackTrace();
	}
}
} //ATM
