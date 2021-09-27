package Resume;

import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Signup {

	private JFrame frame;
	private JTextField userid;
	private JTextField pass1;
	private JTextField pass2;

	/**
	 * Launch the application.
	 */
	public  void signup() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup window = new Signup();
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
	public Signup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
   public void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 917, 589);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 10, 323, 532);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Signup.class.getResource("/Resume/IMAGE FOR SIGNUP.png")));
		lblNewLabel.setBounds(45, 82, 268, 285);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.textHighlight);
		panel_1.setBounds(343, 10, 550, 532);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("SIGNUP");
		lblNewLabel_1.setForeground(SystemColor.textHighlightText);
		lblNewLabel_1.setFont(new Font("Cambria Math", Font.BOLD, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(189, 41, 163, 47);
		panel_1.add(lblNewLabel_1);
		
		JLabel userid2 = new JLabel("ENTER EMAIL ID");
		userid2.setForeground(SystemColor.textHighlightText);
		userid2.setFont(new Font("Tahoma", Font.BOLD, 15));
		userid2.setBounds(60, 123, 139, 29);
		panel_1.add(userid2);
		
		userid = new JTextField();
		userid.setBounds(258, 125, 228, 29);
		panel_1.add(userid);
		userid.setColumns(10);
		
		JLabel password = new JLabel("ENTER PASSWORD");
		password.setForeground(Color.WHITE);
		password.setFont(new Font("Tahoma", Font.BOLD, 15));
		password.setBounds(60, 180, 163, 29);
		panel_1.add(password);
		
		JLabel password1 = new JLabel("CONFIRM PASSWORD");
		password1.setForeground(Color.WHITE);
		password1.setFont(new Font("Tahoma", Font.BOLD, 15));
		password1.setBounds(60, 232, 178, 29);
		panel_1.add(password1);
		
		pass1 = new JTextField();
		pass1.setColumns(10);
		pass1.setBounds(258, 180, 228, 29);
		panel_1.add(pass1);
		
		pass2 = new JTextField();
		pass2.setColumns(10);
		pass2.setBounds(258, 232, 228, 29);
		panel_1.add(pass2);
		
		
		JButton btnNewButton = new JButton("SIGN UP");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			
			
			
				if(!pass1.getText().toString().equals(pass2.getText().toString())) {
					JOptionPane.showMessageDialog(null, "Password not matched");
				}
				else if(userid.getText().equals("") || pass1.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter some data");
				}	
				
				else {
					
					try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost/resume","root","Narendra$7746$");
					
					String sql = "insert into login  values(?,?)";
					PreparedStatement statement = con.prepareStatement(sql);
					statement.setString(1,userid.getText());
					statement.setString(2,pass1.getText());
				    statement.executeUpdate();
					
						JOptionPane.showMessageDialog(null, "Signup Successfull");
					
						
						frame.dispose();
					
					con.close();
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null,e1);
					System.out.print(e1);
				}
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(227, 295, 110, 29);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("ALREADY HAVE ACCOUNT");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(367, 454, 173, 29);
		panel_1.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("LOGIN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LOGIN l=new LOGIN();
				l.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(367, 493, 173, 29);
		panel_1.add(btnNewButton_1);
	}
}
