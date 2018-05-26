package java_Thread;
/*
线程间通讯：
其实就是多个线程在操作同一个资源，
但是操作的动作不同.
*/
class Res
{
	private String name;
	private String sex;
//	创建存放标记，如果false则存入资源.
//	如果为true就取出资源.实现便存数据便取出数据.
	private boolean flag;

	public synchronized void set(String name,String sex)//锁是this
	{
		if(flag)//false.
			try{this.wait();}catch(Exception e){}
		this.name = name;
		this.sex = sex;
		flag = true;
		this.notify();//唤醒线程.
	}
	public synchronized void out()						//锁是this
	{
		if(!flag)//为true.
			try{this.wait();}catch(Exception e){}
		System.out.println(name+"........"+sex);
		flag = false;
		this.notify();//唤醒线程.
	}
}

class Input implements Runnable//实现Runnable接口.
{
	private Res r ;
	Input(Res r)
	{
		this.r = r;
	}
	public void run()
	{
		int x = 0;
		while(true)
		{
			if(x==0)				
				r.set("mike","female");				
			else	
				r.set("lili","male");				
			x = (x+1)%2;
		}
	}
}

class Output implements Runnable//实现Runnable接口.
{
	private Res r ;
	
	Output(Res r)
	{
		this.r = r;
	}
	public void run()
	{
		while(true)
		{
			r.out();
		}
	}
}


class  InputOutputDemo2
{
	public static void main(String[] args) 
	{
		Res r = new Res();

		new Thread(new Input(r)).start();
		new Thread(new Output(r)).start();
		
	}
}





