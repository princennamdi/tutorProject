package postIO;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class login {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel_2;
	private JTextField textField_1;
	private JLabel lblNewLabel_3;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(167, 27, 221, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel.setBounds(32, 32, 114, 34);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(32, 93, 114, 40);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(167, 97, 221, 39);
		frame.getContentPane().add(textField_1);
		
		 
		lblNewLabel_3 = new JLabel("Token");
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(32, 159, 114, 34);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(167, 160, 221, 39);
		frame.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnNewButton.setBounds(221, 216, 167, 34);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
