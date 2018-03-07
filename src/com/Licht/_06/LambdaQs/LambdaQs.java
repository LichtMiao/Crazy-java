package com.Licht._06.LambdaQs;

public class LambdaQs {
	public void eat(Eatable e){
		System.out.println(e);
		e.taste();
	}
	public void drive(Flyable f){
		System.out.println("�����ڼ�ʻ" + f);
		f.fly("�����졿");
	}
	public void test(Addable a){
		System.out.println("5 + 3 = " + a.add(5, 3));
	}
	public static void main(String[] args){
		LambdaQs lq = new LambdaQs();
		lq.eat(() -> System.out.println("���ƻ����ζ������"));
		lq.drive(weather -> {
			System.out.println("����������" + weather);
			System.out.println("ֱ��������ƽ��");
		});
		lq.test((a, b) -> a + b);
	}
}
