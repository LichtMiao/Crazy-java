package com.Licht._07.CloneTest;

public class CloneTest {
	public static void main(String[] args)
	throws CloneNotSupportedException
	{
		User u1 = new User(29);
		//clone得到u1的对象副本
		User u2 = u1.clone();
		//判断u1、u2是否相同
		System.out.println(u1==u2);
		//判读u1、u2的address是否相同
		System.out.println(u1.address == u2.address);
		
	}
}
