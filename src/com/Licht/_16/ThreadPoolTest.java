package com.Licht._16;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
*使用线程池来执行指定Runnable对象所代表的任务
*/
public class ThreadPoolTest{
	public static void main(String[] args)
	throws Exception{
		//创建具有固定线程数（6）的线程池
		ExecutorService pool = Executors.newFixedThreadPool(6);
		//使用lambda表达式创建Runnable对象
		Runnable target = () -> {
			for (int i = 0; i < 10; i++){
				System.out.println(Thread.currentThread().getName()
					+ "的i值为：" + i);
			}
		};
		//向线程池中提交两个线程
		pool.submit(target);
		pool.submit(target);
		//关闭线程池
		pool.shutdown();
	}
}
