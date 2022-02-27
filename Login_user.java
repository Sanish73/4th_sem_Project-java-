package library1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.Border;
import java.io.FileNotFoundException;

public class Login_user extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton b1, b2, b3;
	JLabel librabry;
	public static String userName;
	public static String passName;
	public static JOptionPane op;

	public static void main(String[] args) {
		new Login_user();
	}

	public Login_user() {
		this.setTitle("Login");
		setLayout(null);
//		setBackground(new Color(229, 140, 237));
		setBounds(500, 200, 600, 400);
		this.setSize(320, 407);
		this.setResizable(false);

		panel = new JPanel();
		panel.setBackground(new Color(233, 247, 247));
		setContentPane(panel);
		panel.setLayout(null);

		librabry = new JLabel("Welcome!!");
		librabry.setBounds(94, 30, 95, 24);
		librabry.setSize(200, 40);
		librabry.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(librabry);

		JLabel l1 = new JLabel("Username :");
		l1.setBounds(23, 89, 95, 24);
		panel.add(l1);

		JLabel l2 = new JLabel("Password :");
		l2.setBounds(23, 124, 95, 24);
		panel.add(l2);

		textField = new JTextField();
		textField.setBounds(123, 93, 157, 20);
		panel.add(textField);

		passwordField = new JPasswordField();
		passwordField.setBounds(123, 128, 157, 20);
		panel.add(passwordField);

		b2 = new JButton("Login");
		b2.addActionListener(this);
		b2.setFocusable(false);
		b2.setForeground(new Color(46, 139, 87));
		b2.setBackground(new Color(250, 250, 210));
		b2.setBounds(32, 181, 113, 39);
		panel.add(b2);

		b1 = new JButton("SignUp");
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					if (e.getSource() == b1) {
						setVisible(false);
//				SignUp su = new SignUp();
						new SignUp().frame.setVisible(true);

					}
				} catch (Exception e2) {
					// TODO: handle exception
				}

			}
		});
		b1.setFocusable(false);
		b1.setForeground(new Color(139, 69, 19));
		b1.setBackground(new Color(250, 250, 210));
		b1.setBounds(167, 181, 113, 39);
		panel.add(b1);

		b3 = new JButton("Forgot Password");
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {

					if (e.getSource() == b3) {// forget buttn
						setVisible(false);
						new Forgot().setVisible(true);

					}
				} catch (Exception e2) {
					// TODO: handle exception
				}

			}
		});
		b3.setFocusable(false);
		b3.setForeground(Color.black);
		b3.setBackground(new Color(240, 211, 211));
		b3.setFont(new Font("Tahoma", Font.BOLD, 14));
		b3.setBounds(32, 240, 197, 39);
		b3.setSize(248, 40);
//		b3.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(b3);

		JLabel l5 = new JLabel("Troble in Login?");
		l5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		l5.setForeground(new Color(255, 0, 0));
		l5.setBounds(90, 290, 130, 20);
		l5.setSize(195, 30);

		panel.add(l5);

		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			conn c1 = new conn();
			String a = textField.getText();
			String b = passwordField.getText();

			String sql = "select * from signup where username ='" + a + "' and password ='" + b + "'";

			ResultSet rs = c1.s.executeQuery(sql);

			if (a.isEmpty() && b.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please insert something!!");
			} else if (a.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please insert your UserName to LOgin!");
				textField.setText("");
				passwordField.setText("");
			} else if (b.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please insert your password!!!");
				textField.setText("");
				passwordField.setText("");
			} else {

				if (e.getSource() == b2) {// login button

					if (rs.next()) {
						new home();

						this.setVisible(false);

					} else {
						JOptionPane.showMessageDialog(null, "Please Input Correct password or name!!!");
						textField.setText("");
						passwordField.setText("");

					}

				}

			}

		} catch (Exception e2) {
			throw new RuntimeException("Hey Login_user is worng!!!!");
		}

	}

}
