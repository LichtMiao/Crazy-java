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
	//��д������Shape�����ܳ��ķ���
	public double calPrimeter(){
		return 2 * Math.PI * radius;
	}
	//��д������Shape������״�ķ���
	public String getType(){
		return getColor() + "Բ��";
	}
	public static void main(String[] args){
		Shape s1 = new Triangle("��ɫ", 3, 4, 5);
		Shape s2 = new Circle("��ɫ", 3);
		System.out.println(s1.getColor());
		System.out.println(s1.calPrimeter());
		System.out.println(s2.getColor());
		System.out.println(s2.calPrimeter());
		
	}
}