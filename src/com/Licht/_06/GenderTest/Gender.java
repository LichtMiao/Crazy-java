package com.Licht._06.GenderTest;

public enum Gender {
	//此处的枚举值必须调用对应的构造器来创建
	MALE("男"), FEMALE("女");
	/*
	 * 上面代码等同于下面两行代码
	 * public static final Gender MALE = new Gender("男");
	 * public static final Gender FEMALE = new Gender("女");
	 */
	private String name;
	//枚举类的构造器只能用private来修饰
	private Gender(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
}
