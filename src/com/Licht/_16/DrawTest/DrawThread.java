package com.Licht._16.DrawTest;
/*
*线程类
*将使用账户（account）作为同步监视器
*/
public class DrawThread extends Thread{
	private Account account; //用户账户
	private double drawAmount; //当前线程希望的取钱数
	//DrawThread构造器
	public DrawThread(String name, Account account
		, double drawAmount){ //取钱的人，账户，取钱数
			super(name);
			this.account = account;
			this.drawAmount = drawAmount;
		}
	//当多个线程修改同一共享数据时，设计数据安全问题
	public void run(){
		//将用户账户account作为监视器，
		//先对account进行锁定，其它线程将无法获得锁，即无法修改它
		synchronized (account){
			//当账户余额大于取钱数
			if(account.getBalance() >= drawAmount){
				System.out.println(getName()
					+ "取钱成功，吐出钱：" + drawAmount);
				//强制暂停，让另一个线程执行
				try{
					Thread.sleep(1);
				}
				catch(InterruptedException ie){
					ie.printStackTrace();
				}
				//修改账户余额
				account.setBalance(account.getBalance() - drawAmount);
				System.out.println("当前账户余额为：" + account.getBalance());
			}
			else{
				System.out.println(getName() + "取钱失败，余额不足！");
			}
		}
	}
}