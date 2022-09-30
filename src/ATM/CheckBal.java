package ATM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBal implements ActionListener{

	private static JPanel panel;
	private static JFrame frame;
	private static JButton savbtn;
	private static JButton curbtn;
	private static JButton back;
	private static JButton logout;
	private static JLabel bal_label;

	CheckBalDB balobj = new CheckBalDB();
	
	public void getbal()
	{
		panel = new JPanel();
		frame = new JFrame();
		frame.add(panel);

		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLayout(null);
		
		bal_label = new JLabel("");
		bal_label.setBounds(250,240,130,25);
		panel.add(bal_label);
		
        savbtn = new JButton(new AbstractAction("Savings Account") {

			@Override
			public void actionPerformed(ActionEvent e) {
				String bal = balobj.savbal();
				bal_label.setText(bal);
				
			}
        	
        	
        	
        });
        savbtn.setBounds(150,120,130,25);
        panel.add(savbtn);
        
        curbtn = new JButton(new AbstractAction("Current Account") {

			@Override
			public void actionPerformed(ActionEvent e) {
					String bal = balobj.curbal();
					bal_label.setText(bal);
			}
        	
        });
        curbtn.setBounds(150,150,130,25);
        panel.add(curbtn);
        
        back = new JButton(new AbstractAction("Back") {

			@Override
			public void actionPerformed(ActionEvent e) {
            menu menuobj = new menu();
            menuobj.getmenu();
            frame.dispose();
				
			}
        	
        });
        back.setBounds(150,180,130,25);
        panel.add(back);
        
        logout = new JButton(new AbstractAction("Logout") {

			@Override
			public void actionPerformed(ActionEvent e) {
				login logobj = new login();
                logobj.loginwindow();
				frame.dispose();
			}
        	
        });
        logout.setBounds(150,210,130,25);
        panel.add(logout);
        

frame.setVisible(true);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
