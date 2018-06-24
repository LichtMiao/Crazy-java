package com.Licht._16.BlockingQueueTest2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
/*
*利用BlockingQueue实现线程通信
*由于队列长度为1，因此3个生产者线程无法连续放入元素，
*必须要等消费者线程取出一个元素后，3个生产者线程之一才能放入元素
*/
public class BlockingQueueTest2{
	public static void main(String[] args){
		//创建一个容量为1的BlockingQueue
		BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
		//启动3个生产者线程
		new Producer(bq).start();
		new Producer(bq).start();
		new Producer(bq).start();
		//启动1个消费者线程
		new Consumer(bq).start();
	}
}