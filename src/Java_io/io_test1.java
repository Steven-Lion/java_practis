package Java_io;

import java.io.File;

public class io_test1 {
	/*
	 * java.io.File类
	 * 1.方式与输入输出相关的类，接口等都定义在java.io包下
	 * 2.File是一个类，可以有构造器创建其对象。此对象对应着一个文件属性。
	 * 3.File类对象与平台无关.
	 * 4.File中的方法，仅涉及到如何创建，删除，重命名等等，
	 * 只要涉及文件内容的，File类无能为力，只能通过IO流来完成.
	 * 5.File类的对象常作为IO流的具体类的构造器的形参。
	 */
	
	
	/* 路径.
	 * 绝对路径：包含盘符的完整的文件路径.
	 * 相对路径：在当前文件目录下的文件的路径.
	 * */
	public static void main(String[] args) {
		File file1 = new File("d:\\io\\hellworld.txt");
		File file2 = new File("hello.txt");
		File file3 = new File("d:/io/io1");
		
				
	}

}
