package com.Licht._16.DrawTest4;
/*
*取款线程
*将使用余额（balance）作为同步方法监视器
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
	//重复5次取款操作
	public void run(){
		for(int i = 0; i < 5; i++){
			account.draw(drawAmount);
		}
	}
}                                                                                                                                                           