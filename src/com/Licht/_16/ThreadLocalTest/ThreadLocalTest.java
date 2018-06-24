package com.Licht._16.ThreadLocalTest;
public class ThreadLocalTest{
	public static void main(String[] args){
		Account at = new Account("初始名");
		//启动两个线程，共享一个账户名
		new MyTest(at, "线程甲").start();
		new MyTest(at, "线程乙").start();
	}
}