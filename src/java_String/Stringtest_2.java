package java_String;
/*
3，获取一个字符串在另一个字符串中出现的次数。
	"abkkcdkkefkkskk"
	思路：
	1，定义个计数器。
	2，获取kk第一次出现的位置。
	3，从第一次出现位置后剩余的字符串中继续获取kk出现的位置。
		每获取一次就计数一次。
	4，当获取不到时，计数完成。

public class Stringtest_2 {

	public static int countkey(String str,String key){//method1
		int count = 0;
		int index = 0;
		while((index = str.indexOf(key))!=-1){
			
			str = str.substring(index+key.length());
			
			count++;
			
		}
		return count;
	}
	
	public static int countkey2(String str,String key){
		int count =0 ;
		int index =0 ;
		while((index=str.indexOf(key,index))!=-1){
		
			index	=	index	+	key.length();
			
			count++;
		}
			return count;
	}
	
	public static void main(String[] args) {
		String str1 ="abkkcdkkefkkskk";
		String key = "kk";
		Stringtest_2 s = new Stringtest_2();
		
		int c =s.countkey2(str1, key);
		
		System.out.println("字符串"+str1+"中出现"+key+"的次数为："+c);

	}

}
*/

class Stringtest_2{
		/*
		*获取一个kk字符串在另一个字符串中出现的次数。
		*"abkkcdkkefkkskk"
		思路：
		1，定义个计数器。
		2，获取kk第一次出现的位置。
		3，从第一次出现位置后剩余的字符串中继续获取kk出现的位置。
		   每获取一次就计数一次。
		4，当获取不到时，计数完成。
			*/
		public static int countString(String str1,String key){
			 
			 int count = 0;
			 int index = 0;

			 while((index = str1.indexOf(key)) !=-1){
			 	str1 = str1.substring(index+key.length());
			 	count++;

			 }
			 return count;
		}


	public static void main(String[] arg ){
		String s1 ="abkkcdkkefkkskk";
		String key ="kk";
		
		Stringtest_2 s = new Stringtest_2();

		int c = s.countString(s1,key);
		System.out.println(key+"出现次数:"+c);

	}
}