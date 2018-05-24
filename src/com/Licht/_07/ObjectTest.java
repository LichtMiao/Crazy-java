package com.Licht._07;

import java.util.Objects;

public class ObjectTest {
	//定义obj变量，默认值是null
	static ObjectTest obj;
	public static void main(String[] args)
	{
		//输出一个null对象的hashCode值，输出0
		System.out.println(Objects.hashCode(obj));
		//输出一个null对象的toString，输出null
		System.out.println(Objects.toString(obj));
		//要求obj不能为null，否则引发异常
		System.out.println(Objects.requireNonNull(obj, "obj参数不能是null"));
	}
}
