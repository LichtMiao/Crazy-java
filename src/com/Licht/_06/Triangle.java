package com.Licht._06;

public class Triangle extends Shape {
	private double a;
	private double b;
	private double c;
	//��������Ĺ���������ʼ�������ε�����
	public Triangle(String color, double a, double b, double c){
		//���಻��̳и���Ĺ�������
		//������ͨ��super���ø���Ĵ��ι�����public Shape(String color��
		super(color);
		this.setSides(a, b, c);
	}
	public void setSides(double a, double b, double c){
		if (a >= b + c || b >= a + c || c >= a + b){
			System.out.println("����������֮�Ͳ����ڵ����ߣ�����������");
			return;
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}
	//������ø�������ܳ��ĳ��󷽷�
	public double calPrimeter(){
		return a + b + c;
	}
	//������ø��෵����״�ĳ��󷽷�
	public String getType(){
		return "������";
	}
}
