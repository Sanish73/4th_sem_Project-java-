
package library1;

import javax.swing.*;
import javax.swing.border.*;

//import com.sun.tools.jdeps.Graph;
import java.awt.*;
import java.awt.event.*;

public class home extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JPanel contentPane;
	private JButton b1, b2, b3, b4, b5, b6;
	private JLabel l1;
	private JLabel l2;
	private JPanel panel2;
	private static ImageIcon image;

	public static void main(String[] args) {

		new home();
	}

	public home() {

		this.setBounds(500, 30, 806, 760);
		this.setResizable(false);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(233, 247, 247));
		setContentPane(contentPane);
		contentPane.setLayout(null);

//		this.add(contentPane);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 128, 0), new Color(128, 128, 128)));
		menuBar.setBackground(new Color(250, 250, 210));
		menuBar.setBounds(0, 10, 1000, 35);
		contentPane.add(menuBar);

		JMenu mnRecord = new JMenu("Record");
		mnRecord.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		menuBar.add(mnRecord);

		JMenuItem bookdetails = new JMenuItem("Book Details");
		bookdetails.addActionListener(this);
		bookdetails.setBackground(new Color(211, 211, 211));
		bookdetails.setForeground(Color.DARK_GRAY);
		mnRecord.add(bookdetails);

		JMenuItem studentdetails = new JMenuItem("Student Details");
		studentdetails.addActionListener(this);
		studentdetails.setBackground(new Color(211, 211, 211));
		studentdetails.setForeground(Color.DARK_GRAY);
		mnRecord.add(studentdetails);

		JMenu mnExit = new JMenu("Exit");
		mnExit.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		menuBar.add(mnExit);
//		mnExit.setBounds(10, 10, 10, HEIGHT);
//		contentPane.add(mnExit);

		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.setBackground(new Color(211, 211, 211));
		mntmLogout.setForeground(new Color(105, 105, 105));
		mntmLogout.addActionListener(this);
		mnExit.add(mntmLogout);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setForeground(new Color(105, 105, 105));
		mntmExit.setBackground(new Color(211, 211, 211));
		mntmExit.addActionListener(this);
		mnExit.add(mntmExit);
//		
		JMenu mnHelp = new JMenu("Help");
		mnHelp.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		menuBar.add(mnHelp);

		JMenuItem mntmReadme = new JMenuItem("Read Me");
		mntmReadme.setBackground(new Color(211, 211, 211));
		mntmReadme.setForeground(new Color(105, 105, 105));
		mnHelp.add(mntmReadme);
		mntmReadme.addActionListener(this);

//		
//		
		JMenuItem mntmAboutUs = new JMenuItem("About Us");
		mntmAboutUs.setBackground(new Color(211, 211, 211));
		mntmAboutUs.setForeground(new Color(105, 105, 105));
		mntmAboutUs.addActionListener(this);
		mnHelp.add(mntmAboutUs);
//------------------------------------------------------------------------------------------------------
		l1 = new JLabel("Library Management System");
		l1.setForeground(new Color(34, 139, 34));
		l1.setFont(new Font("Tahoma", Font.BOLD, 34));
		l1.setBounds(140, 30, 701, 80);
		contentPane.add(l1);
//----------------------------------------------------------------------------------------------
		b1 = new JButton("Add Books");
		b1.addActionListener(this);
		b1.setFont(new Font("Tahoma", Font.BOLD, 14));
		b1.setBackground(new Color(250, 250, 210));
		b1.setForeground(new Color(46, 139, 87));
		b1.setBounds(60, 320, 159, 44);
		b1.setFocusable(false);
		contentPane.add(b1);

		b2 = new JButton("Statistics");
		b2.setFont(new Font("Tahoma", Font.BOLD, 14));
		b2.setBackground(new Color(250, 250, 210));
		b2.setForeground(new Color(46, 139, 87));
		b2.addActionListener(this);
//		b2.setBackground(Color.BLACK);
//		b2.setForeground(Color.WHITE);
		b2.setBounds(313, 320, 139, 44);
		b2.setFocusable(false);
		contentPane.add(b2);

