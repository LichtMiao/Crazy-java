package com.Licht._16;
/*
*Joint线程
*/
public class JointThread extends Thread{
	public JointThread(String name ){
		super(name);
	}
	public void run(){
		for(int i = 0; i < 10; i++){
			System.out.println(getName() + " " + i);
		}
	}
	public static void main(String[] args) throws InterruptedException{
		//启动子线程1，它将和main主线程并发执行
		new JointThread("子线程1").start();
		//JointThread jt1 = new JointThread("子线程1");
		//jt1.start();
		for(int i = 0; i < 10; i++){
			if(i == 5){
				JointThread jt2 = new JointThread("被join的线程");
				jt2.start();
				jt2.join();
			}
			System.out.println(Thread.currentThread().getName()
				+ " " + i);
		}
	}
}