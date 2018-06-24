package com.Licht._16.ForkJoinPoolTest;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/*
 * 打印20个数
 */
public class ForkJoinPoolTest{
	public static void main(String[] args)
	throws Exception{
		//创建ForkJoinPool类线程池
		ForkJoinPool pool = new ForkJoinPool();
		//提交可分解的PrintTask任务
		pool.submit(new PrintTask(0, 20));
		pool.awaitTermination(2, TimeUnit.SECONDS);
		//关闭线程池
		pool.shutdown();
	}
}