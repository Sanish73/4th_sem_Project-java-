package library1;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;

public class Statistics extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

//---------------------main ----------------------------------
	public static void main(String[] args) {
		new Statistics().setVisible(true);
	}

//------------issuBook Table -----------------------------------------
	public void issueBook() {
		try {
			conn con = new conn();
			String sql = "select * from IssueBook";
			PreparedStatement st = con.c.prepareStatement(sql);
			ResultSet rs = st.executeQuery();

			table.setModel(DbUtils.resultSetToTableModel(rs));

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

//------------------return book table ------------------------------------------
	public void returnBook() {
		try {
			conn con = new conn();
			String sql = "select * from student";
			PreparedStatement st = con.c.prepareStatement(sql);
			ResultSet rs = st.executeQuery();

			table_1.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

//-------------------------constructor------------------------------------------
	public Statistics() {
		super("Statistics");
		this.setBounds(500, 176, 810, 594);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(233, 247, 247));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

//---------------button------------------------------------------------------------------------
		JLabel l1 = new JLabel("Back");
		l1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setVisible(false);
				home home = new home();
				home.setVisible(true);
			}
		});

		l1.setForeground(new Color(204, 0, 102));
		l1.setFont(new Font("Tahoma", Font.BOLD, 18));
		ImageIcon i1 = new ImageIcon("D:/java new 1/library1/add.png");
		Image i2 = i1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		l1.setIcon(i3);
		l1.setBounds(690, 13, 96, 27);
		contentPane.add(l1);
//---------------------------------------------------------------------------------------------
		JScrollPane scrollPane_1 = new JScrollPane();// return boook ko
		scrollPane_1.setBounds(40, 316, 717, 217);
		contentPane.add(scrollPane_1);

		table_1 = new JTable();
		table_1.setBackground(new Color(250, 250, 210));
		table_1.setForeground(Color.black);
		table_1.setFont(new Font("Sitka Small", Font.PLAIN, 12));
		scrollPane_1.setViewportView(table_1);
			//------------------------------//
		JScrollPane scrollPane = new JScrollPane();// issue book ko
		scrollPane.setBounds(40, 51, 708, 217);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setBackground(new Color(250, 250, 210));
		table.setForeground(Color.BLACK);
		table.setFont(new Font("Sitka Small", Font.PLAIN, 12));
		scrollPane.setViewportView(table);

//--------------------border -------------------------------------------------------
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(47, 79, 79), 2, true), "Issue-Book-Details",
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 128, 128)));
//		panel.setForeground(new Color(0, 128, 128));
		panel.setBounds(26, 36, 737, 240);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);

		JPanel panel_1 = new JPanel();
		Color color1 = new Color(139,69,18);
		LineBorder line1 = new LineBorder(color1,2,true);
		panel_1.setBorder(new TitledBorder(line1, "Return-Book-Details",TitledBorder.CENTER, TitledBorder.TOP, null, new Color(139, 69, 19)));
		panel_1.setBounds(22, 299, 741, 240);
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1);

		issueBook();
		returnBook();
	}
}