package java_Thread;
/*
�̼߳�ͨѶ��
��ʵ���Ƕ���߳��ڲ���ͬһ����Դ��
���ǲ����Ķ�����ͬ.
*/
class Res
{
	private String name;
	private String sex;
//	������ű�ǣ����false�������Դ.
//	���Ϊtrue��ȡ����Դ.ʵ�ֱ�����ݱ�ȡ������.
	private boolean flag;

	public synchronized void set(String name,String sex)//����this
	{
		if(flag)//false.
			try{this.wait();}catch(Exception e){}
		this.name = name;
		this.sex = sex;
		flag = true;
		this.notify();//�����߳�.
	}
	public synchronized void out()						//����this
	{
		if(!flag)//Ϊtrue.
			try{this.wait();}catch(Exception e){}
		System.out.println(name+"........"+sex);
		flag = false;
		this.notify();//�����߳�.
	}
}

class Input implements Runnable//ʵ��Runnable�ӿ�.
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

class Output implements Runnable//ʵ��Runnable�ӿ�.
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





