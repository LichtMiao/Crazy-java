package com.Licht._07;

import java.io.File;
import java.util.Scanner;

public class ScannerFileTest {
	public static void main(String[] args) 
	//程序涉及文件输入，可能引发文件IO相关异常，故主程序声明throws Exception表明
	//main方法不处理任何异常
	throws Exception
	{
		//将File对象作为Scanner的构造器参数，Scanner读取文件内容
		Scanner sc = new Scanner(new File("ScannerFileTest.java"));
		System.out.println("ScannerFileTest.java文件内容如下：");
		// 判断是否还有下一行
		while(sc.hasNextLine())
		{
			// 输出文件中的下一行
			System.out.println(sc.nextLine());
		}
	}
}
