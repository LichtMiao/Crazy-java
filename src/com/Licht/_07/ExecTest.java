package com.Licht._07;

public class ExecTest {
	public static void main(String[] args) throws Exception
	{
		Runtime rt = Runtime.getRuntime();
		//���м��±�����
		rt.exec("notepad.exe"); //����ֱ�������ַ�ʽ���м�������Դ�����
		//���л�ͼ���� 
	    rt.exec("mspaint.exe");
	}
}
