package com.Licht._16.Sum;

import java.util.concurrent.RecursiveTask;
/*
*执行有返回值的任务，将任务分解。
*并将任务交给ForkJoinPool来执行。
*/
//RecursiveTask是抽象类，
//继承RecursiveTask类来实现任务分解，有返回值
class CalTask extends RecursiveTask{
	//每个小任务打印5个数
	private static final int THRESHOLD = 5;
	private int arr[];
	private int start;
	private int end;
	//构造器：累加从start到end的任务
	public CalTask(int arr[], int start, int end ){
		this.arr = arr;
		this.start = start;
		this.end = end;
	}
	@Override
	protected Integer compute(){
		int sum = 0;
		if (end - start < THRESHOLD){
			for (int i = start; i < end; i++){
				sum += arr[i];
			}
			return sum;
		}
		else{
			//要累加的数超过5，则分解任务
			int middle = (start + end) / 2;
			CalTask left = new CalTask(arr, start, middle);
			CalTask right = new CalTask(arr, middle, end);
			//并行执行这两个小任务
			left.fork();
			right.fork();
			//把两个小任务加起来
			return (Integer) left.join() + (Integer)right.join();
		}
	}
}
