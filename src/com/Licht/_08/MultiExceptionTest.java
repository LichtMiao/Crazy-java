package com.Licht._08;
//catch对多种异常捕获
public class MultiExceptionTest{
	public static void main(String[] args){
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a / b;
		}
		catch(IndexOutOfBoundsException|NumberFormatException
			|ArithmeticException ie){
		    System.out.println("程序发生了越界、数字格式异常、算术异常之一");
			//捕获多种异常时，异常变量ie有final修饰
		}
		catch(Exception e){
			System.out.println("未知异常");
			//捕获一种异常时，异常变量e没有final修饰
			e = new RuntimeException("test");
		}
	}
}