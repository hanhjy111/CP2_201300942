package testFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class h1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					h1 frame = new h1();
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
	public h1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("\uBCC0\uD658");
		button.setBounds(148, 109, 105, 27);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("\uAC70\uB9AC\uB97C \uB9C8\uC77C \uB2E8\uC704\uB85C \uC785\uB825\uD558\uC2DC\uC624");
		lblNewLabel.setBounds(116, 59, -27, -10);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\uAC70\uB9AC\uB97C \uB9C8\uC77C \uB2E8\uC704\uB85C \uC785\uB825\uD558\uC2DC\uC624.");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(24, 37, 208, 33);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("1");
		textField.setBounds(246, 41, 56, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("1 \uB9C8\uC77C\uC740 1.6 \uD0AC\uB85C\uBBF8\uD130\uC785\uB2C8\uB2E4.");
		textField_1.setBounds(65, 174, 297, 27);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
