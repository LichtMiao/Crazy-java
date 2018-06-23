package com.Licht._16.DrawTest4;
/*
*存款线程
*将使用余额（balance）作为同步方法监视器
*/
public class DepositThread extends Thread{
	private Account account; //用户账户
	private double depositAmount; //存钱数

	public DepositThread(String name, Account account
		, double depositAmount){ //存钱的人，账户，存钱数
			super(name);
			this.account = account;
			this.depositAmount = depositAmount;
		}
	//重复5次存款操作
	public void run(){
		for(int i = 0; i < 5; i++){
			account.deposit(depositAmount);
		}
	}
}    