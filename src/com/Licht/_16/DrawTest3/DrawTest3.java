package com.Licht._16.DrawTest3;
public class DrawTest3{
	public static void main(String[] args){
		Account a = new Account("123456", 0);
		//创建四个线程
		new DrawThread("取款者甲", a , 800).start();
		new DepositThread("存款者乙", a , 800).start();
		new DepositThread("存款者丙", a , 800).start();
		new DepositThread("存款者丁", a , 800).start();
	}
}