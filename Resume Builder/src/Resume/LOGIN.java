package Resume;

import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LOGIN {

	private JFrame frame;
	private JTextField UserId;
	private JTextField Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGIN window = new LOGIN();
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
	public LOGIN() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.textHighlightText);
		frame.setBounds(100, 100, 894, 638);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(10, 10, 366, 570);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("RESUME");
		lblNewLabel_2.setForeground(SystemColor.text);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Myanmar Text", Font.BOLD, 28));
		lblNewLabel_2.setBounds(21, 181, 314, 49);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("BUILDER");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Myanmar Text", Font.BOLD, 28));
		lblNewLabel_2_1.setBounds(21, 224, 314, 49);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("DEVELOPED BY");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Myanmar Text", Font.BOLD, 28));
		lblNewLabel_2_1_1.setBounds(21, 265, 314, 62);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("NARENDRA PARIHAR");
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Myanmar Text", Font.BOLD, 28));
		lblNewLabel_2_1_1_1.setBounds(31, 315, 314, 62);
		panel.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(LOGIN.class.getResource("/Resume/pro.gif")));
		lblNewLabel_3.setBounds(10, 398, 346, 162);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(LOGIN.class.getResource("/Resume/pro.gif")));
		lblNewLabel_3_1.setBounds(10, 10, 346, 162);
		panel.add(lblNewLabel_3_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.controlHighlight);
		panel_1.setBounds(386, 10, 484, 570);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		UserId = new JTextField();
		UserId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		UserId.setText("ENTER USER ID..");
		UserId.setBounds(108, 191, 276, 31);
		panel_1.add(UserId);
		UserId.setColumns(10);
		
		Password = new JTextField();
		Password.setText("ENTER PASSWORD");
		Password.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Password.setColumns(10);
		Password.setBounds(108, 251, 276, 31);
		panel_1.add(Password);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost/resume","root","Narendra$7746$");
					
					String sql = "SELECT * FROM login WHERE userid = ? and password = ?";
					PreparedStatement statement = con.prepareStatement(sql);
					statement.setString(1,UserId.getText());
					statement.setString(2,Password.getText());
					ResultSet rs=statement.executeQuery();
					
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "Login Successfull");
					
						 ChooseFormat cf=new ChooseFormat();
					     cf.ChooseForm(null);
					}   
					else
						JOptionPane.showMessageDialog(null, "Incorrect username or password");
					
					con.close();
					
				}catch(Exception e1) {
					System.out.print(e1);
				}
			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(107, 307, 276, 31);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("NEW USER");
		lblNewLabel_1.setFont(new Font("Myanmar Text", Font.BOLD, 16));
		lblNewLabel_1.setBounds(333, 497, 96, 26);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("CREATE ACCOUNT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Signup su=new Signup();
				su.signup();
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(287, 533, 187, 21);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(LOGIN.class.getResource("/Resume/LOGINSYS-removebg-preview-removebg-preview.png")));
		lblNewLabel.setBounds(160, 46, 138, 135);
		panel_1.add(lblNewLabel);
	}
}
