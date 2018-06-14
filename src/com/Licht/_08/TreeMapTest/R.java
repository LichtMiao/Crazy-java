package com.Licht._08.TreeMapTest;
/*
*R类重写equals()方法，并实现Comparable接口
*所以可以使用R对象作为TreeMap的key，该TreeMap自然排序
*/
class R implements Comparable{
	int count;
	public R(int count){
		this.count = count;
	}
	public String toString(){
		return "R[count" + count + "]";
	}
	//根据count值判断两个对象是否相等
	public boolean equals(Object obj){
		if (this == obj){
			return true;
		}
		if (obj != null && obj.getClass() == R.class){
			R r = (R)obj;
			return r.count == this.count;
		}
		return false;
	}
	//根据count属性判断两个对象的大小
	public int compareTo(Object obj){
		R r = (R) obj;
		return count > r.count ? 1 :
			count < r.count ? -1 : 0;
	}
}