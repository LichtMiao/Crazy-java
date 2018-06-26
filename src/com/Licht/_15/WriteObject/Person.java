package com.Licht._15.WriteObject;
/*
*Person类实现Serializable接口，表明该类是可序列化的
*/
public class Person implements java.io.Serializable{
	private String name;
	private int age;
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
}