package com.Licht._16.ThreadLocalTest;
class MyTest extends Thread{
	//定义一个Account类型的成员变量
	private Account account;
	public MyTest(Account account, String name){
		super(name);
		this.account = account;
	}
	public void run(){
		for (int i = 0; i < 10; i++){
			if ( i == 6){ 
			//当i=6将账户名替换成当前线程名
				account.setName(getName());
			}
			System.out.println(account.getName()
				+ "账户的i值" + i);
		}
	}
}