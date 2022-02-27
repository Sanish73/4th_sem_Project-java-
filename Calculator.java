package library1;


import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator implements ActionListener{
	
	JTextField textField;
	
	JButton[] numberButton = new JButton[10];
	JButton[] operatorButton = new JButton[8];
	JButton divButton,mulButton,addButton, subButton;
	JButton equalButton, dotButton, delButton,clrButton;
	JFrame frame;
	JPanel panel;
	char operator;
	
	double num1=0, num2=0, result=0;
	
	
	
	
	Calculator(){
		
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setLocation(580, 210);
		frame.setSize(350, 460);
		frame.setResizable(false);
		
		textField = new JTextField();
		textField.setBounds(21, 21, 295, 43);
		textField.setBackground(Color.GRAY);
		textField.setForeground(Color.green);
		textField.setFont(new Font("null",30,20));
		textField.setEditable(false);
	
	
		
		divButton = new JButton("/");
		mulButton = new JButton("*");
		addButton = new JButton("+");
		subButton = new JButton("-");
		dotButton = new JButton(".");
		clrButton = new JButton("Clear");
		delButton = new JButton("Delete");
		equalButton = new JButton("=");
		
//		equalButton.addActionListener(this);
//		delButton.addActionListener(this);
//		clrButton.addActionListener(this);
//		dotButton.addActionListener(this);
//		subButton.addActionListener(this);
//		addButton.addActionListener(this);
//		equalButton.addActionListener(this);
//		divButton.addActionListener(this);
//		mulButton.addActionListener(this);
//		
		
		operatorButton[0] = addButton;
		operatorButton[1] = subButton;
		operatorButton[2] = mulButton;
		operatorButton[3] = divButton;
		operatorButton[4] = dotButton;
		operatorButton[5] = equalButton;
		operatorButton[6] = delButton;
	
		operatorButton[7] = clrButton;
		
		
		
		for(int i=0; i<8; i++) {
			operatorButton[i].addActionListener(this);
			operatorButton[i].setFocusable(false);
			
			
		}
		
		for(int i=0; i<10; i++) {
			numberButton[i] = new JButton(String.valueOf(i));
			numberButton[i].setFocusable(false);
			numberButton[i].addActionListener(this);
		}
		
		
		delButton.setBounds(21, 350, 140, 43);
		equalButton.setFocusable(false);
		mulButton.setFocusable(false);
		subButton.setFocusable(false);
		divButton.setFocusable(false);
		addButton.setFocusable(false);
		delButton.setFocusable(false);
		dotButton.setFocusable(false);
		clrButton.setBounds(170, 350, 146, 43);
		clrButton.setFocusable(false);
		
		
		
		panel = new JPanel();
		//panel.setBackground(Color.white);
		panel.setBounds(23, 70, 293, 273);
		panel.setLayout(new GridLayout(4,4,3,3));
		
		
		panel.add(numberButton[1]);
		panel.add(numberButton[2]);
		panel.add(numberButton[3]);
		panel.add(addButton);
		
		panel.add(numberButton[4]);
		panel.add(numberButton[5]);
		panel.add(numberButton[6]);
		panel.add(subButton);

		panel.add(numberButton[7]);
		panel.add(numberButton[8]);
		panel.add(numberButton[9]);
		panel.add(mulButton);
		panel.add(dotButton);
		
		panel.add(numberButton[0]);
		panel.add(equalButton);
		panel.add(divButton);
		
		frame.add(panel);
		frame.add(delButton);
		frame.add(clrButton);
		frame.add(textField);
		frame.setVisible(true);
		
	}
	
	
	
	

	public static void main(String[] args) {
		
	Calculator calculator =  new Calculator();
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		for(int i=0;i<10;i++) {
			if(e.getSource() == numberButton[i]) {
				textField.setText(textField.getText().concat(String.valueOf(i)));
			}
			
		}
		if(e.getSource() == dotButton) {
			textField.setText(textField.getText().concat("."));
		}
		
		if(e.getSource() == addButton) {
			num1 = Double.parseDouble(textField.getText());
			operator='+';
			textField.setText("");
		}
		if(e.getSource() == subButton) {
			num1 = Double.parseDouble(textField.getText());
			operator='-';
			textField.setText("");
		}
		if(e.getSource() == mulButton) {
			num1 = Double.parseDouble(textField.getText());
			operator='*';
			textField.setText("");
		}
		if(e.getSource() == divButton) {
			num1 = Double.parseDouble(textField.getText());
			operator='/';
			textField.setText("");
		}
		
		if(e.getSource() == equalButton) {
			
			num2 = Double.parseDouble(textField.getText());
			
			switch(operator) {
			case '+': 
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1*num2;
				break;
			case '/':
				result = num1/num2;
				break;
			
		}
			textField.setText(String.valueOf(result));
			num1 = result;
		}
		
		
		
		if(e.getSource() == clrButton) {
			textField.setText(" ");
		}
		
		if(e.getSource() == delButton) {
			String string = textField.getText();
			textField.setText("");
			for(int i=0; i<string.length()-1; i++) {
				textField.setText(textField.getText()+string.charAt(i));
			}
		}
			
		}
	}


