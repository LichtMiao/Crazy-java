/*
 * 如果试图将一个对象添加到TreeSet时，该对象的类Z必须实现Comparable接口
 */
package com.Licht._08.TreeSetTest2;

import java.util.TreeSet;

public class TreeSetTest2{
	public static void main(String[] args){
		TreeSet set = new TreeSet();
		Z z1 = new Z(6);
		set.add(z1);
		System.out.println(set.add(z1)); //第二次添加同一对象输出true，表明添加成功
		//输出set集合，有两个元素
		System.out.println(set);
		//修改set集合的第一个元素的age变量，
		//将看到第二个元素的age变量也变了
		((Z)set.first()).age = 9; //集合的元素强制转换成Z类型，事项Comparable接口
		System.out.println(((Z)set.last()).age);
	}
}