//		b5 = new JButton("Students");
//		b5.addActionListener(this);
//		b5.setBackground(Color.BLACK);
//		b5.setForeground(Color.WHITE);
//		b5.setBounds(310,320,159,41);
//		contentPane.add(b5);

		b3 = new JButton("Add Students");
		b3.setFont(new Font("Tahoma", Font.BOLD, 14));
		b3.setBackground(new Color(250, 250, 210));
		b3.setForeground(new Color(46, 139, 87));
		b3.setFocusable(false);
		b3.addActionListener(this);
		b3.setBounds(562, 320, 167, 44);
		contentPane.add(b3);

		b4 = new JButton("Issue Book");
		b4.setFont(new Font("Tahoma", Font.BOLD, 14));
		b4.setBackground(new Color(250, 250, 210));
		b4.setForeground(new Color(139, 69, 19));
		b4.setFocusable(false);
		b4.addActionListener(this);
		b4.setBounds(76, 620, 159, 41);
		contentPane.add(b4);

		b5 = new JButton("Return Book");
		b5.setFont(new Font("Tahoma", Font.BOLD, 14));
		b5.setFocusable(false);
		b5.addActionListener(this);
		b5.setBackground(new Color(250, 250, 210));
		b5.setForeground(new Color(139, 69, 19));
		b5.setFocusable(false);
		b5.setBounds(310, 620, 159, 41);
		contentPane.add(b5);

		b6 = new JButton("About Us");
		b6.setFont(new Font("Tahoma", Font.BOLD, 14));
		b6.setFocusable(false);
		b6.addActionListener(this);
		b6.setBackground(new Color(250, 250, 210));
		b6.setForeground(new Color(139, 69, 19));
		b4.setFocusable(false);
		b6.setBounds(562, 620, 159, 41);
		contentPane.add(b6);

//		l2 = new JLabel("");
//		l2.setVerticalAlignment(SwingConstants.TOP);
//		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("D:\\java new 1\\library1\\second.png"));
//		Image i2 = i1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
//		ImageIcon i3 = new ImageIcon(i2);
//		l2 = new JLabel(i3);
//		l2.setBounds(60,140,159,152);
//		contentPane.add(l2);
//		

//----------------------------------------------------------------------------------------------------------------------------------------------------	

		ImageIcon i161 = new ImageIcon("D:/java new 1/library1/book5.png"); // 1st
//		System.out.println(i161.getIconHeight());
//		System.out.println(i161.getIconWidth());
		JLabel l71 = new JLabel(i161);
		Image i171 = i161.getImage().getScaledInstance(246, 182, Image.SCALE_SMOOTH);
		ImageIcon i181 = new ImageIcon(i171);
		l71 = new JLabel(i181);
		l71.setBounds(60, 160, 159, 152);
		contentPane.add(l71);

		ImageIcon i4 = new ImageIcon("D:/java new 1/library1/add.png"); // 3rd
		JLabel l3 = new JLabel("");
//		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("library1/stat1.png"));

//		System.out.println(i4.getIconHeight());
//		System.out.println(i4.getIconWidth());
		Image i5 = i4.getImage().getScaledInstance(170, 176, Image.SCALE_SMOOTH);
		ImageIcon i6 = new ImageIcon(i5);
		l3 = new JLabel(i6);
//		l3.setSize(150,1000);
		l3.setBounds(501, 135, 300, 180);
		contentPane.add(l3);

		JLabel l4 = new JLabel(""); // 2nd
		ImageIcon I7 = new ImageIcon("D:/java new 1/library1/stat1.png");
		Image I8 = I7.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		ImageIcon i9 = new ImageIcon(I8);
		l4 = new JLabel(i9);
		l4.setBounds(238, 140, 290, 180);
		contentPane.add(l4);

		JLabel l5 = new JLabel("");// 4th
		ImageIcon i10 = new ImageIcon("D:/java new 1/library1/add4.png");
