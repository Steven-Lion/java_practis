package java_String;
/*
3����ȡһ���ַ�������һ���ַ����г��ֵĴ�����
	"abkkcdkkefkkskk"
	˼·��
	1���������������
	2����ȡkk��һ�γ��ֵ�λ�á�
	3���ӵ�һ�γ���λ�ú�ʣ����ַ����м�����ȡkk���ֵ�λ�á�
		ÿ��ȡһ�ξͼ���һ�Ρ�
	4������ȡ����ʱ��������ɡ�

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
		
		System.out.println("�ַ���"+str1+"�г���"+key+"�Ĵ���Ϊ��"+c);

	}

}
*/

class Stringtest_2{
		/*
		*��ȡһ��kk�ַ�������һ���ַ����г��ֵĴ�����
		*"abkkcdkkefkkskk"
		˼·��
		1���������������
		2����ȡkk��һ�γ��ֵ�λ�á�
		3���ӵ�һ�γ���λ�ú�ʣ����ַ����м�����ȡkk���ֵ�λ�á�
		   ÿ��ȡһ�ξͼ���һ�Ρ�
		4������ȡ����ʱ��������ɡ�
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
		System.out.println(key+"���ִ���:"+c);

	}
}