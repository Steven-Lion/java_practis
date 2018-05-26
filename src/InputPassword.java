import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.Timer;
import javax.print.attribute.standard.NumberUpSupported;
import javax.tools.Tool;

public class InputPassword implements ActionListener {

//		private static final BigInteger BigIntger = null;

	public static void main(String[] args) {
	
//		Perso p1 = new Perso("jade",18);
//		
//		String name = p1.getName();
//		
//		int age = p1.getAge();
//		
//		String message = String.format("hello ,name:%s ,year:%d",naage);
//		System.out.println(message);
		
		
//		如何四舍五入?
//		就这样.
		
/*		BigDecimal d1  = new BigDecimal(6.47777);
		
		System.out.println(d1.setScale(0, BigDecimal.ROUND_HALF_UP));*/
		
//		扩展数组.
		
		/*int[] nums = {1,2,3,4,5,6,7,8,9,10};
		
		int[] nums_Copy = Arrays.copyOf(nums, 2*nums.length);
		
		for(int i : nums_Copy){
			
			System.out.println("第"+i+"位 : "+nums_Copy[i]);
		}
		for (int i = 0; i < nums_Copy.length; i++) {
			System.out.println("第"+i+"位 : "+nums_Copy[i]);
		}*/
//		拷贝数组.
//		int[] num1 = {1,2,3,4,5,6,7,8,9,10};
//		int[] num2 = {0,0,0,0,0,0,0,0,0,0};
//		num1才是复制的， num2是被复制的.
//		
//		System.arraycopy(num1, 2, num2, 3, 4);
//		
//		for(int i : num2){
//			System.out.println(i);
//		}
		

		
	}
		
@Override
public void actionPerformed(ActionEvent e) {
	Date d1 = new Date();
	
	System.out.println(d1.getTime());
	
	Toolkit.getDefaultToolkit().beep();
	
	
}
}
 	
