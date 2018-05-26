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
		d.start();//start开启线程.并调用Thread中的run方法.
//		d.run(); //只是调用run方法 ,并没有开启线程.所以相当于单线程运行完这个run()后执行下一个任务.
		for (int i = 0; i < 40; i++) {
			System.out.println("main is running!"+i);
		}

	}

}