//	System.out.println(i10.getIconWidth());
		Image i11 = i10.getImage().getScaledInstance(200, 220, Image.SCALE_DEFAULT);
		ImageIcon i12 = new ImageIcon(i11);
		l5 = new JLabel(i12);
		l5.setBounds(90, 480, 159, 163);
		contentPane.add(l5);

		JLabel l6 = new JLabel("");// 5th
		ImageIcon i13 = new ImageIcon("D:/java new 1/library1/stat1.png");
		Image i14 = i13.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i15 = new ImageIcon(i14);
		l6 = new JLabel(i15);
		l6.setBounds(332, 460, 139, 152);
		contentPane.add(l6);

		JLabel l7 = new JLabel(""); // 6th
		ImageIcon i16 = new ImageIcon("D:/java new 1/library1/stat1.png");
		Image i17 = i16.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
		ImageIcon i18 = new ImageIcon(i17);
		l7 = new JLabel(i18);
		l7.setBounds(562, 440, 157, 152);
		contentPane.add(l7);

//------------------------------------------------------------------------------------------------------------------------------------------------------

//		panel2 = new JPanel();
//		panel2.setBorder(new TitledBorder(new LineBorder(new Color(139, 69, 19), 2), "Action", TitledBorder.CENTER,
//				TitledBorder.TOP, null, new Color(220, 20, 60)));
//		panel2.setBounds(20, 420, 750, 270);
//		panel2.setBackground(Color.WHITE);
//		contentPane.add(panel2);
//
//		JPanel panel = new JPanel();
//		panel.setBorder(new TitledBorder(new LineBorder(new Color(46, 139, 87), 2), "Operation", TitledBorder.CENTER,
//				TitledBorder.TOP, null, new Color(220, 20, 60)));
//		panel.setBounds(20, 120, 750, 260);
//		panel.setBackground(Color.WHITE);
//		contentPane.add(panel);

//---------------------------------------------------------------------------------------------------------------------------------------------------------------	

//		b2 = new JButton("Statistics");
//		b2.addActionListener(this);
//		b2.setBackground(Color.BLACK);
//	b2.setSize(50,50);
//		
//		b2.setForeground(Color.WHITE);
//	System.out.println(b2.getSize());
//	b2.setBounds(100, 100, 3, 5);
//		panel2.add(b2);
//		
//		contentPane.add(panel2);

//		JLabel l51 = new JLabel("");
//		ImageIcon i101 = new ImageIcon(ClassLoader.getSystemResource("third.png"));
//		Image i111 = i101.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
//		ImageIcon i121 = new ImageIcon(i111);
//		l51 = new JLabel(i121);
//		l51.setBounds(60,440,159,163);
//		contentPane.add(l51);
//		
//		JLabel l61 = new JLabel("");
//		ImageIcon i131 = new ImageIcon(ClassLoader.getSystemResource("D:\\java new 1\\library1\\src\\library1\\third.png"));
//		Image i141 = i131.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
//		ImageIcon i151 = new ImageIcon(i141);
//		l61 = new JLabel(i151);
//		l61.setBounds(332,440,139,152);
//		contentPane.add(l61);

		this.setVisible(true);

	}

//	 /---------------------------------------------------------------------------------------------------------

	public void actionPerformed(ActionEvent ae) {

		String msg = ae.getActionCommand();
		if (msg.equals("Logout")) {
			setVisible(false);
			new Login_user().setVisible(true);
		} else if (msg.equals("Exit")) {
			System.exit(ABORT);

		} else if (msg.equals("Student Details")) {
			this.setVisible(false);
			new StudentDetails().setVisible(true);
		} else if (msg.equals("About Us")) {
//			new aboutUs().setVisible(true);

		} else if (msg.equals("Book Details")) {
			setVisible(false);
			new BookDetails().setVisible(true);

		}

		if (ae.getSource() == b1) {
			this.setVisible(false);
			new AddBooks().setVisible(true);
			
		}
		if (ae.getSource() == b2) {
			this.setVisible(false);
			new Statistics().setVisible(true);
		}
		if (ae.getSource() == b3) {
			this.setVisible(false);
			new AddStudent().setVisible(true);
		}

		if (ae.getSource() == b4) {
			this.setVisible(false);
			new IssueBook().setVisible(true);
		}

		if (ae.getSource() == b5) {
			this.setVisible(false);
			new ReturnBook().setVisible(true);
		}

		if (ae.getSource() == b6) {
			this.setVisible(false);
//			new aboutUs().setVisible(true);
		}
	}

}
