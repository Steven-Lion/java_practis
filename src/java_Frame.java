import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class java_Frame {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		JLabel l = new JLabel("The Party in Tims!");
		JButton b = new JButton("You bet");
		JButton c = new JButton("Shoot me");
		JPanel p = new JPanel();
		p.add(l);
		p.add(c);
		p.add(b);
		f.add(p);
		f.setVisible(true);
		System.out.println("end");
		
	}

}
