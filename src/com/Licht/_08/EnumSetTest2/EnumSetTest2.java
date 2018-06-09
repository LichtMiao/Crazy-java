/*
*可以复制一个Collection集合中的元素创建新的EnumSet集合
*/
package com.Licht._08.EnumSetTest2;
import java.util.Collection;
import java.util.HashSet;
import java.util.EnumSet;

public class EnumSetTest2{
	public static void main(String[] args){
		Collection c = new HashSet();
		c.clear();
		c.add(Seanson.FALL); //从枚举类Seanson中取元素添加
		c.add(Seanson.SPRING);
		EnumSet enumSet = EnumSet.copyOf(c);
		System.out.println(enumSet);
	}
}