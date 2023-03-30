import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class ATM 
{

	private JFrame frame;
	private JTextField textField;
	private JTextField tf2;
   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		new ATM();
	}

	/**
	 * Create the application.
	 */
	public ATM() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 565, 400);
		frame.setTitle("Main menu");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		textField = new JTextField();
		textField.setBounds(69, 67, 209, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton bt1 = new JButton("With draw");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) 
			{
			     
				int balance=100000 ;  
				try {
					int n1  = Integer.parseInt(textField.getText());
					if(balance>=n1) 
					{
					balance = balance - n1;
					tf2.setText(""+balance);
					JOptionPane.showMessageDialog(null,"\n Your session is completed only one operation can be selected please exit  ");
					}
					else {
						JOptionPane.showMessageDialog(null,"\n Amount is greater than the balance withdraw not possible");

					}
					}
					
				catch(Exception e)
				{
	      		JOptionPane.showMessageDialog(null,"there is an error in the input ");
				}
			}
		});
		bt1.setBounds(36, 158, 117, 25);
		frame.getContentPane().add(bt1);
		
		JButton bt2 = new JButton("Deposit");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				 int balance=100000; 
					try {
						int n1  = Integer.parseInt(textField.getText());
						if(n1<=10000) 
						{
						balance = balance + n1;
						tf2.setText(""+balance);
						JOptionPane.showMessageDialog(null,"\n Your session is completed only one operation can be selected please exit  ");
						}
						else {
					    JOptionPane.showMessageDialog(null,"\n Cannot insert value more than 10,000 ");

						}
						}
					catch(Exception e)
					{
		      		JOptionPane.showMessageDialog(null,"there is an error in the input ");
					}
			}
		});
		bt2.setBounds(197, 158, 117, 25);
		frame.getContentPane().add(bt2);
		
		JButton bt4 = new JButton("EXIT");
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				System.exit(0);
			}
		});
		bt4.setBounds(123, 229, 117, 25);
		frame.getContentPane().add(bt4);
		
		JLabel lblEnterTheNumber = new JLabel("Enter the Amount  ");
		lblEnterTheNumber.setBounds(69, 45, 149, 25);
		frame.getContentPane().add(lblEnterTheNumber);
		
		JLabel lblBalance = new JLabel("Balance ");
		lblBalance.setBounds(370, 50, 70, 15);
		frame.getContentPane().add(lblBalance);
		
		tf2 = new JTextField();
		tf2.setBounds(380, 67, 156, 33);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		tf2.setText(""+100000);
	}

}