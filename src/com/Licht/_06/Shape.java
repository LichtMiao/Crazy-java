package com.Licht._06;

/*
 * ����һ��Shape������
 */
public abstract class Shape {
	{
		System.out.println("ִ��Shape�ĳ�ʼ����...");
	}
	private String color;
	//����һ�������ܳ��ķ���
	public abstract double calPrimeter();
	//����һ��������״�ķ���
	public abstract String getType();
	//����һ��Shape�Ĺ��������������ڴ���ʵ��������Ϊ�˱��������
	public Shape(){}
	public Shape(String color){
		System.out.println("ִ��Shape�Ĵ��ι�����...");
		this.setColor(color);
	}
	//private��Ա�����Ĳ���ֻ��������ڲ����У�
    //�ⲿ�������в���ֻ��ͨ��setter��getter����
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
