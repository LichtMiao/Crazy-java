package com.Licht._07;

import java.io.File;
import java.util.Scanner;

public class ScannerFileTest {
	public static void main(String[] args) 
	//�����漰�ļ����룬���������ļ�IO����쳣��������������throws Exception����
	//main�����������κ��쳣
	throws Exception
	{
		//��File������ΪScanner�Ĺ�����������Scanner��ȡ�ļ�����
		Scanner sc = new Scanner(new File("ScannerFileTest.java"));
		System.out.println("ScannerFileTest.java�ļ��������£�");
		// �ж��Ƿ�����һ��
		while(sc.hasNextLine())
		{
			// ����ļ��е���һ��
			System.out.println(sc.nextLine());
		}
	}
}
