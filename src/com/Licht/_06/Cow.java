package com.Licht._06;

public class Cow {
	private double weight;
	public Cow(){};
	public Cow(double weight){
		this.weight = weight;
	}
	//����һ���Ǿ�̬�ڲ���
	public class CowLeg{
		private double length;
		private String color;
		public CowLeg(){}
		public CowLeg(double length, String color){
			this.length = length;
			this.setColor(color);
		}
		public double getLength(){
			return length;
		}
		public void setLength(double length){
			this.length = length;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		//�Ǿ�̬���е�ʵ������
		public void info(){
			System.out.println("��ǰţ����ɫ�ǣ� " + color + "�����ǣ� " + length);
			//�ڲ�����Է����ⲿ���˽������
			System.out.println("��ţ�����ڵ���ţ���ǣ� " + weight);
		}
	}
	public void test(){
		CowLeg cl = new CowLeg(1.12, "�ڰ����");
		cl.info();
	}
	public static void main(String[] args){
		Cow cow = new Cow(378.9);
		cow.test();
	}
}
