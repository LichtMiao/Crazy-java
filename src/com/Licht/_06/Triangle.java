package com.Licht._06;

public class Triangle extends Shape {
	private double a;
	private double b;
	private double c;
	//定义子类的构造器，初始化三角形的三边
	public Triangle(String color, double a, double b, double c){
		//子类不会继承父类的构造器，
		//但可以通过super调用父类的带参构造器public Shape(String color）
		super(color);
		this.setSides(a, b, c);
	}
	public void setSides(double a, double b, double c){
		if (a >= b + c || b >= a + c || c >= a + b){
			System.out.println("三角形两边之和不大于第三边，不是三角形");
			return;
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}
	//子类调用父类计算周长的抽象方法
	public double calPrimeter(){
		return a + b + c;
	}
	//子类调用父类返回形状的抽象方法
	public String getType(){
		return "三角形";
	}
}
