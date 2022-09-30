package ATM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class menu implements ActionListener{
	
	private static JPanel panel;
	private static JFrame frame;
	private static JButton balance;
	private static JButton deposit;
	private static JButton withdraw;
	private static JButton logout;
	
	
	public void getmenu()
{ 
	panel = new JPanel();
	frame = new JFrame();
	frame.setSize(400, 400);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.setLayout(null);
	

balance = new JButton(new AbstractAction("Check Balance") {

		@Override
		public void actionPerformed(ActionEvent e) {
			CheckBal bal = new CheckBal();
			bal.getbal();
			frame.dispose();
			
		}
}
);
balance.setBounds(150,80,130,25);
panel.add(balance);



deposit = new JButton(new AbstractAction("Deposit Funds") {

	@Override
	public void actionPerformed(ActionEvent e) {
		Update dep = new Update();
		dep.deposit();
		
	}
	
});
deposit.setBounds(150,120,130,25);
panel.add(deposit);


withdraw = new JButton(new AbstractAction("Withdraw Funds") {

	@Override
	public void actionPerformed(ActionEvent e) {
		Update with = new Update();
		with.withdraw();
		
	}
	
});
withdraw.setBounds(150,160,130,25);
panel.add(withdraw);


 logout = new JButton("Logout");
logout.setBounds(150,200,130,25);
panel.add(logout);

frame.setVisible(true);
}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}