package com.Licht._16.ThreadGroupTest;


/*
*创建线程，分别属于不同的线程组，
*将其中一个线程组设置成后台线程组
*/
public class ThreadGroupTest{
	public static void main(String[] args){
		//获取主线程所在线程，这是所有线程默认的线程组
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		System.out.println("主线程名字：" + mainGroup.getName());
		System.out.println("主线程是否是后台线程：" + mainGroup.isDaemon());
		
		new MyThread("主线程组的线程").start();
		ThreadGroup tg = new ThreadGroup("新线程组");
		
		tg.setDaemon(true); //设置新线程组为后天线程
		System.out.println("新线程组是否是后台线程组：" + tg.isDaemon());
		//为新线程组添加子线程
		MyThread tt = new MyThread(tg, "新线程组的子线程甲");
		tt.start();
		//new MyThread(tg, "新线程组的子线程甲").start();
		new MyThread(tg, "新线程组的子线程乙").start();
	}
}