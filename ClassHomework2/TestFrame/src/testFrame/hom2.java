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

public class hom2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hom2 frame = new hom2();
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
	public hom2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC6D0\uAE08\uC744 \uC785\uB825\uD558\uC2DC\uC624");
		lblNewLabel.setBounds(57, 52, 122, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC774\uC728\uC744 \uC785\uB825\uD558\uC2DC\uC624.");
		lblNewLabel_1.setBounds(57, 89, 122, 31);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("1000");
		textField.setBounds(189, 52, 181, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setText("7.5");
		textField_1.setBounds(186, 92, 184, 31);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setText("\uC774\uC790\uB294 \uC5F0 75\uB9CC\uC6D0 \uC785\uB2C8\uB2E4.");
		textField_2.setBounds(44, 189, 356, 31);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("\uBCC0\uD658");
		btnNewButton.setBounds(163, 138, 105, 27);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(44, 212, 356, -48);
		contentPane.add(panel);
	}

}
