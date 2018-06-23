package com.Licht._16.DrawTest3;

//import java.util.concurrent.locks.ReentrantLock;

/*
*线程通信，令用户进行存取款交替操作，存多少取多少。
*将Account类对balance的访问设置成线程安全的，
*只需把修改balance的方法设置成同步方法
*/
public class Account{
	//定义锁对象
	//private final ReentrantLock lock = new ReentrantLock();
	private String accountId; //账户ID
	private double balance; //余额
	//flag标识账户中是否已有存款
	private boolean flag = false;
	
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
	//为了防止对余额balance的修改，只提供getter方法
	public double getBalance(){
		return balance;
	}
	//提供一个线程安全的draw()方法来完成取钱操作
	public synchronized void draw(double drawAmount){
		////加锁
		//lock.lock();
		try{
			//如果flag为假，表示账户中没有人存钱进去，取钱方法阻塞
			if(!flag){
				wait();
			}
			//执行取钱操作
			else{
				System.out.println(Thread.currentThread().getName()
				+ "取钱：" + drawAmount);
				//修改余额
				balance -= drawAmount;
				System.out.println("账户余额为：" + balance);
				//取完钱后没有存款，将标识账户是否有存款设为false
				flag = false;
				//唤醒其它线程
				notifyAll();
			}
		}	
		catch(InterruptedException ie){
			ie.printStackTrace();
		}	
	}
	//提供一个线程安全的deposit()方法来完成存钱操作
	public synchronized void deposit(double depositAmount){
		try{
			//如果flag为真，表明账户已有人存钱进去，存钱方法阻塞
			if (flag){
				wait();
			}
			else{
				//执行存钱操作
				System.out.println(Thread.currentThread().getName()
				+ "存钱：" + depositAmount);
				//修改余额
				balance += depositAmount;
				System.out.println("账户余额为：" + balance);
				//将标识账户是否有存款设为true
				flag = true;
				//唤醒其它线程
				notifyAll();
			}
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
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