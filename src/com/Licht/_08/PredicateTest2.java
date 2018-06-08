/*
*Predicate统计出现“疯狂”字符串的图书数量
*统计出现“Java”字符串的图书数量
*统计书名长度大于10的图书数量
*/
package com.Licht._08;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Predicate;

public class PredicateTest2{
	public static void main(String[] args){
		//创建集合
		Collection books = new HashSet();
		books.add(new String("轻量级Java EE企业应用实战"));
		books.add(new String("疯狂Java讲义"));
		books.add(new String("疯狂iOS讲义"));
		books.add(new String("疯狂Ajax讲义"));
		books.add(new String("疯狂Android讲义"));
		//传入三个Lamda表达式，其目标类型都是Predicate
		System.out.println(calAll(books, ele -> ((String)ele).contains("疯狂")));
		System.out.println(calAll(books, ele -> ((String)ele).contains("Java")));
		System.out.println(calAll(books, ele -> ((String)ele).length() > 10));
	}
	//calAll()方法，使用Predicate判断每个集合元素是否满足特定条件
	public static int calAll(Collection books, Predicate p){
		int total = 0;
		for (Object obj : books){
			//使用Predicate的test()方法判断该对象是否满足Predicate指定条件
			if(p.test(obj)){
				total++;
			}
		}
		return total;
	}
}