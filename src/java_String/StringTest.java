package java_String;

/*
1��ģ��һ��trim������ȥ���ַ������˵Ŀո�
	˼·��
	1���ж��ַ�����һ��λ���Ƿ��ǿո�����Ǽ��������жϣ�ֱ�����ǿո�Ϊֹ��
		��β���жϿո�Ҳ����ˡ�
	2������ʼ�ͽ�β���жϵ����ǿո�ʱ������Ҫ��ȡ���ַ�����



2����һ���ַ������з�ת�����ַ�����ָ�����ֽ��з�ת��"abcdefg";abfedcg
	˼·��
	1������ѧϰ���������Ԫ�ؽ��з�ת��
	2�����ַ���������飬�����鷴ת��
	3������ת����������ַ�����
	4��ֻҪ����ת�Ĳ��ֵĿ�ʼ�ͽ���λ����Ϊ�������ݼ��ɡ�


*/

class StringTest 
{

	
	public static void sop(String str)
	{
		System.out.println(str);
	}
	public static void tradition(String str){
		char[] c1 = str.toCharArray();
		for (int i 	= c1.length-1; i > 0; i--) {
			System.out.print(c1[i]);
			
		}System.out.println();
	}
	
	public static String delspace(String str){
		 int start = 0 ,end = str.length()-1;
		 String s = "      ab cd      ";//17
		 while(start <=end && str.charAt(start)==' '){
			 start++;//6
		 }
		 while(start <=end && str.charAt(end) == ' '){
			 
			 end--;//11

		 }
		
		return str.substring(start, end+1);
		
	}
	public static void main(String[] args) 
	{
		String s = "      ab cd      ";
		String s1 =	"abcdefg";
		
		tradition(s1);
		
		System.out.println(delspace(s));
		
//		sop("("+s+")");
//		s = myTrim(s);
//		sop(s);
		

//		sop("("+reverseString(s)+")");
		
	}


	//��ϰ�������ַ�����ת��
	/*
	˼·��
	1�����ַ���������顣
	2�������鷴ת��
	3�����������ַ�����
	*/

	public static String reverseString(String s,int start,int end)
	{
		//�ַ��������顣
		char[] chs = s.toCharArray();

		//��ת���顣
		reverse(chs,start,end);

		//���������ַ�����
		return new String(chs);
	}
	public static String reverseString(String s)
	{
		return reverseString(s,0,s.length());
		
	}

	private static void reverse(char[] arr,int x,int y)
	{
		for(int start=x,end=y-1; start<end ; start++,end--)
		{
			swap(arr,start,end);
		}
	}
	private static void swap(char[] arr,int x,int y)
	{
		char temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	//��ϰһ��ȥ���ַ������˿ո�
	public static String myTrim(String str)
	{
		int start = 0,end = str.length()-1;

		while(start<=end && str.charAt(start)==' ')
			start++;

		while(start<=end && str.charAt(end)==' ')
			end--;

		return str.substring(start,end+1);
	}
}


