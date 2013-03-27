import java.awt.*;
import java.util.Iterator;
import javax.swing.*;
import java.util.Stack;
import java.awt.event.*;


public class CalcFrame {
	static Stack rpn;
	static StringBuffer sb = new StringBuffer();
	static JTextField textfield = null;
	static JTextField stack1 = null;
	static JTextField stack2 = null;
	static JTextField stack3 = null;
	static JTextField stack4 = null;
	
	private static void createWindow() {
		rpn = new Stack();
		JFrame frame = new JFrame("RPN Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(256,256);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		frame.getContentPane().add(panel);
		panel.setPreferredSize(new Dimension(500,500));
		textfield = new JTextField();
		textfield.setBounds(75,20,200,25);
		panel.add(textfield);
		stack1 = new JTextField();
		stack1.setBounds(400,250,100,25);
		panel.add(stack1);
		stack2 = new JTextField();
		stack2.setBounds(400,200,100,25);
		panel.add(stack2);
		stack3 = new JTextField();
		stack3.setBounds(400,150,100,25);
		panel.add(stack3);
		stack4 = new JTextField();
		stack4.setBounds(400,100,100,25);
		panel.add(stack4);
		final JTextField stackArray[] = {stack1,stack2,stack3,stack4};
		
		JButton enter = new JButton("Enter");
		enter.setBounds(25,375,200,50);
		panel.add(enter);
		enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rpn.push(textfield.getText());
				System.out.println(rpn);
				Iterator it = rpn.iterator();
				for (int i = 0;i < rpn.size();i++) {
					stackArray[i].setText((String)it.next());
				}
				textfield.setText("");
			}
		});
		
		//add number & operation buttons
		JButton button1 = CreateNumButton(25,75,50,50,"1");
		panel.add(button1);
		JButton button2 = CreateNumButton(100,75,50,50,"2");
		panel.add(button2);
		JButton button3 = CreateNumButton(175,75,50,50,"3");
		panel.add(button3);
		JButton button4 = CreateNumButton(25,150,50,50,"4");
		panel.add(button4);
		JButton button5 = CreateNumButton(100,150,50,50,"5");
		panel.add(button5);
		JButton button6 = CreateNumButton(175,150,50,50,"6");
		panel.add(button6);
		JButton button7 = CreateNumButton(25,225,50,50,"7");
		panel.add(button7);
		JButton button8 = CreateNumButton(100,225,50,50,"8");
		panel.add(button8);
		JButton button9 = CreateNumButton(175,225,50,50,"9");
		panel.add(button9);
		JButton button0 = CreateNumButton(100,300,50,50,"0");
		panel.add(button0);
		JButton buttonAdd = CreateOpsButton(275,75,100,50,"+");
		panel.add(buttonAdd);
		JButton buttonMinus = CreateOpsButton(275,150,100,50,"-");
		panel.add(buttonMinus);
		JButton buttonMultiply = CreateOpsButton(275,225,100,50,"*");
		panel.add(buttonMultiply);
		JButton buttonDivide = CreateOpsButton(275,300,100,50,"/");
		panel.add(buttonDivide);
		
		//finish off JFrame
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		createWindow();
	}
	
	public static JButton CreateNumButton(int x, int y, int length, int width, String label) {
		JButton button = new JButton(label);
		button.setBounds(x,y,length,width);
		final String num = label;
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CalcFrame.sb.append(num);
				CalcFrame.textfield.setText(textfield.getText() + num);
			}
		});
		return button;
	}
	
	public static JButton CreateOpsButton(int x, int y, int length, int width, String label) {
		JButton button = new JButton(label);
		button.setBounds(x,y,length,width);
		final String op = label;
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (op == "+") {
					int result = Integer.parseInt(textfield.getText()) + Integer.valueOf((String) rpn.pop());
					CalcFrame.textfield.setText("" + result);
				}
				if (op == "-") {
					int result = Integer.parseInt(textfield.getText()) - Integer.valueOf((String) rpn.pop());
					CalcFrame.textfield.setText("" + result);
					
				}
				if (op == "/") {
					int result = Integer.parseInt(textfield.getText()) / Integer.valueOf((String) rpn.pop());
					CalcFrame.textfield.setText("" + result);
					
				}
				if (op == "*") {
					int result = Integer.parseInt(textfield.getText()) * Integer.valueOf((String) rpn.pop());
					CalcFrame.textfield.setText("" + result);
					
				}
			}
		});
		return button;
	}
	
}

