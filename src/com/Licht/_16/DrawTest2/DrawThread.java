package com.Licht._16.DrawTest2;
/*
*线程类
*将使用余额（balance）作为同步方法监视器
*取钱操作放在Account类中，
*Account代表用户账户，提供用户账户相关的方法
*/
public class DrawThread extends Thread{
	private Account account; //用户账户
	private double drawAmount; //取钱数

	public DrawThread(String name, Account account
		, double drawAmount){ //取钱的人，账户，取钱数
			super(name);
			this.account = account;
			this.drawAmount = drawAmount;
		}
	public void run(){
		account.draw(drawAmount);
	}
}  