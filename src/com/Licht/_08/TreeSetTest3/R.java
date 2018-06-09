/*
 * R是可变类，可通过改变R对象count实例变量的值，
 * 改变集合中元素的count实例变量值
 */
package com.Licht._08.TreeSetTest3;
class R implements Comparable{
	int count;
	public R(int count){
		this.count = count;
	}
	public String toString(){
	return "R[count" + count + "]";
	}
	//重写equals()方法，根据count来判断是否相等
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(obj != null && obj.getClass() == R.class){
			R r = (R)obj;
			return r.count == this.count;
		}
		return false;
	}
	//重写compareTo()方法，根据count来比较大小
	public int compareTo(Object obj){
		R r = (R)obj;
		return count > r.count ? 1 :
			count < r.count ? -1 : 0;
	}
}