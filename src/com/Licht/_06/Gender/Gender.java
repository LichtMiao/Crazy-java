package com.Licht._06.Gender;

public enum Gender implements GenderDesc {
	MALE("男"){ // 花括号里其实是一个类体部分
		public void info(){
			System.out.println("这个枚举值代表男性");
		}
	},
	FEMALE("女"){
		public void info(){
			System.out.println("这个枚举值代表女性");
		}
	};
	private String name;
	//枚举类的构造器只能用private来修饰
	private Gender(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
}
