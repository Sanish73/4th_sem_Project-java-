package library1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LibraryManagementSystem extends JFrame implements ActionListener {

	JLabel l1;
	JButton b1;

	public LibraryManagementSystem() {

//               this.setSize(1366,390);
		this.setLayout(null);
//                this.setLocation(300,300);
		this.setBounds(100, 70, 1366, 700);

		l1 = new JLabel("");
		b1 = new JButton("Next");

		b1.setBackground(Color.WHITE);
		b1.setForeground(Color.BLACK);

//                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/first.jpg"));
		ImageIcon i1 = new ImageIcon("D:/java new 1/library1/stat1.png");
		Image i3 = i1.getImage().getScaledInstance(1366, 390, Image.SCALE_DEFAULT);
		ImageIcon i2 = new ImageIcon(i3);
		l1 = new JLabel(i2);

		b1.setBounds(1050, 250, 200, 60);
		l1.setBounds(0, 0, 1366, 390);

		l1.add(b1);
		add(l1);

		b1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae) {
		this.setVisible(true);

		new Login_user().setVisible(true);

	}

	public static void main(String[] args) {
		LibraryManagementSystem window = new LibraryManagementSystem();
		window.setVisible(true);
	}
}