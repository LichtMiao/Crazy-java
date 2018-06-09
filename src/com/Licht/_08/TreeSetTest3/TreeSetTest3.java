package com.Licht._08.TreeSetTest3;

import java.util.TreeSet;

/*
*如果向TreeSet中添加一个可变对象后，并且后面程序修改了该可变对象的实例变量，
*这将导致它与其他对象的大小顺序发生变化，但TreeSet不会再次调整他们的顺序，
*甚至可能导致TreeSet中保存的两个对象通过compareTo(Object obj)方法比较返回0.
*/
public class TreeSetTest3{
	public static void main(String[] args){
		TreeSet ts = new TreeSet();
		ts.add(new R(5));
		ts.add(new R(-3));
		ts.add(new R(9));
		ts.add(new R(-2));
		System.out.println(ts); //TreeSet集合是有序排列
		//取出第一个和最后一个元素，并赋值
		R first = (R)ts.first(); //取值
		first.count = 20; //count是在赋值
		R last = (R)ts.last();
		last.count = -2; //与原集合的最后一个元素相同
		//再次输出TreeSet将发现元素处于无序状态，且有重复元素
		System.out.println(ts);
		//删除实例变量改变的量，删除失败
		System.out.println(ts.remove(new R(-2))); //输出false
		System.out.println(ts);
		//删除实例变量未改变的量，删除成功
		System.out.println(ts.remove(new R(5))); //输出true
		System.out.println(ts);
	}
}