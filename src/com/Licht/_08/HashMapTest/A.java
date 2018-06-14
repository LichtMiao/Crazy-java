package com.Licht._08.HashMapTest;
/*
*A类判断两个A对象相等的标准是count实例变量：
*只要两个A对象的count变量相等，
*则通过equals()方法比较返回true，且hashCode值也相等
*/
class A{
	int count;
	public A(int count){
		this.count = count;
	}
	//根据count值判断两个对象是否相等
	public boolean equals(Object obj){
		if(obj == this){
			return true;
		}
		if(obj != null && obj.getClass() == A.class){
			A a = (A)obj;
			return this.count == a.count;
		}
		return false;
	}
	//根据count计算hashCode值
	public int hashCode(){
		return this.count;
	}
}