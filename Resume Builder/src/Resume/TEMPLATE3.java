package Resume;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TEMPLATE3 {

	private JFrame frame;
	private JTextField textField;
	private JTextField txtNarendraparihargmailcom;
	private JTextField txtLivingCity;
	private JTextField txtLinkedinId;
	private JTextField txtJavaccpython;
	private JTextField txtHtmlcssbootstrap;
	private JTextField txtMysqlmongodbdbms;
	private JTextField txtCoding;
	private JTextField txtEnglish;
	private JTextField txtHindi;
	private JTextField txtGujarati;

	/**
	 * Launch the application.
	 */
	public  void template3() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TEMPLATE3 window = new TEMPLATE3();
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
	public TEMPLATE3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 815, 832);
		frame.setResizable(false);
		frame.setLocation(10, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 791, 735);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.controlShadow);
		panel_1.setBounds(10, 10, 771, 120);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(362, 5, -290, 22);
		panel_1.add(textArea);
		
		JTextArea txtrEnterNameIn = new JTextArea();
		txtrEnterNameIn.setBackground(SystemColor.controlShadow);
		txtrEnterNameIn.setText("ENTER NAME IN CAPITAL");
		txtrEnterNameIn.setFont(new Font("Myanmar Text", Font.BOLD, 30));
		txtrEnterNameIn.setBounds(10, 5, 451, 55);
		panel_1.add(txtrEnterNameIn);
		
		JTextArea txtrProfession = new JTextArea();
		txtrProfession.setBackground(SystemColor.controlShadow);
		txtrProfession.setText("PROFESSION\r\n");
		txtrProfession.setFont(new Font("Myanmar Text", Font.PLAIN, 20));
		txtrProfession.setBounds(10, 70, 309, 27);
		panel_1.add(txtrProfession);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 140, 224, 583);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea txtrContacts = new JTextArea();
		txtrContacts.setBackground(SystemColor.controlShadow);
		txtrContacts.setFont(new Font("Myanmar Text", Font.BOLD, 17));
		txtrContacts.setText("CONTACTS");
		txtrContacts.setBounds(10, 10, 214, 28);
		panel_2.add(txtrContacts);
		
		JTextArea txtrSkills = new JTextArea();
		txtrSkills.setText("SKILLS");
		txtrSkills.setFont(new Font("Myanmar Text", Font.BOLD, 17));
		txtrSkills.setBackground(SystemColor.controlShadow);
		txtrSkills.setBounds(10, 233, 196, 28);
		panel_2.add(txtrSkills);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setText("7984433478");
		textField.setBounds(10, 42, 214, 28);
		panel_2.add(textField);
		textField.setColumns(10);
		
		txtNarendraparihargmailcom = new JTextField();
		txtNarendraparihargmailcom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNarendraparihargmailcom.setText("narendraparihar5196@gmail.com");
		txtNarendraparihargmailcom.setColumns(10);
		txtNarendraparihargmailcom.setBounds(10, 80, 214, 28);
		panel_2.add(txtNarendraparihargmailcom);
		
		txtLivingCity = new JTextField();
		txtLivingCity.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtLivingCity.setText("LIVING CITY");
		txtLivingCity.setColumns(10);
		txtLivingCity.setBounds(10, 118, 214, 28);
		panel_2.add(txtLivingCity);
		
		txtLinkedinId = new JTextField();
		txtLinkedinId.setText("LINKEDIN ID");
		txtLinkedinId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtLinkedinId.setColumns(10);
		txtLinkedinId.setBounds(10, 156, 214, 28);
		panel_2.add(txtLinkedinId);
		
		txtJavaccpython = new JTextField();
		txtJavaccpython.setText("JAVA,C,C++,PYTHON");
		txtJavaccpython.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtJavaccpython.setColumns(10);
		txtJavaccpython.setBounds(10, 271, 196, 28);
		panel_2.add(txtJavaccpython);
		
		txtHtmlcssbootstrap = new JTextField();
		txtHtmlcssbootstrap.setText("HTML,CSS,BOOTSTRAP");
		txtHtmlcssbootstrap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtHtmlcssbootstrap.setColumns(10);
		txtHtmlcssbootstrap.setBounds(10, 311, 196, 28);
		panel_2.add(txtHtmlcssbootstrap);
		
		txtMysqlmongodbdbms = new JTextField();
		txtMysqlmongodbdbms.setText("MYSQL,MONGODB,DBMS");
		txtMysqlmongodbdbms.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtMysqlmongodbdbms.setColumns(10);
		txtMysqlmongodbdbms.setBounds(10, 349, 196, 28);
		panel_2.add(txtMysqlmongodbdbms);
		
		txtCoding = new JTextField();
		txtCoding.setText("CODING");
		txtCoding.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCoding.setColumns(10);
		txtCoding.setBounds(10, 387, 196, 28);
		panel_2.add(txtCoding);
		
		JTextArea txtrLanguages = new JTextArea();
		txtrLanguages.setText("LANGUAGES");
		txtrLanguages.setFont(new Font("Myanmar Text", Font.BOLD, 17));
		txtrLanguages.setBackground(SystemColor.controlShadow);
		txtrLanguages.setBounds(10, 426, 196, 28);
		panel_2.add(txtrLanguages);
		
		txtEnglish = new JTextField();
		txtEnglish.setText("ENGLISH");
		txtEnglish.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtEnglish.setColumns(10);
		txtEnglish.setBounds(10, 464, 196, 28);
		panel_2.add(txtEnglish);
		
		txtHindi = new JTextField();
		txtHindi.setText("HINDI");
		txtHindi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtHindi.setColumns(10);
		txtHindi.setBounds(10, 502, 196, 28);
		panel_2.add(txtHindi);
		
		txtGujarati = new JTextField();
		txtGujarati.setText("GUJARATI");
		txtGujarati.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtGujarati.setColumns(10);
		txtGujarati.setBounds(10, 540, 196, 28);
		panel_2.add(txtGujarati);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(236, 140, 545, 583);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JTextArea txtrEducation = new JTextArea();
		txtrEducation.setBackground(SystemColor.controlShadow);
		txtrEducation.setFont(new Font("Myanmar Text", Font.BOLD, 17));
		txtrEducation.setText("EDUCATION");
		txtrEducation.setBounds(10, 10, 525, 32);
		panel_3.add(txtrEducation);
		
		JTextArea txtrthFromSaint = new JTextArea();
		txtrthFromSaint.setText("10TH FROM SAINT XAVIOR IN 2019 WITH 90% \r\n12TH FROM LD SCHOOL IN 2021 WITH 92%\r\nGRADUATED IN COMPUTER SCIENCE FROM HARWARD 2024 WITH 80%\r\nMASTER IN DATA SCIENCE FROM  MIT IN 2026 WITH 70%");
		txtrthFromSaint.setFont(new Font("Myanmar Text", Font.PLAIN, 15));
		txtrthFromSaint.setBounds(10, 47, 525, 161);
		panel_3.add(txtrthFromSaint);
		
		JTextArea txtrWorkExperience = new JTextArea();
		txtrWorkExperience.setBackground(SystemColor.controlShadow);
		txtrWorkExperience.setText("WORK EXPERIENCE");
		txtrWorkExperience.setFont(new Font("Myanmar Text", Font.BOLD, 17));
		txtrWorkExperience.setBounds(10, 218, 525, 32);
		panel_3.add(txtrWorkExperience);
		
		JTextArea txtrWorkAsA = new JTextArea();
		txtrWorkAsA.setText("WORK AS A SOFTWARE DEVELOPER IN AMAZON 2019-20\r\nWORK AS A SENIOR TESTER AT AMAZON 2020-21");
		txtrWorkAsA.setFont(new Font("Myanmar Text", Font.PLAIN, 15));
		txtrWorkAsA.setBounds(10, 260, 525, 110);
		panel_3.add(txtrWorkAsA);
		
		JTextArea txtrOtherAchievements = new JTextArea();
		txtrOtherAchievements.setBackground(SystemColor.controlShadow);
		txtrOtherAchievements.setText("OTHER ACHIEVEMENTS");
		txtrOtherAchievements.setFont(new Font("Myanmar Text", Font.BOLD, 17));
		txtrOtherAchievements.setBounds(10, 380, 525, 32);
		panel_3.add(txtrOtherAchievements);
		
		JTextArea textArea_3_1_1 = new JTextArea();
		textArea_3_1_1.setFont(new Font("Myanmar Text", Font.PLAIN, 15));
		textArea_3_1_1.setBounds(10, 422, 525, 149);
		panel_3.add(textArea_3_1_1);
		
		JButton btnNewButton = new JButton("CLICK HERE TO PRINT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Pdf pf=new Pdf();
				pf.printRecord(panel);
			}
		});
		btnNewButton.setFont(new Font("Myanmar Text", Font.BOLD, 17));
		btnNewButton.setBounds(10, 751, 791, 26);
		frame.getContentPane().add(btnNewButton);
	}
}
