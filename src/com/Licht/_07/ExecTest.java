package com.Licht._07;

public class ExecTest {
	public static void main(String[] args) throws Exception
	{
		Runtime rt = Runtime.getRuntime();
		//打开记事本
		rt.exec("notepad.exe"); //调用的是计算机自带程序
		//打开画图 
	    rt.exec("mspaint.exe");
	}
}
