package com.Licht._07.CloneTest;

public class CloneTest {
	public static void main(String[] args)
	throws CloneNotSupportedException
	{
		User u1 = new User(29);
		//clone�õ�u1�Ķ��󸱱�
		User u2 = u1.clone();
		//�ж�u1��u2�Ƿ���ͬ
		System.out.println(u1==u2);
		//�ж�u1��u2��address�Ƿ���ͬ
		System.out.println(u1.address == u2.address);
		
	}
}
