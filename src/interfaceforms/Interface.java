package interfaceforms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTree;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;

public class Interface {

	private JFrame frmStandart;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frmStandart.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStandart = new JFrame();
		frmStandart.setResizable(false);
		frmStandart.setTitle("Calculadora");
		frmStandart.setBounds(100, 100, 460, 513);
		frmStandart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStandart.getContentPane().setLayout(null);
		CenteredFrame(frmStandart);
			
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(14, 81, 421, 348);
		frmStandart.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("⌫");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(322, 30, 89, 42);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("÷");
		btnNewButton_1_1.setBounds(322, 83, 89, 42);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("X");
		btnNewButton_1_2.setBounds(322, 136, 89, 42);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("-");
		btnNewButton_1_3.setBounds(322, 189, 89, 42);
		panel.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("+");
		btnNewButton_1_4.setBounds(322, 242, 89, 42);
		panel.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_4_1 = new JButton("=");
		btnNewButton_1_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_4_1.setBounds(322, 295, 89, 42);
		panel.add(btnNewButton_1_4_1);
		
		JButton btnNewButton_1_4_1_1 = new JButton(".");
		btnNewButton_1_4_1_1.setBounds(211, 295, 89, 42);
		panel.add(btnNewButton_1_4_1_1);
		
		JButton btnNewButton_1_4_1_1_1 = new JButton("0");
		btnNewButton_1_4_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_4_1_1_1.setBounds(112, 295, 89, 42);
		panel.add(btnNewButton_1_4_1_1_1);
		
		JButton btnNewButton_1_4_1_1_1_1 = new JButton("1");
		btnNewButton_1_4_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_4_1_1_1_1.setBounds(10, 245, 89, 42);
		panel.add(btnNewButton_1_4_1_1_1_1);
		
		JButton btnNewButton_1_4_1_1_1_1_1 = new JButton("2");
		btnNewButton_1_4_1_1_1_1_1.setBounds(112, 245, 89, 42);
		panel.add(btnNewButton_1_4_1_1_1_1_1);
		
		JButton btnNewButton_1_4_1_1_1_1_2 = new JButton("3");
		btnNewButton_1_4_1_1_1_1_2.setBounds(211, 242, 89, 42);
		panel.add(btnNewButton_1_4_1_1_1_1_2);
		
		JButton btnNewButton_1_4_1_1_1_1_3 = new JButton("4");
		btnNewButton_1_4_1_1_1_1_3.setBounds(10, 192, 89, 42);
		panel.add(btnNewButton_1_4_1_1_1_1_3);
		
		JButton btnNewButton_1_4_1_1_1_1_4 = new JButton("5");
		btnNewButton_1_4_1_1_1_1_4.setBounds(112, 189, 89, 42);
		panel.add(btnNewButton_1_4_1_1_1_1_4);
		
		JButton btnNewButton_1_4_1_1_1_1_5 = new JButton("6");
		btnNewButton_1_4_1_1_1_1_5.setBounds(211, 189, 89, 42);
		panel.add(btnNewButton_1_4_1_1_1_1_5);
		
		JButton btnNewButton_1_4_1_1_1_1_6 = new JButton("7");
		btnNewButton_1_4_1_1_1_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_4_1_1_1_1_6.setBounds(10, 131, 89, 42);
		panel.add(btnNewButton_1_4_1_1_1_1_6);
		
		JButton btnNewButton_1_4_1_1_1_1_7 = new JButton("8");
		btnNewButton_1_4_1_1_1_1_7.setBounds(112, 131, 89, 42);
		panel.add(btnNewButton_1_4_1_1_1_1_7);
		
		JButton btnNewButton_1_4_1_1_1_1_8 = new JButton("9");
		btnNewButton_1_4_1_1_1_1_8.setBounds(211, 131, 89, 42);
		panel.add(btnNewButton_1_4_1_1_1_1_8);
		
		JButton btnNewButton_1_4_1_1_1_1_9 = new JButton("+/-");
		btnNewButton_1_4_1_1_1_1_9.setBounds(10, 295, 89, 42);
		panel.add(btnNewButton_1_4_1_1_1_1_9);
		
		JButton btnNewButton_1_4_1_1_1_1_6_1 = new JButton("C");
		btnNewButton_1_4_1_1_1_1_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_4_1_1_1_1_6_1.setBounds(10, 11, 89, 42);
		panel.add(btnNewButton_1_4_1_1_1_1_6_1);
		
		JButton btnNewButton_1_4_1_1_1_1_6_2 = new JButton("CE");
		btnNewButton_1_4_1_1_1_1_6_2.setBounds(112, 11, 89, 42);
		panel.add(btnNewButton_1_4_1_1_1_1_6_2);
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStandart.dispose();
			}
		});
		btnNewButton.setBounds(346, 440, 89, 23);
		frmStandart.getContentPane().add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(14, 11, 421, 59);
		frmStandart.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblResultado = new JLabel("0");
		lblResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblResultado.setFont(new Font("Yu Gothic Light", Font.BOLD, 20));
		lblResultado.setBounds(230, 11, 181, 37);
		panel_1.add(lblResultado);
	}
	
	
	public void CenteredFrame(javax.swing.JFrame frmStandart) {
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - frmStandart.getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - frmStandart.getHeight()) / 2);
	    frmStandart.setLocation(x, y);
	}
	
}
