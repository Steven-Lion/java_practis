package java_extends;
/*
 * (2)������Kids1�̳�ManKind��
   ��������Ա���� int yearsOld��
���� printAge() ��ӡ yearsOld ��ֵ��
   (3)��Kids1���main������ʵ����Kids1�Ķ��� someKid���øö�������丸��ĳ�Ա������������
 */
public class Kid1 extends ManKind{
	private int yearOld;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kid1 someKid = new Kid1();
	}
	public void printAge(){
		System.out.println("yearOld:"+ yearOld);
	}
	

}
