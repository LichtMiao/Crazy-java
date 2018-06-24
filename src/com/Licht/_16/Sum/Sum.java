package com.Licht._16.Sum;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
//import java.util.concurrent.TimeUnit;
/*
 * 累加20个数
 */
public class Sum{
	public static void main(String[] args)
	throws Exception{
		int arr[] = new int[20];
		Random rand = new Random();
		int total = 0;
		//初始化20个数字元素，放入随机数
		for (int i = 0; i < arr.length; i++){
			int tmp = rand.nextInt(10);
			arr[i] = tmp;
			total += arr[i];
			//即total += (arr[i] = tmp);
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n" + total); //将这个结果与任务分解后的结果比较
		
		//创建ForkJoinPool类通用池
		ForkJoinPool pool = ForkJoinPool.commonPool();
		//提交可分解的CalTask任务
		Future<Integer> future = pool.submit(new CalTask(arr, 0, arr.length));
		System.out.println(future.get());
		//pool.submit(new PrintTask(0, 20));
		//pool.awaitTermination(2, TimeUnit.SECONDS);
		//关闭线程池
		pool.shutdown();
	}
}