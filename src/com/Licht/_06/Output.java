package com.Licht._06;
/*
 * 定义一个Output接口
 */
public interface Output {
	// 接口里定义的成员变量只能是常量
	int MAX_CACHE_LINE = 50;
	
	// 接口里定义的普通方法必须是public抽象(public abstract可以省略)方法
	void out();
	void getData(String msg);
	
	// 接口中定义默认方法，必须用default修饰
	// 由于没有static，不能使用接口来直接调用，需要使用接口的实现类来调用默认方法
	default void print(String...msgs){
		for(String msg : msgs){
			System.out.println(msg);
		}
	}
	default void test(){
		System.out.println("默认的test()方法");
	}
	// 接口中定义类方法，必须用static修饰
	static String staticTest(){
		return "接口里的类方法";
	}
}
