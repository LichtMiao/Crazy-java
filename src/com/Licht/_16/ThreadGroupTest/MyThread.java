package com.Licht._16.ThreadGroupTest;
class MyThread extends Thread{
	//构造器
	public MyThread(String name){
		super(name);
	}
	//构造器：提供指定线程名、线程组
	public MyThread(ThreadGroup group, String name){
		super(group, name);
	}
	public void run(){
		for (int i = 0; i < 10; i++){
			//使用this可获取当前线程,调用getName()方法返回当前线程的名字
			System.out.println(getName() + "：线程的i变量" + i);
		}
	}
}