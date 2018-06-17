package com.Licht._08;
import java.util.ArrayList;
import java.util.Collection;
//声明一个方法，将Object数组的所有元素添加到Colletion集合中
public class GenericMethodTest{
	//声明一个泛型方法，该泛型方法中带一个T类型形参
	static <T> void fromArrayToColletion(T[] a, Collection<T> c){
		for(T i : a){
			c.add(i);
		}
	}
	public static void main(String[] args){
		Object[] oa = new Object[100];
		Collection<Object> co = new ArrayList<>();
		//下面T代表Object类型
		fromArrayToColletion(oa, co);
		
		String[] sa = new String[100];
		Collection<String> cs = new ArrayList<>();
		//下面的T代表String类型
		fromArrayToColletion(sa, cs);
	}
}