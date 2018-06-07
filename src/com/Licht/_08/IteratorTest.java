/*
*通过Iterator接口遍历集合元素
*/
package com.Licht._08;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest{
	public static void main(String[] args){
		Collection books = new HashSet();
		books.add("a");
		books.add("b");
		books.add("c");
		//获取books集合对应的迭代器
		Iterator it = books.iterator();
		while(it.hasNext()){
			//it.next()返回的是Object类型，需要强制转换
			String book = (String)it.next();
			System.out.println(book);
			if(book.equals("a")){
				//从集合中删除上一次next()方法返回的元素
				it.remove();
			}
			//对book变量赋值不会改变集合本身
			book = "d";
		}
		System.out.println(books);
	}
}