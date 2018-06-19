package com.Licht._08;
//异常捕获
public class DivTest{
	public static void main(String[] args){
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a / b;
			System.out.println("a / b = " + c);
		}
		catch (IndexOutOfBoundsException is){
			System.out.println("数组越界：运行程序时输入的参数个数不足");
		}
		catch(NumberFormatException ne){
			System.out.println("数字格式：程序只能接受整型参数");
		}
		catch(ArithmeticException ae){
			System.out.println("算术异常：如分母为0");
		}
		catch(Exception e){
			System.out.println("未知异常");
		}
	}
}