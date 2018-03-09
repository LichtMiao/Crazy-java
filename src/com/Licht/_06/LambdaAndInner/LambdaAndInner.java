package com.Licht._06.LambdaAndInner;

public class LambdaAndInner {
	private int age = 12;
	private static String name = "crazy";
	public void test(){
		String book = "疯狂java";
		//使用Lambda表达式创建了一个Displayable接口的实例
		Displayable dis = () -> {
			//与匿名内部类相似的是，Lambda表达式访问了局部变量book，
			//相当于用final修饰了，因此也无法对book重新赋值
			System.out.println("book局部变量为" + book);
			System.out.println("外部类的age实例变量为" + age);
			System.out.println("外部类的name实例变量为" + name);
		};
		//使用Lambda表达式创建了一个Displayable接口的实例后，
		//可以调用接口中的抽象方法，默认方法
		dis.display();
		//Lambda表达式不能调用接口中的默认方法，即直接add（3,5)出错
		System.out.println(dis.add(3, 5));
	}
	public static void main(String[] args){
		LambdaAndInner lambda = new LambdaAndInner();
		lambda.test();
	}
}
