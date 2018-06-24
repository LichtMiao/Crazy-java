package com.Licht._16.BlockingQueueTest2;

import java.util.concurrent.BlockingQueue;
/*
*Consumer线程
*/
class Consumer extends Thread{
	private BlockingQueue<String> bq;
	public Consumer(BlockingQueue<String> bq){
		this.bq = bq;
	}
	public void Producer(BlockingQueue<String> bq){
		this.bq = bq;
	}
	public void run(){
		while(true){
			System.out.println(getName() + "消费者准备消费元素集合");
			try{
				Thread.sleep(200);
				bq.take();
			}
			catch(Exception e){e.printStackTrace();}
			System.out.println(getName() + "消费完成：" + bq);
		}
	}
}