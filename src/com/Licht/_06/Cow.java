package com.Licht._06;

public class Cow {
	private double weight;
	public Cow(){};
	public Cow(double weight){
		this.weight = weight;
	}
	//定义一个非静态内部类
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
		//非静态类中的实例方法
		public void info(){
			System.out.println("当前牛腿颜色是： " + color + "，高是： " + length);
			//内部类可以访问外部类的私有数据
			System.out.println("本牛腿所在的奶牛重是： " + weight);
		}
	}
	public void test(){
		CowLeg cl = new CowLeg(1.12, "黑白相间");
		cl.info();
	}
	public static void main(String[] args){
		Cow cow = new Cow(378.9);
		cow.test();
	}
}
