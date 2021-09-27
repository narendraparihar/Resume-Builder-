package Resume;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;

public class TEMPLATE2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public  void template2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TEMPLATE2 window = new TEMPLATE2();
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
	public TEMPLATE2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1045, 840);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(10, 0);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 0, 1022, 767);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.textHighlight);
		panel_1.setBounds(10, 0, 1002, 171);
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(749, 181, 263, 586);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea txtrSkills = new JTextArea();
		txtrSkills.setFont(new Font("Myanmar Text", Font.BOLD, 18));
		txtrSkills.setBackground(SystemColor.textHighlight);
		txtrSkills.setText("Skills");
		txtrSkills.setBounds(10, 10, 243, 31);
		panel_2.add(txtrSkills);
		
		JTextArea txtrLanguages = new JTextArea();
		txtrLanguages.setText("Languages");
		txtrLanguages.setFont(new Font("Myanmar Text", Font.BOLD, 18));
		txtrLanguages.setBackground(SystemColor.textHighlight);
		txtrLanguages.setBounds(10, 299, 243, 31);
		panel_2.add(txtrLanguages);
		
		JTextArea txtrJavapythoncHtmlcssbootstrapMongodb = new JTextArea();
		txtrJavapythoncHtmlcssbootstrapMongodb.setFont(new Font("Myanmar Text", Font.PLAIN, 17));
		txtrJavapythoncHtmlcssbootstrapMongodb.setText("JAVA.PYTHON,C++\r\nHTML,CSS,BOOTSTRAP\r\nMONGODB ,MARIADB\r\nMYSQL");
		txtrJavapythoncHtmlcssbootstrapMongodb.setBackground(SystemColor.controlHighlight);
		txtrJavapythoncHtmlcssbootstrapMongodb.setBounds(10, 51, 243, 235);
		panel_2.add(txtrJavapythoncHtmlcssbootstrapMongodb);
		
		JTextArea txtrEnglishfrenchGermenspanish = new JTextArea();
		txtrEnglishfrenchGermenspanish.setFont(new Font("Myanmar Text", Font.PLAIN, 17));
		txtrEnglishfrenchGermenspanish.setText("ENGLISH ,FRENCH\r\nGERMEN,SPANISH\r\nHINDI,GUJRATI");
		txtrEnglishfrenchGermenspanish.setBackground(SystemColor.controlHighlight);
		txtrEnglishfrenchGermenspanish.setBounds(10, 340, 243, 236);
		panel_2.add(txtrEnglishfrenchGermenspanish);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 181, 729, 586);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JTextArea txtrthFromSaint = new JTextArea();
		txtrthFromSaint.setText("10TH FROM SAINT XAVIOR IN 2019 WITH 90% \r\n12TH FROM LD SCHOOL IN 2021 WITH 92%\r\nGRADUATED IN COMPUTER SCIENCE FROM HARWARD 2024 WITH 80%\r\nMASTER IN DATA SCIENCE FROM  MIT IN 2026 WITH 70%");
		txtrthFromSaint.setToolTipText("DNVSDNV");
		txtrthFromSaint.setFont(new Font("Myanmar Text", Font.PLAIN, 19));
		txtrthFromSaint.setBackground(SystemColor.controlHighlight);
		txtrthFromSaint.setBounds(10, 49, 709, 185);
		panel_3.add(txtrthFromSaint);
		
		JTextArea txtrEducation = new JTextArea();
		txtrEducation.setText("EDUCATION");
		txtrEducation.setFont(new Font("Myanmar Text", Font.BOLD, 17));
		txtrEducation.setBackground(SystemColor.textHighlight);
		txtrEducation.setBounds(10, 10, 709, 29);
		panel_3.add(txtrEducation);
		
		JTextArea txtrWorkExperience = new JTextArea();
		txtrWorkExperience.setText("WORK EXPERIENCE/INTERNSHIPS/CERTIFICATION\r\n");
		txtrWorkExperience.setFont(new Font("Myanmar Text", Font.BOLD, 17));
		txtrWorkExperience.setBackground(SystemColor.textHighlight);
		txtrWorkExperience.setBounds(10, 240, 709, 29);
		panel_3.add(txtrWorkExperience);
		
		JTextArea txtrWorkAsA = new JTextArea();
		txtrWorkAsA.setFont(new Font("Myanmar Text", Font.PLAIN, 18));
		txtrWorkAsA.setText("WORK AS A SOFTWARE DEVELOPER IN AMAZON 2019-20\r\nWORK AS A SENIOR TESTER AT AMAZON 2020-21");
		txtrWorkAsA.setBackground(SystemColor.controlHighlight);
		txtrWorkAsA.setBounds(10, 279, 709, 137);
		panel_3.add(txtrWorkAsA);
		
		JTextArea txtrOtherAchivements = new JTextArea();
		txtrOtherAchivements.setText("OTHER ACHIVEMENTS");
		txtrOtherAchivements.setFont(new Font("Myanmar Text", Font.BOLD, 17));
		txtrOtherAchivements.setBackground(SystemColor.textHighlight);
		txtrOtherAchivements.setBounds(10, 423, 709, 29);
		panel_3.add(txtrOtherAchivements);
		
		JTextArea txtrrdRankIn = new JTextArea();
		txtrrdRankIn.setText("3rd RANK IN NATION LAVEL MATH QUIZ 2019\r\n2559th RANK NTSC 2020\r\n\r\n");
		txtrrdRankIn.setFont(new Font("Myanmar Text", Font.PLAIN, 18));
		txtrrdRankIn.setBackground(SystemColor.controlHighlight);
		txtrrdRankIn.setBounds(10, 459, 709, 125);
		panel_3.add(txtrrdRankIn);
		
		JLabel Photolbl = new JLabel("ADD PHOTO ");
		Photolbl.setBounds(10, 10, 128, 151);
		Photolbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser filechooser=new JFileChooser();
				  int i=filechooser.showOpenDialog(null);
				   if(i==JFileChooser.APPROVE_OPTION) {
				   File file=filechooser.getSelectedFile();
				   FileNameExtensionFilter filter = new FileNameExtensionFilter(
					        "JPG", "jpg", "gif");
				  String filename = file.getAbsolutePath(); 
				  JLabel jLabel =new JLabel();
				Photolbl.setText("");
				  JTextField url=new JTextField();
				  url.setText(filename);
			      ImageIcon icon = new ImageIcon(filename);
			    Photolbl.setText("");
			   Photolbl.setIcon(icon);
			   
			   
			   panel_1.add(Photolbl);
			}
			}
		});
		panel_1.setLayout(null);
		Photolbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		
		Border border = BorderFactory.createLineBorder(Color.black);
		Photolbl.setBorder(border);
		Photolbl.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(Photolbl);
		
		JTextArea txtrEnterNameIn = new JTextArea();
		txtrEnterNameIn.setFont(new Font("Myanmar Text", Font.BOLD, 30));
		txtrEnterNameIn.setText("ENTER NAME IN CAPITAL");
		txtrEnterNameIn.setBackground(SystemColor.textHighlight);
		txtrEnterNameIn.setBounds(148, 10, 529, 49);
		panel_1.add(txtrEnterNameIn);
		
		JTextArea txtrProfession = new JTextArea();
		txtrProfession.setBackground(SystemColor.textHighlight);
		txtrProfession.setText("PROFESSION");
		txtrProfession.setFont(new Font("Myanmar Text", Font.PLAIN, 15));
		txtrProfession.setBounds(148, 69, 299, 22);
		panel_1.add(txtrProfession);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(SystemColor.textHighlight);
		panel_2_1.setBounds(747, 0, 245, 169);
		panel_1.add(panel_2_1);
		
		textField = new JTextField();
		textField.setText("20-02-2002");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(40, 10, 194, 24);
		panel_2_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("97797997");
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(40, 53, 194, 24);
		panel_2_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("AHMEDABAD,GUJRAT");
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(40, 139, 194, 24);
		panel_2_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("18bcscs027@student.rru.ac.in");
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_3.setColumns(10);
		textField_3.setBounds(40, 101, 194, 24);
		panel_2_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("GERMEN,HINDI");
		textField_4.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		textField_4.setColumns(10);
		textField_4.setBounds(20, 560, 214, 29);
		panel_2_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("FRENCH, GUJARATI");
		textField_5.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		textField_5.setColumns(10);
		textField_5.setBounds(20, 599, 214, 29);
		panel_2_1.add(textField_5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TEMPLATE2.class.getResource("/Resume/dob (1).jpg")));
		lblNewLabel.setBounds(0, 10, 40, 29);
		panel_2_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TEMPLATE2.class.getResource("/Resume/ps (1).jpg")));
		lblNewLabel_1.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 53, 31, 24);
		panel_2_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(TEMPLATE2.class.getResource("/Resume/es (1).jpg")));
		lblNewLabel_2.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblNewLabel_2.setBounds(9, 101, 31, 24);
		panel_2_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(TEMPLATE2.class.getResource("/Resume/location icon (4).jpg")));
		lblNewLabel_3.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblNewLabel_3.setBounds(9, 139, 31, 24);
		panel_2_1.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("CLICK HERE TO PRINT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pdf npf=new Pdf();
				npf.printRecord(panel);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(20, 769, 1011, 33);
		frame.getContentPane().add(btnNewButton);
		
       frame.dispose();
		
		
	}
}
