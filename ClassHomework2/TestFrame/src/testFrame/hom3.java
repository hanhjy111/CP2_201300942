package testFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class hom3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hom3 frame = new hom3();
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
	public hom3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("23");
		textField.setBounds(46, 23, 316, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.setBounds(46, 71, 60, 27);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.setBounds(46, 110, 43, 27);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.setBounds(46, 149, 43, 27);
		contentPane.add(btnNewButton_2);
		
		JButton button = new JButton("8");
		button.setBounds(115, 110, 43, 27);
		contentPane.add(button);
		
		JButton button_1 = new JButton("9");
		button_1.setBounds(187, 110, 43, 27);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("/");
		button_2.setBounds(260, 110, 43, 27);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.setBounds(115, 149, 43, 27);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.setBounds(187, 149, 43, 27);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("*");
		button_5.setBounds(260, 149, 43, 27);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("1");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_6.setBounds(46, 189, 43, 27);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("2");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_7.setBounds(115, 189, 43, 27);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("3");
		button_8.setBounds(187, 188, 43, 27);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("-");
		button_9.setBounds(260, 188, 43, 27);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("0");
		button_10.setBounds(46, 226, 43, 27);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("00");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_11.setBounds(115, 228, 49, 27);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("=");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_12.setBounds(187, 227, 43, 27);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("+");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_13.setBounds(260, 226, 43, 27);
		contentPane.add(button_13);
	}

}
