 package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class calculator implements ActionListener{

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextArea textarea = new JTextArea(2,10);
	
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	JButton button0 = new JButton();
	
	JButton buttonadd = new JButton();
	JButton buttonsub = new JButton();
	JButton buttonmul = new JButton();
	JButton buttondiv = new JButton();
	JButton buttonclear = new JButton("Clear");
	JButton buttondot = new JButton("DOT");
	JButton buttonequal = new JButton();
	
	double number1, number2, result;
	int sumc=0, subc=0, mulc=0, divc=0 ;
	
	
	public calculator() {
	
		frame.setSize(340,450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Scientific Calculator - by Tumpa Sheet");
		
		frame.setResizable(false);
		
		frame.add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		
		
		panel.add(textarea);
	
		textarea.setBackground(Color.BLACK);
		Border tborder = BorderFactory.createLineBorder(Color.BLUE,3);
		textarea.setBorder(tborder);
		Font font = new Font("arial",Font.BOLD,33);
		textarea.setFont(font);
		textarea.setForeground(Color.WHITE);
		
		textarea.setPreferredSize(new Dimension(2,10));
		textarea.setLineWrap(true);
		
		button1.setPreferredSize(new Dimension(100,40));
		button1.setIcon(new ImageIcon("C:\\Users\\TS\\eclipse-workspace\\Calculator Project\\src\\images\\icons1.png"));
		
		button2.setPreferredSize(new Dimension(100,40));
		button2.setIcon(new ImageIcon("C:\\Users\\TS\\eclipse-workspace\\Calculator Project\\src\\images\\icons2.png"));
		
		button3.setPreferredSize(new Dimension(100,40));
		button3.setIcon(new ImageIcon("C:\\Users\\TS\\eclipse-workspace\\Calculator Project\\src\\images\\icons3.png"));
		
		button4.setPreferredSize(new Dimension(100,40));
		button4.setIcon(new ImageIcon("C:\\Users\\TS\\eclipse-workspace\\Calculator Project\\src\\images\\icons4.png"));
		
		button5.setPreferredSize(new Dimension(100,40));
		button5.setIcon(new ImageIcon("C:\\Users\\TS\\eclipse-workspace\\Calculator Project\\src\\images\\icons5.png"));
		
		button6.setPreferredSize(new Dimension(100,40));
		button6.setIcon(new ImageIcon("C:\\Users\\TS\\eclipse-workspace\\Calculator Project\\src\\images\\icons6.png"));
		
		button7.setPreferredSize(new Dimension(100,40));
		button7.setIcon(new ImageIcon("C:\\Users\\TS\\eclipse-workspace\\Calculator Project\\src\\images\\icons7.png"));
		
		button8.setPreferredSize(new Dimension(100,40));
		button8.setIcon(new ImageIcon("C:\\Users\\TS\\eclipse-workspace\\Calculator Project\\src\\images\\icons8.png"));
		
		button9.setPreferredSize(new Dimension(100,40));
		button9.setIcon(new ImageIcon("C:\\Users\\TS\eclipse-workspace\\Calculator Project\\src\\images\\icons9.png"));
		
		button0.setPreferredSize(new Dimension(100,40));
		button0.setIcon(new ImageIcon("C:\\Users\\TS\eclipse-workspace\\Calculator Project\\src\\images\\icons0.png"));
		
		buttonadd.setPreferredSize(new Dimension(100,40));
		buttonadd.setIcon(new ImageIcon("C:\\Users\\TS\\eclipse-workspace\\Calculator Project\\src\\images\\iconssum.png"));
		
		buttonsub.setPreferredSize(new Dimension(100,40));
		buttonsub.setIcon(new ImageIcon("C:\\Users\\TS\\eclipse-workspace\\Calculator Project\\src\\images\\iconssub.png"));
		
		buttonmul.setPreferredSize(new Dimension(100,40));
		buttonmul.setIcon(new ImageIcon("C:\\Users\\TS\\eclipse-workspace\\Calculator Project\\src\\images\\iconsmul.png"));
		
		buttondiv.setPreferredSize(new Dimension(100,40));
		buttondiv.setIcon(new ImageIcon("C:\\Users\\TS\\eclipse-workspace\\Calculator Project\\src\\images\\iconsdiv.png"));
		
		buttondot.setPreferredSize(new Dimension(100,40));
		
		buttonequal.setPreferredSize(new Dimension(100,40));
		buttonequal.setIcon(new ImageIcon("C:\\Users\\TS\\eclipse-workspace\\Calculator Project\\src\\images\\iconsequal.png"));
		
		buttonclear.setPreferredSize(new Dimension(100,40));
		
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button0);
		panel.add(buttonadd);
		panel.add(buttonsub);
		panel.add(buttonmul);
		panel.add(buttondiv);
		panel.add(buttondot);
		panel.add(buttonequal);
		panel.add(buttonclear);
		
		button1.addActionListener((ActionListener) this);
		button2.addActionListener((ActionListener) this);
		button3.addActionListener((ActionListener) this);
		button4.addActionListener((ActionListener) this);
		button5.addActionListener((ActionListener) this);
		button6.addActionListener((ActionListener) this);
		button7.addActionListener((ActionListener) this);
		button8.addActionListener((ActionListener) this);
		button9.addActionListener((ActionListener) this);
		button0.addActionListener((ActionListener) this);
		buttonadd.addActionListener((ActionListener) this);
		buttonsub.addActionListener((ActionListener) this);
		buttonmul.addActionListener((ActionListener) this);
		buttondiv.addActionListener((ActionListener) this);
		buttondot.addActionListener((ActionListener) this);
		buttonequal.addActionListener((ActionListener) this);
		buttonclear.addActionListener((ActionListener) this);
	 
  }
	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();    //the object on which the event initially occurs
		if(obj == buttonclear) {
			number1 = 0.0;
			number2 = 0.0;
			textarea.setText("");
		}
		if(obj == button1) {
			textarea.append("1");
		}
		if(obj == button2) {
			textarea.append("2");
		}
		if(obj == button3) {
			textarea.append("3");
		}
		if(obj == button4) {
			textarea.append("4");
		}
		if(obj == button5) {
			textarea.append("5");
		}
		if(obj == button6) {
			textarea.append("6");
		}
		if(obj == button7) {
			textarea.append("7");
		}
		if(obj == button8) {
			textarea.append("8");
		}
		if(obj == button9) {
			textarea.append("9");
		}
		if(obj == button0) {
			textarea.append("0");
		}
		if(obj == buttondot) {
			textarea.append(".");
		}
		if(obj == buttonadd) {
			number1 = number_reader();
			textarea.setText("");
			sumc = 1;
			subc = 0;
			mulc = 0; 
			divc = 0;
		}
		if(obj == buttonsub) {
			number1 = number_reader();
			textarea.setText("");
			sumc = 0;
			subc = 1;
			mulc = 0; 
			divc = 0;
		}
		if(obj == buttondiv) {
			number1 = number_reader();
			textarea.setText("");
			sumc = 0;
			subc = 0;
			mulc = 0; 
			divc = 1;
		}
		if(obj == buttonmul) {
			number1 = number_reader();
			textarea.setText("");
			sumc = 0;
			subc = 0;
			mulc = 1; 
			divc = 0;
		}
		if(obj == buttonequal) {
			number2 = number_reader();
			if(sumc > 0) {
				result = number1 + number2;
				textarea.setText(Double.toString(result)); 
				//The Double class wraps a value of the primitive type double in an object. 
				//An object of type Double contains a single field whose type is double. 
			}
			if(subc > 0) {
				result = number1 - number2;
				textarea.setText(Double.toString(result)); 							}
			if(mulc > 0) {
				result = number1 * number2;
				textarea.setText(Double.toString(result)); 				
			}
			if(divc > 0) {
				result = number1 / number2;
				textarea.setText(Double.toString(result)); 	
			}
		}
	}
	
	public double number_reader() {
		double num = 0.0;
		String s = textarea.getText();
		num = Double.valueOf(s);
		return num;
	}
	
}
