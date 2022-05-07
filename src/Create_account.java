import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JDateChooser;


@SuppressWarnings("serial")
public class Create_account extends JFrame {
	
	// Variables declaration - do not modify-
	Connection conn;
	ResultSet rs;
	PreparedStatement pst;

	private JPanel contentPane;
	private JTextField textField;
	// private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	// private JTextField textField_7;
	private JTextField textField_8;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	// End of variables declaration


	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Create_account() {
		super("Create Account");
		setTitle("Wzxcvhbn");
		setAlwaysOnTop(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 766, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		conn = javaconnect.ConncrDB();
						
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Create_account.class.getResource("/images/Untitled-4.jpeg")));
		label.setBounds(-11, 11, 232, 68);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("Account No.");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(58, 120, 87, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblPin = new JLabel("Pin");
		lblPin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPin.setBounds(58, 200, 87, 26);
		contentPane.add(lblPin);
		
		JLabel lblNewLabel_2 = new JLabel("Account Type");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(58, 237, 87, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gender");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(58, 275, 87, 30);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Address");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(58, 322, 87, 28);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(168, 120, 187, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(168, 200, 187, 27);
		contentPane.add(textField_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(168, 322, 187, 27);
		contentPane.add(textField_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Savings", "Current"}));
		comboBox.setBounds(168, 242, 187, 20);
		contentPane.add(comboBox);
		
		JRadioButton male = new JRadioButton("Male");
		buttonGroup.add(male);
		male.setBounds(168, 281, 55, 23);
		contentPane.add(male);
		
		JRadioButton female = new JRadioButton("Female");
		buttonGroup.add(female);
		female.setBounds(225, 281, 64, 23);
		contentPane.add(female);
		
		JRadioButton other = new JRadioButton("Other");
		buttonGroup.add(other);
		other.setBounds(291, 281, 64, 23);
		contentPane.add(other);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setBounds(385, 120, 111, 30);
		contentPane.add(lblName);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDateOfBirth.setBounds(385, 161, 111, 28);
		contentPane.add(lblDateOfBirth);
		
		JLabel lblNationality = new JLabel("Nationality");
		lblNationality.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNationality.setBounds(385, 200, 111, 26);
		contentPane.add(lblNationality);
		
		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMobile.setBounds(385, 275, 111, 30);
		contentPane.add(lblMobile);
		
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(506, 120, 204, 27);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(506, 200, 204, 27);
		contentPane.add(textField_4);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(506, 275, 204, 27);
		contentPane.add(textField_6);
		
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(506, 161, 204, 28);
		contentPane.add(dateChooser);
		
		
		RandomAcc();
		RandomPIN();
		
		JButton btnNewButton = new JButton("Create");		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//code to add details in account table in database.
				
				String sql = "insert into Account(Acc, Name, Acc_Type, DOB, PIN, Nationality, Gender, Mobile, Address, Balance)values (?,?,?,?,?,?,?,?,?,?)";
				try {
					pst = conn.prepareStatement(sql);
					pst.setString(1, textField.getText() );
					pst.setString(2, textField_3.getText() );
					pst.setString(3, (String) comboBox.getSelectedItem() );
					pst.setString(4, ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText() );
					pst.setString(5, textField_2.getText() );
					pst.setString(6, textField_4.getText() );
					male.setActionCommand("Male");
					female.setActionCommand("Female");
					other.setActionCommand("Other");
					pst.setString(7, buttonGroup.getSelection().getActionCommand());
					pst.setString(8, textField_6.getText() );
					pst.setString(9, textField_5.getText() );
					pst.setString(10, textField_8.getText() );
					pst.execute();
					JDialog dialog = new JDialog();
					dialog.setAlwaysOnTop(true);    
					JOptionPane.showMessageDialog(dialog, "Congratulations! /n Your account has been created. " , null , JOptionPane.PLAIN_MESSAGE );
					Bal();
					setVisible(false);
					MyPage ob = new MyPage();
					ob.setLocationRelativeTo(null);
					ob.setVisible(true);
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		btnNewButton.setBounds(348, 430, 97, 23);
		contentPane.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				// textField_7.setText("");
				textField_8.setText("");
				comboBox.setSelectedIndex(0);
				//comboBox_1.setSelectedIndex(0);
				//comboBox_2.setSelectedIndex(0);
				buttonGroup.clearSelection();
				dateChooser.setCalendar(null);
				
			}
		});
		btnNewButton_1.setBounds(168, 430, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Authentication ob = new Authentication();
				ob.setLocationRelativeTo(null);
				ob.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(528, 430, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAmount.setBounds(58, 369, 111, 28);
		contentPane.add(lblAmount);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(168, 372, 187, 25);
		contentPane.add(textField_8);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 102, 153), 3), "Create Account", TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 24), new Color(0, 0, 204)));
		panel.setBounds(35, 90, 694, 382);
		contentPane.add(panel);
	}
	
	//Method to add in Balances table in database
	public void Bal() {
		String sql = "insert into Balances(Name,Acc,Balance)values (?,?,?)";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, textField_3.getText());
			pst.setString(2, textField.getText());
			// pst.setString(3, textField_1.getText());
			pst.setString(3, textField_8.getText());
			pst.execute();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
	

	//Method to generate random Account No.
	private void RandomAcc() {
		Random rn = new Random();
		int min = 100000;
		int max = 999999;
		int n = rn.nextInt((max - min) + 1) + min;
		textField.setText(Integer.toString(n));
	}
	
	
	//Method to generate random PIN
	public void RandomPIN() {
		Random ra = new Random();
		int min = 100;
		int max = 999;
		int n = ra.nextInt((max - min) + 1) + min;
		textField_2.setText(Integer.toString(n));
		
	}


}
