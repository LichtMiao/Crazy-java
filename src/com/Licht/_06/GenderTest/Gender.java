package com.Licht._06.GenderTest;

public enum Gender {
	//此处的枚举值必须调用对应的构造器来创建
	MALE("男"), FEMALE("女");
	private String name;
	//枚举类的构造器只能用private来修饰
	private Gender(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
}
