package com.Licht._07.CloneTest;

//ʵ��Cloneable�ӿ�
public class User implements Cloneable{
	int age;
	Address address;
	public User(int age)
	{
		this.age = age;
		address = new Address("chengdu");
	}
	//ͨ������super.clone()��ʵ��clone()����
	public User clone()
	throws CloneNotSupportedException
	{
		return (User)super.clone();
	}
}
