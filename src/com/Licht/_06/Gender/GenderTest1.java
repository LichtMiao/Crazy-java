package com.Licht._06.Gender;

public class GenderTest1 {
	public static void main(String[] args){
		Gender g = Gender.valueOf("FEMALE");
		System.out.println(g +"代表的是："+ g.getName());
	}
}

