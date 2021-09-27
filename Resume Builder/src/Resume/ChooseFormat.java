package Resume;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class ChooseFormat {

	private JFrame frmResumeBuilderBy;

	/**
	 * Launch the application.
	 */
	public void ChooseForm(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChooseFormat window = new ChooseFormat();
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
	public ChooseFormat() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmResumeBuilderBy = new JFrame();
		frmResumeBuilderBy.setTitle("Resume Builder By Narendra Parihar");
		frmResumeBuilderBy.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmResumeBuilderBy.setBounds(100, 100, 1055, 555);
		frmResumeBuilderBy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmResumeBuilderBy.getContentPane().setLayout(null);
		frmResumeBuilderBy.setResizable(false);
		JLabel lblNewLabel = new JLabel("CHOOSE TEMPLATE\r\n");
		lblNewLabel.setBackground(SystemColor.controlHighlight);
		lblNewLabel.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(29, 20, 985, 68);
		frmResumeBuilderBy.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TEMPLATE3 TP3=new TEMPLATE3();
				TP3.template3();
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(ChooseFormat.class.getResource("/Resume/TEMPLATE2.1 (1).jpg")));
		lblNewLabel_1.setBounds(20, 93, 296, 319);
		frmResumeBuilderBy.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TEMPLATE2 TP2=new TEMPLATE2();
				TP2.template2();
			}
		});
		lblNewLabel_1_1.setIcon(new ImageIcon(ChooseFormat.class.getResource("/Resume/Template3.jpg")));
		lblNewLabel_1_1.setBounds(330, 93, 379, 319);
		frmResumeBuilderBy.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TEMPLATE1 TP1 =new TEMPLATE1();
				TP1.template1();
				
			}
		});
		lblNewLabel_1_2.setIcon(new ImageIcon(ChooseFormat.class.getResource("/Resume/TEMPLATE1 (3).jpg")));
		lblNewLabel_1_2.setBounds(744, 85, 270, 327);
		frmResumeBuilderBy.getContentPane().add(lblNewLabel_1_2);
		
		JButton btnNewButton = new JButton("TEMPLATE 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TEMPLATE3 TP3=new TEMPLATE3();
				TP3.template3();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(20, 422, 296, 32);
		frmResumeBuilderBy.getContentPane().add(btnNewButton);
		
		JButton btnTemplate = new JButton("TEMPLATE 2");
		btnTemplate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TEMPLATE2 TP2=new TEMPLATE2();
				TP2.template2();
			}
		});
		btnTemplate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTemplate.setBounds(330, 422, 379, 32);
		frmResumeBuilderBy.getContentPane().add(btnTemplate);
		
		JButton btnTemplate_1 = new JButton("TEMPLATE 3");
		btnTemplate_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TEMPLATE1 TP1 =new TEMPLATE1();
				TP1.template1();		
			}
		});
		btnTemplate_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTemplate_1.setBounds(744, 422, 270, 32);
		frmResumeBuilderBy.getContentPane().add(btnTemplate_1);
	}
}
