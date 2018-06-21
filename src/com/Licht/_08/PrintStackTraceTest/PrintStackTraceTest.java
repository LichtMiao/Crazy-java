package com.Licht._08.PrintStackTraceTest;
//测试printStackTrace的子程序
public class PrintStackTraceTest{
	public static void main(String[] args){
		firstMethod();
	}
	public static void firstMethod(){
		secondMethod();
	}
	public static void secondMethod(){
		thirdMethod();
	}
	public static void thirdMethod(){
		try {
			throw new SelfException("自定义异常信息");
		} catch (SelfException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}