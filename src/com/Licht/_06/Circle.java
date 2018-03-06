package com.Licht._06;

public class Circle extends Shape {
	private double radius;
	public Circle(String color, double radius){
		super(color);
		this.radius = radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	//重写抽象类Shape计算周长的方法
	public double calPrimeter(){
		return 2 * Math.PI * radius;
	}
	//重写抽象类Shape返回形状的方法
	public String getType(){
		return getColor() + "圆形";
	}
	public static void main(String[] args){
		Shape s1 = new Triangle("黑色", 3, 4, 5);
		Shape s2 = new Circle("黄色", 3);
		System.out.println(s1.getColor());
		System.out.println(s1.calPrimeter());
		System.out.println(s2.getColor());
		System.out.println(s2.calPrimeter());
		
	}
}