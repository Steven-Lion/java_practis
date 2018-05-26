import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class AnonymousInnerClassTest {
	
	public static void main(String[] args) {
		TalkingClock clock = new TalkingClock();
		clock.start(1000, true);
		JOptionPane.showMessageDialog(null	, "Quit Program?");
		System.exit(0);
	    
	}
}
class TalkingClock {
	public void start(int interval,final boolean beep){
//		匿名内部类.
		ActionListener listener = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				Date d = new Date();
				System.out.println("At the tone "+d);
				if(beep){
					Toolkit.getDefaultToolkit().beep();
				}
				
			}
			
		};
//		响的时间间隔和监听器传入.
		Timer T = new Timer(interval, listener);
		T.start();
		
	}
}
