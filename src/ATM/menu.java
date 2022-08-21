package ATM;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class menu {
	public void getmenu()
{ 
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	frame.setSize(400, 400);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.setLayout(null);
	

JButton balance = new JButton("Check Balance");
balance.setBounds(150,80,130,25);
panel.add(balance);


JButton deposit = new JButton("Deposit Funds");
deposit.setBounds(150,120,130,25);
panel.add(deposit);


JButton withdraw = new JButton("Withdraw Funds");
withdraw.setBounds(150,160,130,25);
panel.add(withdraw);


JButton logout = new JButton("Logout");
logout.setBounds(150,200,130,25);
panel.add(logout);

frame.setVisible(true);
}
}