/*
 * 使用Lamda表达式遍历集合元素
 */
package com.Licht._08;

import java.util.Collection;
import java.util.HashSet;

public class CollectionEach{
	public static void main(String[] args){
		Collection books = new HashSet();
		books.add("a");
		books.add("b");
		books.add("c");
		//调用Iterable接口的forEach()方法遍历集合
		books.forEach(obj -> System.out.println("迭代元素集合：" + obj));
	}
}