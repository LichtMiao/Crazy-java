package com.Licht._08.HashMapTest;
/*
*B对象可以和任何对象相等
*/
class B{
	//重写equals()方法，使B对象与任何对象通过
	//equals()方法比较返回true
	public boolean equals(Object obj){
		return true;
	}
}