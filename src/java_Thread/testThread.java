package java_Thread;


class D extends Thread{
	D(String name){
		super(name);
	}
	public void run(){
		for (int i = 0; i < 40; i++) {
			System.out.println(Thread.currentThread().getName()+"+is running!"+i);
		}
	}
}
public class testThread {

	public static void main(String[] args) {	
		D d = new D("Demo");
		d.start();//start�����߳�.������Thread�е�run����.
//		d.run(); //ֻ�ǵ���run���� ,��û�п����߳�.�����൱�ڵ��߳����������run()��ִ����һ������.
		for (int i = 0; i < 40; i++) {
			System.out.println("main is running!"+i);
		}

	}

}
