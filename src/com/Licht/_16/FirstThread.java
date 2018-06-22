package com.Licht._16;
/*
 * 通过继承Thread类来创建线程类
 */
public class FirstThread extends Thread{
	private int i;
	//重写run()方法，即重写线程执行体
	public void run(){
		//i变量是实例变量，不是局部变量。由于每次创建线程时都需要创建一个FirstThread对象，
		//所以Thread-0与Thread-1之间不能共享实例变量。
		for(; i < 10 ; i++){
			//使用this可获取当前线程
			//调用getName()方法返回当前线程的名字
			System.out.println(getName() + " " + i);
		}
	}
	public static void main(String[] args){
		for(int i = 0; i < 10; i++){
			//调用Thread类的currenThread()方法获取当前线程
			System.out.println(Thread.currentThread().getName() 
					+ " " + i);
			if(i == 5){
				//创建并启动第一个线程
				new FirstThread().start();
				//创建并启动第二个线程
				new FirstThread().start();
			}
		}
	}
}
