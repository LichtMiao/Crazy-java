package com.Licht._06;
/*
 * 系统提供一个Output工厂OutputFactory来负责生成Output对象
 */
public class OutputFactory {
	// 该方法返回一个Output实现类的实例，该方法只负责创建Output实例，
	// 具体创建哪一个实现类的对象由该方法决定。
	public Output getOutput(){
		return new BetterPrinter();
	}
	public static void main(String[] args){
		OutputFactory of  = new OutputFactory();
		Computer c = new Computer(of.getOutput());
		c.keyIn("猫");
		c.keyIn("狗");
		c.print();
	}
}
