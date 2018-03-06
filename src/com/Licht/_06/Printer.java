package com.Licht._06;
/*
 * 定义一个实现接口Output,Product的类Printer
 */
public class Printer implements Output, Product {
	private String[] printData = new String[MAX_CACHE_LINE];
	//定义记录当前需要打印的作业数
	private int dataNum = 0;
	//实现接口Output的抽象方法out()
	public void out(){
		//只要还有作业，就继续打印
		while(dataNum >0){
			System.out.println("打印机打印： " + printData[0]);
			//把作业队里向前移一位，并将剩下的作业数减一
			System.arraycopy(printData, 1
					, printData, 0, --dataNum);
		}
	}
	//实现接口Output里的抽象方法getData()
	//输入打印的数据msg
	public void getData(String msg){
		if(dataNum >= MAX_CACHE_LINE){
			System.out.println("输出队列已满，添加失败");
		}
		else {
			//把打印的数据添加到队里，已保存数据的数量加1
			printData[dataNum++] = msg;
		}
	}
	
	//实现接口Product的抽象方法getProduceTime()
	public int getProduceTime(){
		return 45;
	}
	public static void main(String[] args){
		//创建一个Printer对象，当成Output使用
		Output o = new Printer();
		o.getData("疯狂");
		o.getData("狗");
		o.out();
		o.getData("猫");
		o.getData("鸡");
		o.out();
		//调用Output接口中定义的默认方法
		o.print("孙悟空", "猪八戒", "白骨精");
		o.test();
		//创建一个Printer对象，当成Product使用
		Product p = new Printer();
		System.out.println(p.getProduceTime());
		//所有接口类型的引用变量都可以直接赋给Object类型的变量
		Object obj = p;//向上转型
	}
}
