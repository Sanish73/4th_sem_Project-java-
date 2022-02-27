package library1;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class AddBooks extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField t1, t2, t3, t4, t5, t6;
	private JButton b1, b2;
	private static int left=20;//buttonleft
	private static int textleft = 137;
	private static int buttonWidth=88, buttonHeight=33;
	JComboBox<Object> comboBox;

	public static void main(String[] args) {
		new AddBooks().setVisible(true);
	}

	
	public void random() {
		Random rd = new Random();
		t1.setText("" + rd.nextInt(100000 + 1));
	}

	public AddBooks() {
		super("Add Books");
		setBounds(500, 200, 400, 442);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel l6 = new JLabel("Book_id");
		l6.setForeground(new Color(47, 79, 79));
		l6.setFont(new Font("Tahoma", Font.BOLD, 14));
		l6.setBounds(left, 51, 90, 22);
		contentPane.add(l6);

		JLabel l1 = new JLabel("Name");
		l1.setForeground(new Color(47, 79, 79));
		l1.setFont(new Font("Tahoma", Font.BOLD, 14));
		l1.setBounds(left, 84, 90, 22);
		contentPane.add(l1);

		JLabel l2 = new JLabel("ISBN");
		l2.setForeground(new Color(47, 79, 79));
		l2.setFont(new Font("Tahoma", Font.BOLD, 14));
		l2.setBounds(left, 117, 90, 22);
		contentPane.add(l2);

		JLabel l3 = new JLabel("Publisher");
		l3.setForeground(new Color(47, 79, 79));
		l3.setFont(new Font("Tahoma", Font.BOLD, 14));
		l3.setBounds(left, 150, 90, 22);
		contentPane.add(l3);

		JLabel l7 = new JLabel("Edition");
		l7.setForeground(new Color(47, 79, 79));
		l7.setFont(new Font("Tahoma", Font.BOLD, 14));
		l7.setBounds(left, 183, 90, 22);
		contentPane.add(l7);

		JLabel l4 = new JLabel("Price");
		l4.setForeground(new Color(47, 79, 79));
		l4.setFont(new Font("Tahoma", Font.BOLD, 14));
		l4.setBounds(left, 216, 90, 22);
		contentPane.add(l4);

		JLabel l5 = new JLabel("Pages");
		l5.setForeground(new Color(47, 79, 79));
		l5.setFont(new Font("Tahoma", Font.BOLD, 14));
		l5.setBounds(left, 249, 90, 22);
		contentPane.add(l5);
//------------------------------textField ---------------------------------------------------------------------------------------------------------------------
		// bookId ko
		t1 = new JTextField();
		t1.setForeground(new Color(47, 79, 79));
		t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t1.setBounds(textleft, 54, 198, 20);
		t1.setColumns(10);
		contentPane.add(t1);

		t2 = new JTextField();// name ko
		t2.setForeground(new Color(47, 79, 79));
		t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t2.setColumns(10);
		t2.setBounds(textleft, 87, 198, 20);
		contentPane.add(t2);

		t3 = new JTextField();// isb ko
		t3.setForeground(new Color(47, 79, 79));
		t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t3.setColumns(10);
		t3.setBounds(textleft, 120, 198, 20);
		contentPane.add(t3);

		t4 = new JTextField();// publisher ko
		t4.setForeground(new Color(47, 79, 79));
		t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t4.setColumns(10);
		t4.setBounds(textleft, 153, 198, 20);
		contentPane.add(t4);

		comboBox = new JComboBox<Object>();
		String[] values = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		DefaultComboBoxModel<Object> defaultValues = new DefaultComboBoxModel<Object>(values);
		comboBox.setModel(defaultValues);
		comboBox.setBounds(textleft, 186, 194, 20);
		contentPane.add(comboBox);

		t5 = new JTextField();// price
		t5.setForeground(new Color(47, 79, 79));
		t5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t5.setColumns(10);
		t5.setBounds(textleft, 219, 198, 20);
		contentPane.add(t5);

		t6 = new JTextField();// page
		t6.setForeground(new Color(47, 79, 79));
		t6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		t6.setColumns(10);
		t6.setBounds(textleft, 252, 198, 20);
		contentPane.add(t6);

//-------------------button----------------------------------------------------------------------------------
		b1 = new JButton("Add");
		b1.addActionListener(this);
		b1.setBorder(new CompoundBorder(new LineBorder(new Color(128, 128, 128)), null));
		b1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		b1.setBounds(textleft, 300, buttonWidth, buttonHeight);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		contentPane.add(b1);

		b2 = new JButton("Back");
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent ae) {
				// TODO Auto-generated method stub
				try {
					
					if (ae.getSource() == b2) {
						setVisible(false);
						new home().setVisible(true);
							
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
			}
		});
		b2.setBorder(new CompoundBorder(new LineBorder(new Color(105, 105, 105)), null));
		b2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		b2.setBounds(250, 300, buttonWidth, buttonHeight);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		contentPane.add(b2);
//-----------------------------------------------------------------------------------------------------
//
//		JPanel panel = new JPanel();
//		panel.setBorder(new TitledBorder(new LineBorder(new Color(138, 43, 226), 2), "Add Books", TitledBorder.LEADING,
//				TitledBorder.TOP, null, new Color(0, 0, 255)));
//		panel.setBounds(10, 29, 398, 344);
//		contentPane.add(panel);
//
//		panel.setBackground(Color.WHITE);
//		contentPane.setBackground(Color.WHITE);
		random();

	}

	public void actionPerformed(ActionEvent ae) {
		try {
			conn con = new conn();
			String bookId = t1.getText();
			String name = t2.getText();
			String Isbko = t3.getText();
			String PublisherName = t4.getText();
			String price = t5.getText();
			String pages = t6.getText();
			String comboValue = (String) comboBox.getSelectedItem();
			
//			how to text price is int or not
//			int test = Integer.parseInt(price);
			
			if (ae.getSource() == b2) {
				this.setVisible(false);
				new home().setVisible(true);
					
			}
			
			if ( name.isEmpty() && Isbko.isEmpty() && PublisherName.isEmpty() && price.isEmpty() && pages.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please insert Someting!!!!");

			} else if (name.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please insert Your name!!!!");
			} else if (Isbko.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please insert Your Isbook!!!!");
			} else if (PublisherName.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please insert Publisher Name!!!!");
			} else if (price.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please insert Price of Book !!!!");
			} else if (pages.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please insert Book Pages!!!!");
			}

			else {

				if (ae.getSource() == b1) {

					String sql = "insert into book(book_id, name, isbn, publisher, edition, price, pages) values( '"
							+ bookId + "', '" + name + "', '" + Isbko + "', '" + PublisherName + "','" + comboValue
							+ "', '" + price + "', '" + pages + "')";
					int rs = con.s.executeUpdate(sql);
//				PreparedStatement st = con.c.prepareStatement(sql);
//				// st.setInt(1, Integer.parseInt(textField.getText()));
//				st.setString(1, t1.getText());
//				st.setString(2, t2.getText());
//				st.setString(3, t3.getText());
//				st.setString(4, t4.getText());
//				st.setString(5, (String) comboBox.getSelectedItem());
//				st.setString(6, t5.getText());
//				st.setString(7, t6.getText());
//
//				int rs = st.executeUpdate();
					if (rs > 0)
						JOptionPane.showMessageDialog(null, "Successfully Added");
					else
						JOptionPane.showMessageDialog(null, "Error");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					t6.setText("");
//				st.close();
				}
				
				con.c.close();
			}
		} catch (Exception e) {

		}
	}
}