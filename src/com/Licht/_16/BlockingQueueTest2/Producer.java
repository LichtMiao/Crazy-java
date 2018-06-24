package com.Licht._16.BlockingQueueTest2;

import java.util.concurrent.BlockingQueue;
/*
*Producer线程
*/
class Producer extends Thread{
	private BlockingQueue<String> bq;
	public Producer(BlockingQueue<String> bq){
		this.bq = bq;
	}
	public void run(){
		String[] strArr = new String[]{
				"元素1", "元素2","元素3"
		};
		for (int i = 0; i < 10; i++){
			System.out.println(getName() + "生产者准备生产元素集合");
			try{
				Thread.sleep(200);
				bq.put(strArr[i % 3]);
			}
			catch(Exception e){e.printStackTrace();}
			System.out.println(getName() + "生产完成：" + bq);
		}
	}
}