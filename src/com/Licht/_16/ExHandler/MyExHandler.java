package com.Licht._16.ExHandler;
/*
*定义异常处理器
*/
//ThreadGroup类实现Thread.UncaughtExceptionHandler接口
class MyExHandler implements Thread.UncaughtExceptionHandler{
	public void uncaughtException(Thread t, Throwable e){
		System.out.println(t + "线程出现了异常:" + e );
	}
}