package com.Licht._16.ThreadLocalTest;
class Account{
	//定义一个ThreadLocal类型的变量，是一个线程局部变量
	//每个线程都会保留一个副本
	private ThreadLocal<String> name = new ThreadLocal<>();
	public Account(String str){ //初始化name成员变量的构造器
		this.name.set(str); //设置此线程局部变量name中 当前线程副本的值
		//访问当前线程副本的值
		System.out.println(this.name.get());
	}
	public String getName(){
		return name.get();
	}
	public void setName(String str){
		this.name.set(str);
	}
}