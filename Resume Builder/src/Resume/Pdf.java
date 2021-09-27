package Resume;


import java.awt.EventQueue;

 
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.PrintJob;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.awt.event.ActionEvent;

public class Pdf {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pdf window = new Pdf();
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
	public Pdf() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.setBounds(100, 100, 819, 476);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(10, 10, 531, 419);
		frame.getContentPane().add(panel1);
		panel1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Narendra Parihar");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel.setBounds(10, 10, 252, 88);
		panel1.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 206, 209));
		panel.setBounds(0, 0, 805, 439);
		frame.getContentPane().add(panel);
		
		JButton btnNewButton = new JButton("Print This");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printRecord(panel1);
			}
				 
		});
		btnNewButton.setBounds(65, 183, 85, 21);
		panel1.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(551, 10, 244, 419);
		frame.getContentPane().add(panel_1);
		
	
	}
	
	
	  public void printRecord(JPanel panel){
	        // Create PrinterJob Here
	        PrinterJob printerJob = PrinterJob.getPrinterJob();
	        // Set Printer Job Name
	        printerJob.setJobName("Print Record");
	        // Set Printable
	        printerJob.setPrintable(new Printable() {
	            @Override
	            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
	                // Check If No Printable Content
	                if(pageIndex > 0){
	                    return Printable.NO_SUCH_PAGE;
	                }
	                
	                // Make 2D Graphics to map content
	                Graphics2D graphics2D = (Graphics2D)graphics;
	                // Set Graphics Translations
	                // A Little Correction here Multiplication was not working so I replaced with addition
	                graphics2D.translate(pageFormat.getImageableX()+10, pageFormat.getImageableY()+10);
	                // This is a page scale. Default should be 0.3 I am using 0.5
	                graphics2D.scale(0.5, 0.5);
	                
	                // Now paint panel as graphics2D
	                panel.paint(graphics2D);
	                
	                // return if page exists
	                return Printable.PAGE_EXISTS;
	            }
	        });
	        // Store printerDialog as boolean
	        boolean returningResult = printerJob.printDialog();
	        // check if dilog is showing
	        if(returningResult){
	            // Use try catch exeption for failure
	            try{
	                // Now call print method inside printerJob to print
	                printerJob.print();
	            }catch (PrinterException printerException){
	                JOptionPane.showMessageDialog(panel, this, "Print Error: " + printerException.getMessage(), 0);
	            }
	        }
		


}
}