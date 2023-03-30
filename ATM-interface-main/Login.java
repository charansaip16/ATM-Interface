import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login 
{

	private JFrame fromLoginScreen;
	private JTextField user;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try 
				{
					Login window = new Login();
					window.fromLoginScreen.setVisible(true);
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		fromLoginScreen = new JFrame();
		fromLoginScreen.setTitle("LOGIN");
		fromLoginScreen.setBounds(100, 100, 565, 411);
		fromLoginScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fromLoginScreen.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 12, 479, 306);
		fromLoginScreen.getContentPane().add(panel);
		panel.setLayout(null);
		
		user = new JTextField();
		user.setBounds(217, 92, 171, 29);
		panel.add(user);
		user.setColumns(10);
		
		pass = new JPasswordField();
		pass.setBounds(217, 147, 169, 29);
		panel.add(pass);
		
		JLabel lblUserName = new JLabel("User name ");
		lblUserName.setBounds(68, 92, 123, 29);
		panel.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(68, 147, 82, 29);
		panel.add(lblPassword);
		
		JButton btnVerify = new JButton("Verify");
		btnVerify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// get text  from user 
				String un = user.getText();
			 	@SuppressWarnings("deprecation")
				String pas=pass.getText();
		
				if(un.equals("Pranay")&&pas.equals("1234"))
				{
					JOptionPane.showMessageDialog(null,"Login succesfull\n\n");
			  
					 new ATM();
				}
				else if(un.equals("Charan")&&pas.equals("1111"))
				{
					JOptionPane.showMessageDialog(null,"Login succesfull\n\n");
			     
					new ATM();
				}
				else if(un.equals("Divin")&&pas.equals("4321"))
				{
					JOptionPane.showMessageDialog(null,"Login succesfull\n\n");
			      new ATM(); 
				}
				else if(un.equals("Pranav")&&pas.equals("1234"))
				{
					JOptionPane.showMessageDialog(null,"Login succesfull\n\n");
			      new ATM();
				}
				else 
				{
					JOptionPane.showMessageDialog(null,"Login Failed\n\ninvalid username or password \n\n");
				}
		}
			
		});
		btnVerify.setBounds(243, 244, 117, 25);
		panel.add(btnVerify);
	}
}