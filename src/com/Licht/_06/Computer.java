package com.Licht._06;
/*
 * Computer类组合一个Output类型对象，实现Computer类和Printer类的分离
 * Computer类不再负责创建Output对象，
 * 系统提供一个Output工厂OutputFactory来负责生成Output对象
 */
public class Computer {
	// 定义一个Output接口类型的成员变量
	private Output out;
	// 定义带参构造器
	public Computer(Output out){
		this.out = out;
	}
	// 定义一个模拟获取字符串的方法
	public void keyIn(String msg){
		out.getData(msg); // 访问Output类型接口的getData()抽象方法
	}
	// 定义一个模拟打印的方法
	public void print(){
		out.out(); // 访问Output类型接口的out()抽象方法
	}
}
