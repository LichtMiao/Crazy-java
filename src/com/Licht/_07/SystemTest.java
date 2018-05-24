package com.Licht._07;


import java.util.Map;
import java.util.Properties;
import java.io.FileOutputStream;

public class SystemTest {
	public static void main(String[] args) throws Exception
	{
		//��ȡϵͳ�����л�������
		Map<String,String> env = System.getenv();
		for(String name : env.keySet())
		{
			System.out.println(name + "---> " + env.get(name));
		}
		//��ȡָ������������ֵ
		System.out.println(System.getenv("JAVA_HOME"));
		//��ȡ���е�ϵͳ����
		Properties props = System.getProperties();
		//�����е�ϵͳ����System.Properties���浽props.text�ļ���
		props.store(new FileOutputStream("props.txt"),"System Properties");
		//����ض���ϵͳ����os.name
		System.out.println(System.getProperty("os.name"));
	}
}
