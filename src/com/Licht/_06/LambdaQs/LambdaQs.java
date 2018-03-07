package com.Licht._06.LambdaQs;

public class LambdaQs {
	public void eat(Eatable e){
		System.out.println(e);
		e.taste();
	}
	public void drive(Flyable f){
		System.out.println("我正在驾驶" + f);
		f.fly("【晴天】");
	}
	public void test(Addable a){
		System.out.println("5 + 3 = " + a.add(5, 3));
	}
	public static void main(String[] args){
		LambdaQs lq = new LambdaQs();
		//Lambda表达式不带形参的匿名方法
		lq.eat(() -> {
			System.out.println("这个苹果的味道不错");
		});
		//Lambda表达式带一个形参，形参外的括号可以省略
		lq.drive(weather -> {
			System.out.println("今天天气是" + weather);
			System.out.println("直升机飞行平稳");
		});
		//Lambda表达式带两个形参，返回值前的return语句可省略，方法体只有一句，则大括号可省略
		lq.test((a, b) -> a + b);
	}
}
