package com.Licht._06;

/*
 * 定义一个Shape抽象类
 */
public abstract class Shape {
	{
		System.out.println("执行Shape的初始化块...");
	}
	private String color;
	//定义一个返回周长的方法
	public abstract double calPrimeter();
	//定义一个返回形状的方法
	public abstract String getType();
	//定义一个Shape的构造器，不是用于创建实例，而是为了被子类调用
	public Shape(){}
	public Shape(String color){
		System.out.println("执行Shape的带参构造器...");
		this.setColor(color);
	}
	//private成员变量的操作只能在类的内部进行，
    //外部类对其进行操作只能通过setter和getter方法
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
