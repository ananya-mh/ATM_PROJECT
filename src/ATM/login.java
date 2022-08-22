package ATM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class login implements ActionListener{

private static JPanel panel = new JPanel();
private static JFrame frame = new JFrame();
private static JTextField userText;
private static JLabel passwordlabel;
private static JTextField passText;
private static JButton login;

public static void main(String[] args) {
		
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

passwordlabel = new JLabel("PIN");
passwordlabel.setBounds(10,50,80,25);
panel.add(passwordlabel);

passText = new JTextField(20);
passText.setBounds(100,50,165,25);
panel.add(passText);

login = new JButton("Login");
login.setBounds(100,80,80,25);
panel.add(login);
login.addActionListener(new login());

frame.setVisible(true);

}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	try {
	login_db log = new login_db();
	log.auth(userText.getText(), passText.getText());
	menu menuobj = new menu();
	menuobj.getmenu();	
}
	catch(Exception e) {
		
	}
}
} //ATM
