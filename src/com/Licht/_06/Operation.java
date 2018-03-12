package com.Licht._06;

public enum Operation {
	PLUS{
		public double eval(double x, double y){
			return x + y;
		}
	},
	MINUS{
		public double eval(double x, double y){
			return x - y;
		}
	},
	TIMES{
		public double eval(double x, double y){
			return x * y;
		}
	},
	DIVIDE{
		public double eval(double x, double y){
			return x / y;
		}
	};
	//为枚举类定义一个抽象方法
	public abstract double eval(double x, double y);
	public static void main(String[] args){
		System.out.println(Operation.PLUS.eval(3, 4));
		System.out.println(Operation.MINUS.eval(3, 4));
		System.out.println(Operation.TIMES.eval(3, 4));
		System.out.println(Operation.DIVIDE.eval(3, 4));
	}
}
