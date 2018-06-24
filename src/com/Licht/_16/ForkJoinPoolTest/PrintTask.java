package com.Licht._16.ForkJoinPoolTest;

import java.util.concurrent.RecursiveAction;
/*
*执行没有返回值的任务，将任务分解。
*并将任务交给ForkJoinPool来执行。
*/
//RecursiveAction是抽象类，
//继承RecursiveActio类来实现任务分解，无返回值
class PrintTask extends RecursiveAction{
	//每个小任务打印5个数
	private static final int THRESHOLD = 5;
	private int start;
	private int end;
	//构造器：打印从start到end的任务
	public PrintTask(int start, int end ){
		this.start = start;
		this.end = end;
	}
	@Override
	protected void compute(){
		if (end - start < THRESHOLD){
			for (int i = start; i < end; i++){
				System.out.println(Thread.currentThread().getName()
					+ "的i值" + i);
			}
		}
		else{
			//要打印的数超过5，则分解任务
			int middle = (start + end) / 2;
			PrintTask left = new PrintTask(start, middle);
			PrintTask right = new PrintTask(middle, end);
			//并行执行这两个小任务
			left.fork();
			right.fork();
		}
	}
}