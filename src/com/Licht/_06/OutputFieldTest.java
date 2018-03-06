package com.Licht._06;
/*
 * 即使另一个类处于不同的包下，也可通过接口访问另一个接口里的成员变量
 * 因为接口是public访问权限
 * （本例是另一个类与要访问的接口成员变量在同一包下）
 */
public class OutputFieldTest {
	public static void main(String[] args){
		//Output为要访问的接口入口
		System.out.println(com.Licht._06.Output.MAX_CACHE_LINE);
		//调用接口中的类方法
		System.out.println(com.Licht._06.Output.staticTest());
	}
	
}
