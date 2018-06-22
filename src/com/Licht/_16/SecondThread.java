package com.Licht._16;
/*
*使用Runnable接口创建线程类
*/
public class SecondThread implements Runnable{
	private int i;
	public void run(){
		for(; i < 10; i++){
		System.out.println(Thread.currentThread().getName() 
			+ " " + i);
		}
	}
	public static void main(String[] args){
		for(int i = 0; i < 10; i++){
			System.out.println(Thread.currentThread().getName() 
				+ " " + i);
			if(i == 5){
				SecondThread st = new SecondThread();
				new Thread(st, "线程1").start();
				new Thread(st, "线程2").start();
			}
		}
		
	}
}