package com.Licht._08;

import java.util.stream.IntStream;

/*
*流式API的聚集方法
*/
public class IntStreamTest{
	public static void main(String [] args){
		//利用类方法builer()创建对应的Builder
		IntStream is = IntStream.builder()
			.add(20)
			.add(13)
			.add(-2)
			.add(18)
			.build(); //调用Builder的build()方法获取对应的Stream
		//下面调用聚集方法的代码每次只能执行一次
		//System.out.println("is流中所有元素的最大值：" + is.max().getAsInt());
		//System.out.println("is流中所有元素的最小值：" + is.min().getAsInt());
		//System.out.println("is流中所有元素的h和：" + is.sum());
		//System.out.println("is流中所有元素的总数：" + is.count());
		//System.out.println("is流中所有元素的平均值：" + is.average());
		//System.out.println("is流中所有元素的平方是否大于20：" 
		//	+ is.allMatch(ele -> ele * ele > 20));
		//System.out.println("is流中是否包含任意元素的平方大于20：" 
		//	+ is.anyMatch(ele -> ele * ele > 20));
		//将Stream映射成一个新Stream
		IntStream newIs = is.map(ele -> ele *2 + 1);
		//使用方法引用 来遍历集合元素
		newIs.forEach(System.out::println);
	}
}