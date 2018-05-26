package com.Licht._07;

public class ExecTest {
	public static void main(String[] args) throws Exception
	{
		Runtime rt = Runtime.getRuntime();
		//运行记事本程序
		rt.exec("notepad.exe"); //不能直接以这种方式运行计算机非自带程序
		//运行画图程序 
	    rt.exec("mspaint.exe");
	}
}
