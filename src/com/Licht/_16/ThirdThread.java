package com.Licht._16;
/*
 * 使用Callable接口和FutureTask创建线程
 * （实现Callable接口与实现Runnable接口的方式基本相同）
 */
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThirdThread{
	public static void main(String[] args){
		//创建Callable对象
		ThirdThread rt = new ThirdThread();
		//使用Lamda表达式创建Callable<Integer>对象
		//使用FutureTask来包装Callable对象
		FutureTask<Integer> task = new FutureTask<Integer>((Callable<Integer>)()->{
			int i = 0;
			for(; i < 10; i++){
				System.out.println(Thread.currentThread().getName()
					+ " " + i);
			}
			//call()方法可以有返回值
			return i;
		});
		for(int i = 0; i < 10; i++){
			System.out.println(Thread.currentThread().getName()
					+ " " + i);
			if(i == 5){
				new Thread(task, "有返回值的线程").start();
			}
		}
		try{
			//获取子线程call()方法的返回值
			System.out.println("子线程的返回值：" + task.get());
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
}