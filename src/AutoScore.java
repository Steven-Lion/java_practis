import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.TextField;
import java.awt.Panel;

public class AutoScore extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AutoScore frame = new AutoScore();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void btnNew_ActionPerformed(java.awt.event.ActionEvent event){
			
			a = (int)(Math.random()*9+1);
			b = (int)(Math.random()*9+1);
			int c = (int)(Math.random()*4);
			switch ( c ) {
			case 0:
				op = "+";
				result = a+b;
				break;
			case 1:
				op = "-";
				result = a-b;
				break;
			case 3:
				op = "*";
				result = a*b;
				break;
			case 4:
				op = "/";
				result = a/b;
				break;
				

			}
			
	}
	
	
	
	int a=0,b =0;
	String op ;
	double result = 0;
	
	
	
	/**
	 * Create the frame.
	 */
	public AutoScore() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("\u51FA\u9898");
		button.setBounds(10, 85, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u5224\u5206");
		button_1.setBounds(320, 85, 93, 23);
		contentPane.add(button_1);
		
		JList listDisp = new JList();
		listDisp.setBackground(Color.white);
		listDisp.setBounds(10, 251, 391, -130);
		contentPane.add(listDisp);
		
		JLabel lblA = new JLabel("");
		lblA.setBounds(20, 30, 54, 15);
		contentPane.add(lblA);
		
		JLabel lblOp = new JLabel("");
		lblOp.setBounds(108, 30, 54, 15);
		contentPane.add(lblOp);
		
		JLabel lblB = new JLabel("");
		lblB.setBounds(198, 30, 54, 15);
		contentPane.add(lblB);
		
		TextField txtAnswer = new TextField();
		txtAnswer.setBounds(320, 30, 93, 23);
		contentPane.add(txtAnswer);
		
		
		
	
	}
	public void  btnJudge_ActionPerformed(java.awt.event.ActionEvent event){
	//	String str = txtAnswer.getText();
//		double d = Double.parseDouble(str);
//		String disp = "" + a + op + b + "=" + str + " ";
//		if(d == result){
//			disp = "╤так";
//		}
//		else{
//			disp = "╢Мак";
//		}
		
		
	}
}
