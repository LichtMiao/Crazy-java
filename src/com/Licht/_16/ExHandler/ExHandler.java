package com.Licht._16.ExHandler;
/*
*为主线程设置异常处理器，当主线程运行时抛出未处理异常时，
*该异常处理器将会起作用
*/
public class ExHandler{
	public static void main(String[] args){
		//设置主线程的异常处理器
		Thread.currentThread().setUncaughtExceptionHandler
			(new MyExHandler());
		int a = 5 / 0;
		System.out.println("程序正常结束");
	}
}