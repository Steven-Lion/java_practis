import java.awt.Event;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class NoteHelloworld {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable()
		{
			public void run(){
				NoteHelloJFrame frame = new NoteHelloJFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE	);
				frame.setVisible(true);
			}
		});
	}
	
}

class NoteHelloJFrame extends JFrame{
	
	private static int Default_width = 300;
	private static int Default_heigth = 200;
	
	
	public	NoteHelloJFrame(){
		 setTitle("helloworld!");
		 setSize(Default_width, Default_heigth);
		 NoteHelloPanel panel = new NoteHelloPanel();
		 add(panel);
	}
	
}
class NoteHelloPanel extends JPanel{
	public static int x = 75;
	public static int y = 100;
	public void paintComponet(Graphics g){
		g.drawString("Note Hello the world!", x	 , y);
		
	}
	
}
