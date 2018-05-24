package com.Licht._07.CloneTest;

//实现Cloneable接口
public class User implements Cloneable{
	int age;
	Address address;
	public User(int age)
	{
		this.age = age;
		address = new Address("chengdu");
	}
	//通过调用super.clone()来实现clone()方法
	public User clone()
	throws CloneNotSupportedException
	{
		return (User)super.clone();
	}
}
