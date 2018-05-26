package java_ActionEvent;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class java_ActionEvent {

	public static void main(String[] args) {
		
	}

}
class ButtonFrame extends JFrame{
	private int height  = 300;
	private int  width   = 200;
	
	
	public ButtonFrame(){
		setTitle("ButtonFrame");
		
		setSize( height , width );
		
//	Create the Buttons.
	JButton b1 = new JButton("yellow");
	JButton b2 = new JButton("Bule");
	JButton b3 = new JButton("Red");
	
	JPanel buttonPanel = new JPanel();
	
//	add the button to the JPanel
	buttonPanel.add(b1);
	buttonPanel.add(b2);
	buttonPanel.add(b3);
	
//	add the panel to the frame
	add(buttonPanel);
	
	
	
	}
}

class ColorAction implements ActionListener{
	private Color backgroundColor;
	
	public ColorAction(Color c){
		backgroundColor = c ;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}





