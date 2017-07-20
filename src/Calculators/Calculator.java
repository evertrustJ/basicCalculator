// James Ni 
//Student No.20660938
//2017-01-23
//Basic Calculator

package Calculators;


// ************** All imports **************
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
// ***************************************** 


public class Calculator {

	//Define variables
	private JFrame platform;
	private JTextField txtShow;
	double firstNum;
	double secondNum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.platform.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		platform = new JFrame();
		platform.setBounds(100, 100, 285, 300);
		platform.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		platform.getContentPane().setLayout(null);
		
		txtShow = new JTextField();
		txtShow.setFont(new Font("Bernard MT Condensed", Font.BOLD, 16));
		txtShow.setHorizontalAlignment(SwingConstants.RIGHT);
		txtShow.setBounds(15, 10, 240, 31);
		platform.getContentPane().add(txtShow);
		txtShow.setColumns(10);
		
		
		
		//----------------Calculator Row1------------------
		/**
		 * Key 7
		 */
		final JButton btn7 = new JButton("7");
		
		//Perform action
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtShow.getText() + btn7.getText();
				txtShow.setText(EnterNumber);
			}
		});
		
		//Additional Info
		btn7.setFont(new Font("Bernard MT Condensed", Font.BOLD, 20));
		btn7.setBounds(10, 54, 50, 50);
		platform.getContentPane().add(btn7);
		
		/**
		 * Key 8
		 */
		final JButton btn8 = new JButton("8");
		
		//Perform action
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtShow.getText() + btn8.getText();
				txtShow.setText(EnterNumber);
			}
		});
		
		//Additional Info
		btn8.setFont(new Font("Bernard MT Condensed", Font.BOLD, 20));
		btn8.setBounds(60, 54, 50, 50);
		platform.getContentPane().add(btn8);
		
		/**
		 * Key 9
		 */
		final JButton btn9 = new JButton("9");
		
		//Perform Action
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtShow.getText() + btn9.getText();
				txtShow.setText(EnterNumber);
			}
		});
		
		//Additional Info
		btn9.setFont(new Font("Bernard MT Condensed", Font.BOLD, 20));
		btn9.setBounds(110, 54, 50, 50);
		platform.getContentPane().add(btn9);
		
		/**
		 * Key Plus
		 */
		JButton btnPlus = new JButton("+");
		
		//Perform Action
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstNum = Double.parseDouble(txtShow.getText());
				txtShow.setText("");
				operations = "+";
			}
		});
		
		// Additional Info
		btnPlus.setFont(new Font("Bernard MT Condensed", Font.BOLD, 20));
		btnPlus.setBounds(160, 54, 50, 50);
		platform.getContentPane().add(btnPlus);
		//------------------------------------------------
		
		
		
		//----------------Calculator Row2------------------
		/**
		 * Key 4
		 */
		final JButton btn4 = new JButton("4");
		
		// Perform Action
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtShow.getText() + btn4.getText();
				txtShow.setText(EnterNumber);
			}
		});
		
		//Additional Info
		btn4.setFont(new Font("Bernard MT Condensed", Font.BOLD, 20));
		btn4.setBounds(10, 104, 50, 50);
		platform.getContentPane().add(btn4);
		
		/**
		 * Key 5
		 */
		final JButton btn5 = new JButton("5");
		
		//Perform Action
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtShow.getText() + btn5.getText();
				txtShow.setText(EnterNumber);
			}
		});
		
		//Additional Info
		btn5.setFont(new Font("Bernard MT Condensed", Font.BOLD, 20));
		btn5.setBounds(60, 104, 50, 50);
		platform.getContentPane().add(btn5);
		
		/**
		 * Key 6
		 */
		final JButton btn6 = new JButton("6");
		
		//Perform Action
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtShow.getText() + btn6.getText();
				txtShow.setText(EnterNumber);
			}
		});
		
		//Additional Info
		btn6.setFont(new Font("Bernard MT Condensed", Font.BOLD, 20));
		btn6.setBounds(110, 104, 50, 50);
		platform.getContentPane().add(btn6);
		
		/**
		 * Key Subtraction
		 */
		JButton btnSub = new JButton("-");
		
		//Perform Action
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstNum = Double.parseDouble(txtShow.getText());
				txtShow.setText("");
				operations = "-";
			}
		});
		
		//Additional Info
		btnSub.setFont(new Font("Bernard MT Condensed", Font.BOLD, 20));
		btnSub.setBounds(160, 104, 50, 50);
		platform.getContentPane().add(btnSub);
		//-------------------------------------------------
		
		
		
		//----------------Calculator Row3------------------
		/**
		 * Key 1
		 */
		final JButton btn1 = new JButton("1");
		
		//Perform Action
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtShow.getText() + btn1.getText();
				txtShow.setText(EnterNumber);
			}
		});
		
		//Additional Info
		btn1.setFont(new Font("Bernard MT Condensed", Font.BOLD, 20));
		btn1.setBounds(10, 154, 50, 50);
		platform.getContentPane().add(btn1);
		
		/**
		 * Key 2
		 */		
		final JButton btn2 = new JButton("2");
		
		//Perform Action
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtShow.getText() + btn2.getText();
				txtShow.setText(EnterNumber);
			}
		});
		
		//Additional Info
		btn2.setFont(new Font("Bernard MT Condensed", Font.BOLD, 20));
		btn2.setBounds(60, 154, 50, 50);
		platform.getContentPane().add(btn2);
				
		/**
		 * Key 3
		 */
		final JButton btn3 = new JButton("3");
		
		//Perform Action
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtShow.getText() + btn3.getText();
				txtShow.setText(EnterNumber);
			}
		});
		
		//Additional Info
		btn3.setFont(new Font("Bernard MT Condensed", Font.BOLD, 20));
		btn3.setBounds(110, 154, 50, 50);
		platform.getContentPane().add(btn3);
		
		/**
		 * Key Multiplication
		 */
		JButton btnMult = new JButton("*");
		
		//Perform Action
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstNum = Double.parseDouble(txtShow.getText());
				txtShow.setText("");
				operations = "*";
			}
		});
		
		//Additional Info
		btnMult.setFont(new Font("Bernard MT Condensed", Font.BOLD, 20));
		btnMult.setBounds(160, 154, 50, 50);
		platform.getContentPane().add(btnMult);
		//-------------------------------------------------
		
		
		
		//----------------Calculator Row4------------------
		/**
		 * Key 0
		 */
		final JButton btn0 = new JButton("0");
		
		//Perform Action
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtShow.getText() + btn0.getText();
				txtShow.setText(EnterNumber);
			}
		});
		
		//Additional Info
		btn0.setFont(new Font("Bernard MT Condensed", Font.BOLD, 20));
		btn0.setBounds(10, 204, 50, 50);
		platform.getContentPane().add(btn0);
					
		/**
		 * Key Dot
		 */
		final JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtShow.getText() + btnDot.getText();
				txtShow.setText(EnterNumber);
			}
		});
		btnDot.setFont(new Font("Bernard MT Condensed", Font.BOLD, 20));
		btnDot.setBounds(60, 204, 50, 50);
		platform.getContentPane().add(btnDot);
				
		/**
		 * Key Plus/minus
		 */
		JButton btnPM = new JButton("P");
		
		//Perform Action
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = Double.parseDouble(String.valueOf(txtShow.getText()));
				ops = ops * (-1);
				txtShow.setText(String.valueOf(ops));
			}
		});
		
		//Additional Info
		btnPM.setFont(new Font("Bernard MT Condensed", Font.BOLD, 20));
		btnPM.setBounds(110, 204, 50, 50);
		platform.getContentPane().add(btnPM);
					
		/**
		 * Key Equal
		 */
		JButton btnEqual = new JButton("=");
		
		//Perform Action
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String answer;
				secondNum = Double.parseDouble(txtShow.getText());
				
				if (operations == "+"){
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					txtShow.setText(answer);
				}
				
				else if (operations == "-"){
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					txtShow.setText(answer);
				}
				
				else if (operations == "*"){
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					txtShow.setText(answer);
				}
				
				else if (operations == "/"){
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					txtShow.setText(answer);
				}
				
				else if (operations == "%"){
					result = firstNum % secondNum;
					answer = String.format("%.2f", result);
					txtShow.setText(answer);
				}
			}
		});
		
		//Additional Info
		btnEqual.setFont(new Font("Bernard MT Condensed", Font.BOLD, 20));
		btnEqual.setBounds(160, 204, 50, 50);
		platform.getContentPane().add(btnEqual);
		//--------------------------------------------------------
		
		//----------------Calculator ExtraColumn------------------
		/**
		 * Key Backspace
		 */
		JButton btnBackSpace = new JButton("<");
		
		//Perform Action
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String backspace = null;
				
				if(txtShow.getText().length() > 0){
					StringBuilder strB = new StringBuilder(txtShow.getText());
					strB.deleteCharAt(txtShow.getText().length() - 1);
					backspace = strB.toString();
					txtShow.setText(backspace);
					
				}
			}
		});
		
		//Additional Info
		btnBackSpace.setFont(new Font("Bernard MT Condensed", Font.BOLD, 20));
		btnBackSpace.setBounds(210, 54, 50, 50);
		platform.getContentPane().add(btnBackSpace);
					
		/**
		 * Key Clear
		 */
		JButton btnClear = new JButton("C");
		
		//Perform Action
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtShow.setText(null);
			}
		});
		
		//Additional Info
		btnClear.setFont(new Font("Bernard MT Condensed", Font.BOLD, 20));
		btnClear.setBounds(210, 104, 50, 50);
		platform.getContentPane().add(btnClear);
						
		/**
		 * Key Modulo
		 */
		JButton btnPercent = new JButton("%");
		
		//Perform Action
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstNum = Double.parseDouble(txtShow.getText());
				txtShow.setText("");
				operations = "%";
			}
		});
		
		//Additional Info
		btnPercent.setFont(new Font("Bernard MT Condensed", Font.BOLD, 20));
		btnPercent.setBounds(210, 154, 50, 50);
		platform.getContentPane().add(btnPercent);
					
		/**
		 * Key Divid
		 */
		JButton btnDivid = new JButton("/");
		
		//Perform Action
		btnDivid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstNum = Double.parseDouble(txtShow.getText());
				txtShow.setText("");
				operations = "/";
			}
		});
		
		// Additional Info
		btnDivid.setFont(new Font("Bernard MT Condensed", Font.BOLD, 20));
		btnDivid.setBounds(210, 204, 50, 50);
		platform.getContentPane().add(btnDivid);
		//----------------------------------------------------
	}
}

