package Resume;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.filechooser.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollBar;

public class TEMPLATE1{

	private JFrame frmResumeBuilderBy;
	private JTextField txtDob;
	private JTextField txtContactNo;
	private JTextField txtCity;
    JLabel photolabel;
    JLabel Namelbl;
    JTextField txtdob;
    private JTextField txtbcscsstudentrruacin;
    private JTextField txtEnglish;
    private JTextField txtHindi;
    private JTextField txtGujarati;
  
	/**
	 * Launch the application.
	 */
    public  void template1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TEMPLATE1 window = new TEMPLATE1();
					window.frmResumeBuilderBy.setVisible(true);
							
					
			
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TEMPLATE1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frmResumeBuilderBy = new JFrame();
		frmResumeBuilderBy.setTitle("RESUME BUILDER BY Narendra  Parihar");
		frmResumeBuilderBy.setResizable(false);
		frmResumeBuilderBy.setBounds(100, 100, 898, 838);
		frmResumeBuilderBy.setLocation(10, 0);
		frmResumeBuilderBy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmResumeBuilderBy.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 874, 768);
		frmResumeBuilderBy.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(175, 238, 238));
		panel_1.setBounds(176, 10, 688, 138);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JTextPane txtpnSoftwareEngineer = new JTextPane();
		txtpnSoftwareEngineer.setText("ENTER PROFESSION");
		txtpnSoftwareEngineer.setFont(new Font("Myanmar Text", Font.PLAIN, 20));
		txtpnSoftwareEngineer.setBackground(new Color(175, 238, 238));
		txtpnSoftwareEngineer.setBounds(10, 55, 639, 33);
		panel_1.add(txtpnSoftwareEngineer);
		
		JTextPane txtpnEnterName = new JTextPane();
		txtpnEnterName.setBounds(10, 10, 639, 48);
		panel_1.add(txtpnEnterName);
		txtpnEnterName.setFont(new Font("Myanmar Text", Font.BOLD, 30));
		txtpnEnterName.setText("ENTER NAME IN CAPITAL");
		txtpnEnterName.setBackground(new Color(175, 238, 238));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(10, 158, 244, 600);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TEMPLATE1.class.getResource("/Resume/dob (1).jpg")));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(0, 10, 40, 29);
		panel_2.add(lblNewLabel_1);
		
		txtDob = new JTextField();
		txtDob.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtDob.setText("20-02-2002");
		txtDob.setBounds(40, 10, 194, 24);
		panel_2.add(txtDob);
		txtDob.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(TEMPLATE1.class.getResource("/Resume/ps (1).jpg")));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(10, 53, 31, 24);
		panel_2.add(lblNewLabel_1_1);
		
		txtContactNo = new JTextField();
		txtContactNo.setText("97797997");
		txtContactNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtContactNo.setColumns(10);
		txtContactNo.setBounds(40, 53, 194, 24);
		panel_2.add(txtContactNo);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(TEMPLATE1.class.getResource("/Resume/es (1).jpg")));
		lblNewLabel_2.setBounds(9, 101, 31, 29);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(TEMPLATE1.class.getResource("/Resume/location icon (4).jpg")));
		lblNewLabel_3.setBounds(9, 134, 31, 29);
		panel_2.add(lblNewLabel_3);
		
		txtCity = new JTextField();
		txtCity.setText("AHMEDABAD,GUJRAT");
		txtCity.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCity.setColumns(10);
		txtCity.setBounds(40, 139, 194, 24);
		panel_2.add(txtCity);
		
		txtbcscsstudentrruacin = new JTextField();
		txtbcscsstudentrruacin.setText("18bcscs027@student.rru.ac.in");
		txtbcscsstudentrruacin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtbcscsstudentrruacin.setColumns(10);
		txtbcscsstudentrruacin.setBounds(40, 101, 194, 24);
		panel_2.add(txtbcscsstudentrruacin);
		
		JLabel lblNewLabel = new JLabel("Skills");
		lblNewLabel.setFont(new Font("Myanmar Text", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(20, 190, 224, 24);
		panel_2.add(lblNewLabel);
		
		JTextPane txtpnJavaPythonc = new JTextPane();
		txtpnJavaPythonc.setText("JAVA , PYTHON,C++\r\nHTML,CSS,BOOTSRAP\r\nMONGODB,MYSQL\r\nCOMPLETE BACKEND DEVELOPMENT");
		txtpnJavaPythonc.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		txtpnJavaPythonc.setBounds(20, 232, 214, 185);
		panel_2.add(txtpnJavaPythonc);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(175, 238, 238));
		panel_5.setBounds(20, 212, 214, 10);
		panel_2.add(panel_5);
		
		JLabel lblLangauages = new JLabel("LANGAUAGES");
		lblLangauages.setHorizontalAlignment(SwingConstants.LEFT);
		lblLangauages.setFont(new Font("Myanmar Text", Font.BOLD, 20));
		lblLangauages.setBounds(20, 427, 224, 24);
		panel_2.add(lblLangauages);
		
		JPanel panel_5_2 = new JPanel();
		panel_5_2.setBackground(new Color(175, 238, 238));
		panel_5_2.setBounds(20, 461, 214, 10);
		panel_2.add(panel_5_2);
		
		txtEnglish = new JTextField();
		txtEnglish.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		txtEnglish.setText("ENGLISH ,SPANISH");
		txtEnglish.setBounds(20, 481, 214, 29);
		panel_2.add(txtEnglish);
		txtEnglish.setColumns(10);
		
		txtHindi = new JTextField();
		txtHindi.setText("GERMEN,HINDI");
		txtHindi.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		txtHindi.setColumns(10);
		txtHindi.setBounds(20, 520, 214, 29);
		panel_2.add(txtHindi);
		
		txtGujarati = new JTextField();
		txtGujarati.setText("FRENCH, GUJARATI");
		txtGujarati.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		txtGujarati.setColumns(10);
		txtGujarati.setBounds(20, 559, 214, 29);
		panel_2.add(txtGujarati);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(264, 159, 610, 607);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel(" EDUCATION");
		lblNewLabel_4.setBackground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Myanmar Text", Font.BOLD, 17));
		lblNewLabel_4.setBounds(10, 10, 590, 32);
		panel_3.add(lblNewLabel_4);
		
		JTextArea txtrthFromSaint = new JTextArea();
		txtrthFromSaint.setBackground(SystemColor.control);
		txtrthFromSaint.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		txtrthFromSaint.setText("10TH FROM SAINT XAVIOR IN 2019 WITH 90% \r\n12TH FROM LD SCHOOL IN 2021 WITH 92%\r\nGRADUATED IN COMPUTER SCIENCE FROM HARWARD 2024 WITH 80%\r\nMASTER IN DATA SCIENCE FROM  MIT IN 2026 WITH 70%");
		txtrthFromSaint.setRows(0);
		txtrthFromSaint.setBounds(10, 52, 590, 152);
		panel_3.add(txtrthFromSaint);
		
		JTextArea txtrWorkAsA = new JTextArea();
		txtrWorkAsA.setBackground(SystemColor.control);
		txtrWorkAsA.setText("WORK AS A SOFTWARE DEVELOPER IN AMAZON 2019-20\r\nWORK AS A SENIOR TESTER AT AMAZON 2020-21");
		txtrWorkAsA.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		txtrWorkAsA.setBounds(10, 279, 590, 100);
		panel_3.add(txtrWorkAsA);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setBackground(new Color(175, 238, 238));
		panel_5_1.setBounds(10, 44, 590, 10);
		panel_3.add(panel_5_1);
		
		JPanel panel_5_1_1 = new JPanel();
		panel_5_1_1.setBackground(new Color(175, 238, 238));
		panel_5_1_1.setBounds(10, 259, 590, 10);
		panel_3.add(panel_5_1_1);
		
		JTextPane txtpnWorkExperience = new JTextPane();
		txtpnWorkExperience.setText("WORK EXPERIENCE");
		txtpnWorkExperience.setFont(new Font("Myanmar Text", Font.BOLD, 17));
		txtpnWorkExperience.setBackground(SystemColor.control);
		txtpnWorkExperience.setBounds(10, 214, 590, 35);
		panel_3.add(txtpnWorkExperience);
		
		JTextPane txtpnAchievements = new JTextPane();
		txtpnAchievements.setText("ACHIEVEMENTS");
		txtpnAchievements.setFont(new Font("Myanmar Text", Font.BOLD, 17));
		txtpnAchievements.setBackground(SystemColor.menu);
		txtpnAchievements.setBounds(10, 389, 590, 35);
		panel_3.add(txtpnAchievements);
		
		JTextArea txtrAllIndiath = new JTextArea();
		txtrAllIndiath.setText("ALL INDIA 2556th RANK IN NTSC 2019\r\nGOLD MEDAL IN STATE LAVEL MATH COMPETITION\r\nCERTIFICATE OF PARTICIPATION IN INTERNATIONAL QUIZ OF \r\nCOMPUTER SCIENCE\r\n");
		txtrAllIndiath.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		txtrAllIndiath.setBackground(SystemColor.menu);
		txtrAllIndiath.setBounds(10, 454, 590, 144);
		panel_3.add(txtrAllIndiath);
		
		JPanel panel_5_1_1_1 = new JPanel();
		panel_5_1_1_1.setBackground(new Color(175, 238, 238));
		panel_5_1_1_1.setBounds(10, 434, 590, 10);
		panel_3.add(panel_5_1_1_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(175, 238, 238));
		panel_4.setBounds(10, 10, 156, 138);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel Photolbl = new JLabel("ADD PHOTO");
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
				
				  JTextField url=new JTextField();
				  url.setText(filename);
			      ImageIcon icon = new ImageIcon(filename);
			    Photolbl.setText("");
			   Photolbl.setIcon(icon);
			   panel_4.add(Photolbl);
			}
			}
		});
		Photolbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		Photolbl.setHorizontalAlignment(SwingConstants.CENTER);
		Photolbl.setBounds(0, 0, 156, 138);
		panel_4.add(Photolbl);
		

	
		
		
		
		JButton btnNewButton = new JButton("CLICK HERE TO PRINT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pdf npf=new Pdf();
				npf.printRecord(panel);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(10, 764, 862, 25);
		frmResumeBuilderBy.getContentPane().add(btnNewButton);
		
		
		
	}
}
