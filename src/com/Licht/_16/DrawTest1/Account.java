package com.Licht._16.DrawTest1;
/*
*将Account类对balance的访问设置成线程安全的，
*只需把修改balance的方法设置成同步方法
*/
public class Account{
	private String accountId; //账户ID
	private double balance; //余额
	public Account(){}
	public Account(String accountId,double balance){
			this.accountId = accountId;
			this.balance =  balance;
		}
	public String getAccountId(){
		return accountId;
	}
	public void setAccountId(String accountId){
		this.accountId = accountId;
	}
	//为了防止对balance的修改，只提供getter方法
	public double getBalance(){
		return balance;
	}
	//提供一个线程安全的draw()方法来完成取钱操作
	public synchronized void draw(double drawAmount){
		if(balance >= drawAmount){
			System.out.println(Thread.currentThread().getName()
				+ "取钱成功，吐出钱：" + drawAmount);
			try{
				Thread.sleep(1);
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
			//修改余额
			balance -= drawAmount;
			System.out.println("账户余额为：" + balance);
		}
		else{
			System.out.println(Thread.currentThread().getName()
					+ "取钱失败，余额不足！");
		}
	}
	
	//根据accountId来重写hashCode()方法和equals()方法
	public int hashCode(){
		return accountId.hashCode();
	}
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(this != null
			&& obj.getClass() == Account.class){
				Account target = (Account)obj;
				return target.getAccountId().equals(accountId);
			}
		return false;
	}
}