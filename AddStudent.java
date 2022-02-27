package library1;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class AddStudent extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField t1, t2, t3;
	private JComboBox<Object> comboBox, comboBox_1, comboBox_2, comboBox_3;
	private static int leftSpace = 20;
	private static int leftTextField = 154;
	JButton b1, b2;

	public static void main(String[] args) {
		new AddStudent().setVisible(true);
	}

	public void random() {
		Random rd = new Random();
		t1.setText("" + rd.nextInt(10000 + 1));
	}

	public AddStudent() {
		super("Add Student");
		this.setBounds(500, 200, 395, 443);

		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(233, 247, 247));
		setContentPane(contentPane);
		contentPane.setLayout(null);
//------------------------------------------------------------------------------------
		JLabel l1 = new JLabel("Student_id");
		l1.setForeground(new Color(27, 25, 112));
		l1.setFont(new Font("Tahoma", Font.BOLD, 14));
		l1.setBounds(leftSpace, 63, 102, 22);
		contentPane.add(l1);

		JLabel l2 = new JLabel("Name");
		l2.setForeground(new Color(25, 25, 112));
		l2.setFont(new Font("Tahoma", Font.BOLD, 14));
		l2.setBounds(leftSpace, 97, 102, 22);
		contentPane.add(l2);

		JLabel l3 = new JLabel("Father's Name");
		l3.setForeground(new Color(25, 25, 112));
		l3.setFont(new Font("Tahoma", Font.BOLD, 14));
		l3.setBounds(leftSpace, 130, 105, 22);
		contentPane.add(l3);

		JLabel l7 = new JLabel("Course");
		l7.setForeground(new Color(25, 25, 112));
		l7.setFont(new Font("Tahoma", Font.BOLD, 14));
		l7.setBounds(leftSpace, 173, 102, 22);
		contentPane.add(l7);

		JLabel l4 = new JLabel("Branch");
		l4.setForeground(new Color(25, 25, 112));
		l4.setFont(new Font("Tahoma", Font.BOLD, 14));
		l4.setBounds(leftSpace, 209, 102, 22);
		contentPane.add(l4);

		JLabel l5 = new JLabel("Year");
		l5.setForeground(new Color(25, 25, 112));
		l5.setFont(new Font("Tahoma", Font.BOLD, 14));
		l5.setBounds(leftSpace, 242, 102, 22);
		contentPane.add(l5);

		JLabel l6 = new JLabel("Semester");
		l6.setForeground(new Color(25, 25, 112));
		l6.setFont(new Font("Tahoma", Font.BOLD, 14));
		l6.setBounds(leftSpace, 275, 102, 22);
		contentPane.add(l6);
// -----------------------------------------------------------------------------------
		t1 = new JTextField();
		t1.setEditable(false);
		t1.setForeground(new Color(47, 79, 79));
		t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t1.setBounds(leftTextField, 66, 156, 20);
		contentPane.add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setForeground(new Color(47, 79, 79));
		t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t2.setColumns(10);
		t2.setBounds(leftTextField, 100, 156, 20);
		contentPane.add(t2);

		t3 = new JTextField();
		t3.setForeground(new Color(47, 79, 79));
		t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t3.setColumns(10);
		t3.setBounds(leftTextField, 133, 156, 20);
		contentPane.add(t3);
//-----------------------------------------------------------------------------------------
		comboBox_3 = new JComboBox<Object>();
		comboBox_3.setModel(
				new DefaultComboBoxModel<Object>(new String[] { "BBA", "BCA", "B.Sc", "BBM", "MCA", "M.Com" }));
		comboBox_3.setForeground(new Color(47, 79, 79));
		comboBox_3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		comboBox_3.setBounds(leftTextField, 176, 154, 20);
		contentPane.add(comboBox_3);

		comboBox = new JComboBox<Object>();
		comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] { "System Analysts", "System Manager",
				"Database Adminstrator", "Computer Systems Administrators", "Network Administrator", "Other" }));
		comboBox.setForeground(new Color(47, 79, 79));
		comboBox.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		comboBox.setBounds(leftTextField, 211, 154, 20);
		contentPane.add(comboBox);

		comboBox_1 = new JComboBox<Object>();
		comboBox_1.setModel(new DefaultComboBoxModel<Object>(new String[] { "First", "Second", "Third", "Four" }));
		comboBox_1.setForeground(new Color(47, 79, 79));
		comboBox_1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		comboBox_1.setBounds(leftTextField, 244, 154, 20);
		contentPane.add(comboBox_1);

		comboBox_2 = new JComboBox<Object>();
		comboBox_2.setModel(new DefaultComboBoxModel<Object>(
				new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th" }));
		comboBox_2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		comboBox_2.setForeground(new Color(47, 79, 79));
		comboBox_2.setBounds(leftTextField, 277, 154, 20);
		contentPane.add(comboBox_2);
//--------------------------------------------------------------------------------------------------------
		b1 = new JButton("ADD");
		b1.addActionListener(this);
		b1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		b1.setBounds(64, 321, 111, 33);
		b1.setBackground(new Color(250, 250, 210));
		b1.setForeground(new Color(46, 139, 87));
		contentPane.add(b1);

		b2 = new JButton("BACK");
		b2.addActionListener(this);
		b2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		b2.setBounds(198, 321, 111, 33);
		b2.setBackground(new Color(250, 250, 210));
		b2.setForeground(new Color(139, 69, 19));
		contentPane.add(b2);
//---------------------------------------------------------------------------------------------------------------

//		JPanel panel = new JPanel();
//		panel.setBorder(new TitledBorder(new LineBorder(new Color(102, 205, 170), 2, true), "Add-Student",
//				TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(30, 144, 255)));
//		panel.setBackground(new Color(211, 211, 211));
//		panel.setBounds(14, 19, 354, 364);
//		panel.setBackground(Color.WHITE);
//
//		contentPane.add(panel);
		random();
	}

	public void actionPerformed(ActionEvent ae) {
		try {

			if (ae.getSource() == b1) {
				try {
					conn con = new conn();
					String sql = "insert into student(student_id, name, father, course, branch, year, semester) values(?, ?, ?, ?, ?, ?, ?)";
					PreparedStatement st = con.c.prepareStatement(sql);
					st.setString(1, t1.getText());
					st.setString(2, t2.getText());
					st.setString(3, t3.getText());
					st.setString(4, (String) comboBox_3.getSelectedItem());
					st.setString(5, (String) comboBox.getSelectedItem());
					st.setString(6, (String) comboBox_1.getSelectedItem());
					st.setString(7, (String) comboBox_2.getSelectedItem());

					int i = st.executeUpdate();
					if (i > 0) {
						JOptionPane.showMessageDialog(null, "Successfully Added");
						this.setVisible(false);
						new home().setVisible(true);
					} else
						JOptionPane.showMessageDialog(null, "error");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			if (ae.getSource() == b2) {
				this.setVisible(false);
				new home().setVisible(true);
			}
		} catch (Exception e) {

		}
	}
}