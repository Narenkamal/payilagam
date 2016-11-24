package simplecalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.io.EOFException;

import javax.swing.ImageIcon;

public class frame2 {

	protected static final String J = null;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField firstnumbertext;
	private JTextField secondnumbertext;
	private JLabel lblNewLabel_1;
	private JButton plusButton;
	private JButton minusbutton;
	private JButton multiplybutton;
	private JButton dividsionbutton;
	private JLabel label;
	private JLabel anwserlabel;
	private JTextField textfieldAns;

	/**
	 * Launch the application.
	 * @return 
	 */

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame2 window = new frame2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frame2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		firstnumbertext = new JTextField();
		firstnumbertext.setBounds(91, 59, 143, 20);
		frame.getContentPane().add(firstnumbertext);
		firstnumbertext.setColumns(10);
		
		secondnumbertext = new JTextField();
		secondnumbertext.setBounds(91, 121, 143, 20);
		frame.getContentPane().add(secondnumbertext);
		secondnumbertext.setColumns(10);
		
		JLabel lblNewLabel = new JLabel(" first num");
		lblNewLabel.setBounds(30, 34, 71, 14);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("second num");
		lblNewLabel_1.setBounds(30, 96, 71, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		plusButton = new JButton("add");
		plusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try{
					num1=Integer.parseInt(firstnumbertext.getText());
					num2=Integer.parseInt(secondnumbertext.getText());
					ans=num1+num2;
					textfieldAns.setText(Integer.toString(ans));
				}catch(Exception e1){
					
				}
				}
		});
		plusButton.setToolTipText("add");
		plusButton.setBounds(10, 155, 77, 33);
		frame.getContentPane().add(plusButton);
		
		minusbutton = new JButton("sub");
		minusbutton.setToolTipText("sub");
		minusbutton.addActionListener(new ActionListener() {
			private Object joptionpane;

			public void actionPerformed(ActionEvent arg0 ) {
				int num1,num2,ans;
				try{
					num1=Integer.parseInt(firstnumbertext.getText());
					num2=Integer.parseInt(secondnumbertext.getText());
					ans=num1-num2;
					textfieldAns.setText(Integer.toString(ans));
				}catch(Exception e){
					
				}
			}

			public Object getJoptionpane() {
				return joptionpane;
			}

			public void setJoptionpane(Object joptionpane) {
				this.joptionpane = joptionpane;
			}
		});
		minusbutton.setBounds(91, 155, 85, 33);
		frame.getContentPane().add(minusbutton);
		
		multiplybutton = new JButton("mul");
		multiplybutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try{
					num1=Integer.parseInt(firstnumbertext.getText());
					num2=Integer.parseInt(secondnumbertext.getText());
					ans=num1*num2;
					textfieldAns.setText(Integer.toString(ans));
				}catch(Exception e1){
					
				}
			}
		});
		multiplybutton.setToolTipText("mul");
		multiplybutton.setBounds(186, 155, 85, 33);
		frame.getContentPane().add(multiplybutton);
		
		dividsionbutton = new JButton("div");
		dividsionbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try{
					num1=Integer.parseInt(firstnumbertext.getText());
					num2=Integer.parseInt(secondnumbertext.getText());
					ans=num1/num2;
					textfieldAns.setText(Integer.toString(ans));
				}catch(Exception e1){
					
				}
			}
		});
		dividsionbutton.setToolTipText("div");
		dividsionbutton.setBounds(281, 155, 85, 33);
		frame.getContentPane().add(dividsionbutton);
		
		anwserlabel = new JLabel("The result is");
		anwserlabel.setFont(new Font("Times New Roman", Font.BOLD, 13));
		anwserlabel.setBounds(30, 220, 91, 14);
		frame.getContentPane().add(anwserlabel);
		
		textfieldAns = new JTextField();
		textfieldAns.setBounds(131, 214, 140, 26);
		frame.getContentPane().add(textfieldAns);
		textfieldAns.setColumns(10);
		
		
		
		
		
		
		
		
	}
}
