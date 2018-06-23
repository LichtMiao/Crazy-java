package com.Licht._16.DrawTest2;
public class DrawTest2{
	public static void main(String[] args){
		Account a = new Account("123456", 1000);
		//创建两个线程
		new DrawThread("甲", a , 500).start();
		new DrawThread("乙", a , 600).start();
	}
}