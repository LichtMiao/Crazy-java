package com.Licht._07;

import java.util.Objects;

public class ObjectTest {
	//����obj������Ĭ��ֵ��null
	static ObjectTest obj;
	public static void main(String[] args)
	{
		//���һ��null�����hashCodeֵ�����0
		System.out.println(Objects.hashCode(obj));
		//���һ��null�����toString�����null
		System.out.println(Objects.toString(obj));
		//Ҫ��obj����Ϊnull�����������쳣
		System.out.println(Objects.requireNonNull(obj, "obj����������null"));
	}
}
