package com.Licht._08.TreeSetTest2;
class Z implements Comparable{
	int age;
	public Z(int age){
		this.age = age;
	}
	//重写equals()方法，总是返回true
	public boolean equals(Object obj){
		return true;
	}
	public int compareTo(Object obj){
		return 1;
	}
}