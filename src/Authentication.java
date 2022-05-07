import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;
import javax.swing.border.*;

@SuppressWarnings("serial")
public class Authentication extends JFrame 
{
	Connection conn;
	ResultSet rs;
	PreparedStatement pst;	
	private JTextField textField;
	private JPasswordField passwordField;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
					Authentication frame = new Authentication();										
					frame.setResizable(false);					
					frame.setTitle("PESU Bank");
					frame.setLocationRelativeTo(null);					
					frame.setVisible(true);
				} catch (Exception e) {
					System.out.println("Could not load System look.");
				} 
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Authentication() {
		super("Login");
		setTitle("PESU'22");
		setAlwaysOnTop(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 363);
		getContentPane().setLayout(null);
		
		
		
		conn = javaconnect.ConncrDB(); 
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 3), "Authentication", TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 24), new Color(0, 0, 0)));
		panel.setBounds(10, 11, 423, 291);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(100, 32, 224, 71);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Authentication.class.getResource("/images/Untitled-4.jpeg")));
		
		JLabel lblAccountNo = new JLabel("Username");
		lblAccountNo.setBounds(38, 149, 89, 20);
		panel.add(lblAccountNo);
		lblAccountNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAccountNo.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(38, 187, 89, 20);
		panel.add(lblPassword);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField = new JTextField();
		textField.setBounds(148, 150, 234, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String s1 = "admin";
					String a1 = textField.getText();
					
					String s2 = "123";
					@SuppressWarnings("deprecation")
					String a2 = passwordField.getText();
					
					if (s1.equals(a1) && s2.equals(a2)) {
						setVisible(false);
						MyPage ob = new MyPage();
						ob.setLocationRelativeTo(null);
						ob.setVisible(true);
					} else {
						JDialog dialog = new JDialog();
						dialog.setAlwaysOnTop(true);    
						JOptionPane.showMessageDialog(dialog, "Username or Password is incorrect" , null , JOptionPane.PLAIN_MESSAGE );
					}
				} catch (Exception e) {
					
				} 
				
			}
		});
		btnNewButton.setBounds(161, 247, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sign Up");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				Create_account ob = new Create_account();
				ob.setLocationRelativeTo(null);
				ob.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(276, 247, 101, 23);
		panel.add(btnNewButton_1);
		
		JLabel label = new JLabel("");
		label.setBounds(382, 149, 31, 23);
		panel.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(382, 188, 31, 19);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(148, 187, 234, 22);
		panel.add(passwordField);
		
	}
}