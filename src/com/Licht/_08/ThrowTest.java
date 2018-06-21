package com.Licht._08;

public class ThrowTest{
	public static void main(String[] args){
		try{
			//调用声明抛出Checked异常的方法，要么显示捕获该异常，
			//要么在main方法中再次声明抛出
			throwChecked(-3);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		//调用声明抛出Runtime异常的方法，可以显示捕获该异常，
		//也可以不理会该异常
		throwRuntime(3);
	}
	public static void throwChecked(int a) throws Exception{
		if(a > 0){
			//自行抛出Exception异常，该代码必须处于try块中，
			//或处于带throws声明的方法中
			throw new Exception("a的值大于0，不符合要求");
		}
	}
	public static void throwRuntime(int a){
		if(a > 0){
			//自行抛出RuntimeException异常，可以显示捕获该异常，
			//也可以不理会该异常
			throw new RuntimeException("a的值大于0，不符合要求");
		}
	}
}