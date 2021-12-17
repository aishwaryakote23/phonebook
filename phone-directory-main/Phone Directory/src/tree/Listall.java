package tree;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Listall extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Listall frame = new Listall();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Listall() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		panel.setBounds(0, 0, 618, 421);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				tree data = new tree();
				JFrame f = new JFrame();
				
				if(data.name==null && data.number==null) {
					
					JOptionPane.showMessageDialog(f, "There is No any Number in Contact Directory");
					
				}
				table = new JTable();
				table.setModel(new DefaultTableModel(
					new Object[][] {},
					new String[] {
						"Name", "Contact Number"
					}
				));
				table.setBounds(34, 109, 563, 287);
				panel.add(table);
				
				
							
	            for ( Map.Entry<String,String> entry : tree.phoneBook.entrySet() ) {
	            	table.setModel(new DefaultTableModel(
	    					new Object[][] {{entry.getKey()},{entry.getValue()}},
	    					new String[] {}
	    				));
	            	 System.out.println("   " + entry.getKey() + ": " + entry.getValue() );
	            }
	            
	            	
	          
	            
				
			}
		});
		btnNewButton.setBounds(229, 27, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnBack = new JButton("");
		btnBack.setBorder(null);
		btnBack.setBackground(null);
		btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/back.png")));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PhoneBook p = new PhoneBook();
				p.setVisible(true);
				
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnBack.setBackground(null);
		btnBack.setBounds(34, 27, 89, 71);
		panel.add(btnBack);
		
		
	
	}
}
