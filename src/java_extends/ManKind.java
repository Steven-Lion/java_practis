package java_extends;
/*
 * 1.(1)����һ��ManKind�࣬����
��Ա���� int sex �� int salary��
���� void manOrWorman()������sex��ֵ��ʾ��man��(sex==1)���ߡ�women��(sex==0)��
���� void employeed()������salary��ֵ��ʾ��no job��(salary==0)���ߡ� job��(salary!=0)��
   (2)������Kids1�̳�ManKind��
   ��������Ա���� int yearsOld��
���� printAge() ��ӡ yearsOld ��ֵ��
   (3)��Kids1���main������ʵ����Kids1�Ķ��� someKid���øö�������丸��ĳ�Ա������������

 */
public class ManKind {
	
	private int sex;
	private int salary;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void manOrWorman(){
		if(sex==1){
			System.out.println("this is a man");
		}
		else if (sex==0	){
			System.out.println("this is a women");
		}
	}
	
	public  void employeed(){
		if(salary==0){
			System.out.println("no job");
		}
		else if (salary!=0){
			System.out.println("job");
		}
	}
}
