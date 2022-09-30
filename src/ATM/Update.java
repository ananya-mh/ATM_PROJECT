package ATM;

import java.awt.event.ActionEvent;

import javax.swing.*;
public class Update {
	
	private static JPanel panel;
	private static JFrame frame;
	private static JButton depositbtn;
	private static JButton withdrawbtn;
	private static JTextField text;
	private static JLabel label;
	private static JLabel display;
	
	
	public void deposit() {

		panel = new JPanel();
		frame = new JFrame();
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);
		
		label = new JLabel("Enter amount to be deposited");
		label.setBounds(150,120,330,25);
		panel.add(label);
		
		text = new JTextField();
		text.setBounds(150,150,130,25);
		panel.add(text);
		
		depositbtn = new JButton(new AbstractAction("Deposit Amount") {

			@Override
			public void actionPerformed(ActionEvent e) {
				UpdateDB depositdb = new UpdateDB();
				depositdb.deposit(Integer.parseInt(text.getText()));
			}
			
		});
		
       depositbtn.setBounds(150,180,130,25);
       panel.add(depositbtn);
       
frame.setVisible(true);
	}
	
	public void withdraw() {
		panel = new JPanel();
		frame = new JFrame();
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);
		
		label = new JLabel("Enter amount to be withdrawn");
		label.setBounds(130,120,330,25);
		panel.add(label);
		
		text = new JTextField();
		text.setBounds(150,150,130,25);
		panel.add(text);

	       withdrawbtn = new JButton(new AbstractAction("Withdraw Amount") {

				@Override
				public void actionPerformed(ActionEvent e) {
					UpdateDB withdrawdb = new UpdateDB();
					withdrawdb.withdraw(Integer.parseInt(text.getText()));
				}
				
			});
			
	      withdrawbtn.setBounds(130,180,170,25);
	      panel.add(withdrawbtn);

frame.setVisible(true);

	      
	}

	
}
