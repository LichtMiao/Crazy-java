package com.Licht._16.DrawTest4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
*线程通信，令用户进行存取款交替操作，存多少取多少。
*使用Lock对象来控制同步，并使用Condition对象来控制线程的协同运行
*/
public class Account{
	//定义锁对象
	private final Lock lock = new ReentrantLock();
	//获得指定对象的Condition
	private final Condition cond = lock.newCondition();
	
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
	public void draw(double drawAmount){
		//加锁
		lock.lock();
		try{
			//如果flag为假，表示账户中没有人存钱进去，取钱方法阻塞
			if(!flag){
				cond.await();
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
				cond.signalAll();
			}
		}	
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
		//使用finally块来释放锁
		finally{
			lock.unlock();
		}
	}
	//提供一个线程安全的deposit()方法来完成存钱操作
	public void deposit(double depositAmount){
		lock.lock();
		try{
			//如果flag为真，表明账户已有人存钱进去，存钱方法阻塞
			if (flag){
				cond.await();
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
				cond.signalAll();
			}
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
		//使用finally块来释放锁
		finally{
			lock.unlock();
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