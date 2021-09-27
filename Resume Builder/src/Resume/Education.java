package Resume;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Education {

	private JFrame frmEducation;
	private JTextField course1;
	private JTextField grade1;
	private JTextField academy1;
	private JTextField passingyear1;
	private JTextField course2;
	private JTextField grade2;
	private JTextField acdemy2;
	private JTextField passingyear2;
	private JTextField course3;
	private JTextField grade3;
	private JTextField acdemy3;
	private JTextField passingyear3;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Education window = new Education();
					window.frmEducation.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Education() {
		initialize();
	}
	
	private void initialize() {
		frmEducation = new JFrame();
		frmEducation.setTitle("EDUCATION");
		frmEducation.setResizable(false);
		frmEducation.setBounds(100, 100, 669, 372);
		frmEducation.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmEducation.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("COURSE");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(42, 36, 106, 31);
		frmEducation.getContentPane().add(lblNewLabel);
		
		JLabel lblGrade = new JLabel("GRADE");
		lblGrade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblGrade.setBounds(210, 36, 89, 31);
		frmEducation.getContentPane().add(lblGrade);
		
		JLabel lblAcademy = new JLabel("ACADEMY");
		lblAcademy.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAcademy.setBounds(370, 36, 89, 31);
		frmEducation.getContentPane().add(lblAcademy);
		
		JLabel lblPassingYear = new JLabel("PASSING YEAR");
		lblPassingYear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPassingYear.setBounds(506, 36, 130, 31);
		frmEducation.getContentPane().add(lblPassingYear);
		
		course1 = new JTextField();
		course1.setBounds(28, 92, 120, 25);
		frmEducation.getContentPane().add(course1);
		course1.setColumns(10);
		
		grade1 = new JTextField();
		grade1.setColumns(10);
		grade1.setBounds(191, 92, 120, 25);
		frmEducation.getContentPane().add(grade1);
		
		academy1 = new JTextField();
		academy1.setColumns(10);
		academy1.setBounds(351, 92, 120, 25);
		frmEducation.getContentPane().add(academy1);
		
		passingyear1 = new JTextField();
		passingyear1.setColumns(10);
		passingyear1.setBounds(504, 92, 120, 25);
		frmEducation.getContentPane().add(passingyear1);
		
		course2 = new JTextField();
		course2.setColumns(10);
		course2.setBounds(28, 139, 120, 25);
		frmEducation.getContentPane().add(course2);
		
		grade2 = new JTextField();
		grade2.setColumns(10);
		grade2.setBounds(191, 142, 120, 25);
		frmEducation.getContentPane().add(grade2);
		
		acdemy2 = new JTextField();
		acdemy2.setColumns(10);
		acdemy2.setBounds(351, 142, 120, 25);
		frmEducation.getContentPane().add(acdemy2);
		
		passingyear2 = new JTextField();
		passingyear2.setColumns(10);
		passingyear2.setBounds(504, 139, 120, 25);
		frmEducation.getContentPane().add(passingyear2);
		
		course3 = new JTextField();
		course3.setColumns(10);
		course3.setBounds(28, 184, 120, 25);
		frmEducation.getContentPane().add(course3);
		
		grade3 = new JTextField();
		grade3.setColumns(10);
		grade3.setBounds(191, 187, 120, 25);
		frmEducation.getContentPane().add(grade3);
		
		acdemy3 = new JTextField();
		acdemy3.setColumns(10);
		acdemy3.setBounds(351, 187, 120, 25);
		frmEducation.getContentPane().add(acdemy3);
		
		passingyear3 = new JTextField();
		passingyear3.setColumns(10);
		passingyear3.setBounds(506, 187, 120, 25);
		frmEducation.getContentPane().add(passingyear3);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEducation.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(291, 295, 120, 31);
		frmEducation.getContentPane().add(btnNewButton);
	}

}
