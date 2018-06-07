package com.Licht._08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/*
*Collection集合的操作
*/
public class CollectionTest{
	public static void main(String[] args){
		Collection c = new ArrayList();
		c.add("孙悟空");
		c.add(6); // 自动装箱
		System.out.println("c集合的个数为：" + c.size());
		c.remove(6);
		System.out.println("c集合的个数为：" + c.size());
		// 判断是否包含指定字符串
		System.out.println("c集合中是否包含\"孙悟空\"字符串：" + c.contains("孙悟空"));
		c.add("aaa");
		System.out.println("c集合中的元素：" + c);
		
		Collection books = new HashSet();
		books.add("aaa");
		books.add("bbb");
		System.out.println("c集合是否完全包含books集合？" + c.containsAll(books)); // 输出false
		//c集合减去books集合的元素
		c.removeAll(books);
		System.out.println("c集合的元素：" + c);
		//删除c里所有的元素
		c.clear();
		System.out.println("c集合的元素：" + c);
		//控制books集合里只剩下c集合里也包含的元素
		books.retainAll(c);
		System.out.println("books集合的元素：" + books);
	}
}