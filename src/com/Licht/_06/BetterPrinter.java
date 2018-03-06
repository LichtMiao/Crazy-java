package com.Licht._06;
/*
 * 如果系统需要将Printer改为BetterPrinter实现类，
 * 只需让BetterPrinter实现Output接口，
 * 并改变OutputFactory类中的getOutput方法
 */
public class BetterPrinter implements Output {
	private String[] printData 
	  = new String[MAX_CACHE_LINE * 2];
	private int dataNum = 0;
	public void out(){
		while(dataNum > 0){
			System.out.println("高速打印机正在打印： " + printData[0]);
			System.arraycopy(printData, 1, printData, 0, --dataNum);
		}
	}
	public void getData(String msg){
		if (dataNum >= MAX_CACHE_LINE * 2){
			System.out.println("输出队列已满，添加失败");
		} else {
			printData[dataNum++] = msg;
		}
	}
}
