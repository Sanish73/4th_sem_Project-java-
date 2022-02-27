package library1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.RasterFormatException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Stack;

import javax.management.RuntimeErrorException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.AbstractDocument.Content;

public class SignUp implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JPanel contentPane;
	private static JTextField textField, textField1, textField3;
	private static JPasswordField passField2;
	private static JButton b1, b2;
	private static JComboBox<Object> comboBox;
	JFrame frame = new JFrame();
	String sql;

	public static void main(String[] args) {
		new SignUp();

	}

	public SignUp() {
		frame.setBounds(500, 200, 606, 406);

		frame.setResizable(false);
		frame.setSize(525, 406);
//		frame.setSize(getSize());

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setBackground(new Color(233, 247, 247));
		contentPane.setLayout(null);

		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setForeground(Color.DARK_GRAY);
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUsername.setBounds(99, 86, 92, 26);
		contentPane.add(lblUsername);

		JLabel lblName = new JLabel("Name :");
		lblName.setForeground(Color.DARK_GRAY);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(99, 123, 92, 26);
		contentPane.add(lblName);

		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setForeground(Color.DARK_GRAY);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(99, 160, 92, 26);
		contentPane.add(lblPassword);

		JLabel lblAnswer = new JLabel("Answer :");
		lblAnswer.setForeground(Color.DARK_GRAY);
		lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAnswer.setBounds(99, 234, 92, 26);
		contentPane.add(lblAnswer);

		JLabel lblSecurityQUestion = new JLabel("Security Question :");
		lblSecurityQUestion.setForeground(Color.DARK_GRAY);
		lblSecurityQUestion.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSecurityQUestion.setBounds(99, 197, 140, 26);
		contentPane.add(lblSecurityQUestion);

		String option[] = { "Your NickName?", "Your Lucky Numer?", "Your Gf Name?" };
		comboBox = new JComboBox<Object>(option);
//		comboBox.setBackground(Color.black);
		comboBox.setBounds(265, 202, 148, 20);
		contentPane.add(comboBox);

		textField = new JTextField();
		textField.setBounds(265, 91, 148, 20);
		textField.setColumns(10);
		contentPane.add(textField);

		textField1 = new JTextField();
		textField1.setBounds(265, 128, 148, 20);
		textField1.setColumns(10);
		contentPane.add(textField1);

		passField2 = new JPasswordField();
		passField2.setBounds(265, 165, 148, 20);
		passField2.setColumns(10);
		contentPane.add(passField2);

		textField3 = new JTextField();
		textField3.setBounds(265, 239, 148, 20);
		textField3.setColumns(10);
		contentPane.add(textField3);

		b1 = new JButton("Create");
		b1.addActionListener(this);
		b1.setFont(new Font("Tahoma", Font.BOLD, 14));
		b1.setBounds(140, 289, 100, 30);
		b1.setBackground(new Color(250, 250, 210));
		b1.setForeground(new Color(46, 139, 87));
		b1.setFocusable(false);
		contentPane.add(b1);

		b2 = new JButton("Back");
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					if (e.getSource() == b2) {
						frame.setVisible(false);
						new Login_user();

					}
				} catch (Exception e2) {
					// TODO: handle exception
				}

			}
		});
		b2.setFont(new Font("Tahoma", Font.BOLD, 14));
		b2.setBounds(300, 289, 100, 30);
		b2.setBackground(new Color(250, 250, 210));
		b2.setForeground(new Color(139, 69, 19));
		b2.setFocusable(false);
		contentPane.add(b2);

		JPanel panel = new JPanel();
		panel.setForeground(Color.black);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(128, 128, 0), 2), "Create-Account",
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(34, 139, 34)));
		panel.setSize(470, 296);
		panel.setBounds(31, 45, 450, 296);
		panel.setBackground(Color.white);
//		System.out.println(panel.getSize());
		contentPane.add(panel);
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			conn con = new conn();

			String ausername = textField.getText();
			String bname = textField1.getText();
			String cpass = passField2.getText();
			String danswer = textField3.getText();
			String comboString = (String) comboBox.getSelectedItem();
			if (ausername.isEmpty() && bname.isEmpty() && cpass.isEmpty() && danswer.isEmpty()) {
				JOptionPane.showMessageDialog(null, "please insert something!!");
			} else if (ausername.isEmpty()) {
				JOptionPane.showMessageDialog(null, "please insert Username");
			} else if (bname.isEmpty()) {
				JOptionPane.showMessageDialog(null, "please insert your name");
			} else if (cpass.isEmpty()) {
				JOptionPane.showMessageDialog(null, "please insert Your new Password");
			} else if (danswer.isEmpty()) {
				JOptionPane.showMessageDialog(null, "please insert Your Answer");
			} else {

				if (e.getSource() == b1) {
					sql = "insert into signup(username,name,password,sec_q,sec_ans) values('" + ausername + "','"
							+ bname + "','" + cpass + "','" + comboString + "','" + danswer + "')";
					PreparedStatement st = con.c.prepareStatement(sql);
//				ResultSet rs = con.s.executeQuery(sql);
					int i = st.executeUpdate();

					if (i > 0) {
						JOptionPane.showMessageDialog(null, "sucessfuly created");
						textField.setText("");
						textField1.setText("");
						passField2.setText("");
						textField3.setText("");

					}
					frame.setVisible(false);
					new Login_user();

				}
			}

		} catch (Exception e2) {
			// TODO: handle exception
			throw new RasterFormatException("hey Signup is wornd");
		}

	}

}
