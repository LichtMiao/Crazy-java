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
		lq.eat(() -> System.out.println("这个苹果的味道不错"));
		lq.drive(weather -> {
			System.out.println("今天天气是" + weather);
			System.out.println("直升机飞行平稳");
		});
		lq.test((a, b) -> a + b);
	}
}
