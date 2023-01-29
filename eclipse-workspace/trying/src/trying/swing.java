package trying;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Font;

public class swing extends JFrame {
    
	private JPanel contentPane;
	private JTextField TF;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing frame = new swing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public swing() {
		setTitle("CALC");
		setIconImage(Toolkit.getDefaultToolkit().getImage(swing.class.getResource("/trying/icons8-calculator-500 (1).png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 334);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TF = new JTextField();
		TF.setEditable(false);
		TF.setFont(new Font("Dialog", Font.BOLD, 25));
		TF.setToolTipText("");
		TF.setBackground(new Color(204, 255, 153));
		TF.setBounds(12, 12, 516, 50);
		contentPane.add(TF);
		TF.setColumns(10);
		
		JButton ONE = new JButton("1");
		ONE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			         TF.setText(TF.getText() + '1');
			}
		});
		ONE.setBounds(12, 74, 117, 25);
		contentPane.add(ONE);
           
		JButton THREE = new JButton("3");
		THREE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TF.setText(TF.getText() + '3');
			}
		});
		THREE.setBounds(311, 74, 117, 25);
		contentPane.add(THREE);
		
		JButton TWO = new JButton("2");
		TWO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TF.setText(TF.getText() + '2');
			  
			}
			
		});
		TWO.setBounds(163, 74, 117, 25);
		contentPane.add(TWO);
		
		JButton FOUR = new JButton("4");
		FOUR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TF.setText(TF.getText() + '4');
			}
		});
		FOUR.setBounds(12, 124, 117, 25);
		contentPane.add(FOUR);
		
		JButton SEVEN = new JButton("7");
		SEVEN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TF.setText(TF.getText() + '7');
			}
		});
		SEVEN.setBounds(12, 177, 117, 25);
		contentPane.add(SEVEN);
		
		JButton FIVE = new JButton("5");
		FIVE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TF.setText(TF.getText() + '5');
			}
		});
		FIVE.setBounds(163, 124, 117, 25);
		contentPane.add(FIVE);
		
		JButton SIX = new JButton("6");
		SIX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TF.setText(TF.getText() + '6');
			}
		});
		SIX.setBounds(311, 124, 117, 25);
		contentPane.add(SIX);
		
		JButton NINE = new JButton("9");
		NINE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TF.setText(TF.getText() + '9');
			}
		});
		NINE.setBounds(311, 177, 117, 25);
		contentPane.add(NINE);
		
		JButton EIGHT = new JButton("8");
		EIGHT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TF.setText(TF.getText() + '8');
			}
		});
		EIGHT.setBounds(163, 177, 117, 25);
		contentPane.add(EIGHT);
		
		JButton PLUS = new JButton("+");
		PLUS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TF.setText(TF.getText() + '+');
			}
		});
		PLUS.setBounds(440, 74, 58, 57);
		contentPane.add(PLUS);
		
		JButton MINUS = new JButton("-");
		MINUS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TF.setText(TF.getText() + '-');
			}
		});
		MINUS.setBounds(440, 145, 58, 57);
		contentPane.add(MINUS);
		
		JButton EQUAL = new JButton("=");
		EQUAL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				evaluate(TF.getText());
				
			}
		});
		EQUAL.setBounds(440, 214, 58, 57);
		contentPane.add(EQUAL);
		
		JButton DIVIDE = new JButton("/");
		DIVIDE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TF.setText(TF.getText() + '/');
			}
		});
		DIVIDE.setBounds(347, 214, 58, 57);
		contentPane.add(DIVIDE);
		
		JButton MUL = new JButton("*");
		MUL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TF.setText(TF.getText() + '*');
			}
		});
		MUL.setBounds(12, 214, 58, 57);
		contentPane.add(MUL);
		
		JButton ZERO = new JButton("0");
		ZERO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TF.setText(TF.getText() + '0');
			}
		});
		ZERO.setBounds(163, 230, 117, 25);
		contentPane.add(ZERO);
		JButton CLR = new JButton("CLR");
		CLR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				TF.setText("");
			}
		});
		CLR.setBounds(82, 214, 69, 57);
		contentPane.add(CLR);
		
		
	}
	public  void evaluate(String expression) {
	      char[] arr = expression.toCharArray();
	      String operand1 = "";String operand2 = "";String operator = "";
	      double result = 0;

	      for (int i = 0; i < arr.length; i++) {
	         if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.') {
	            if(operator.isEmpty()){
	               operand1 += arr[i];
	            }else{
	               operand2 += arr[i];
	            }
	         }  

	         if(arr[i] == '+' || arr[i] == '-' || arr[i] == '/' || arr[i] == '*') {
	            operator += arr[i];
	         }
	      }

	      if (operator.equals("+"))
	         result = (Double.parseDouble(operand1) + Double.parseDouble(operand2));
	      else if (operator.equals("-"))
	         result = (Double.parseDouble(operand1) - Double.parseDouble(operand2));
	      else if (operator.equals("/"))
	         result = (Double.parseDouble(operand1) / Double.parseDouble(operand2));
	      else
	         result = (Double.parseDouble(operand1) * Double.parseDouble(operand2));          
	      String ans = Double.toString((result));
	      TF.setText(ans);
	   }    
	
}