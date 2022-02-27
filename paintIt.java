package library1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class paintIt extends JPanel {
	
	
	
	private ImageIcon icon;
	

	
	public void paint(Graphics g) {
		
		
		icon = new ImageIcon("D:/java new 1/library1/book5.png");
		icon.paintIcon(this, g, 25, 11);
//		icon.
//		System.out.println(icon.getIconHeight());	
//		System.out.println(icon.getIconWidth());	
		
		
	
		
		
		g.setColor(Color.BLACK);
		g.drawRect(24, 10, 851, 50);
		setBackground(Color.WHITE);  
        g.fillRect(130, 30,100, 80);  
		
	}
	
	 public static void main(String[] args) {  
		 paintIt m=new paintIt();  
		 
	        JFrame f=new JFrame();  
	        
	        
	        
	        
	        f.add(m);  
	        f.setSize(400,400);  
	        //f.setLayout(null);  
	        f.setVisible(true);  

	 }
}
