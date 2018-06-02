package com.Licht._07;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
/*
**Matcher类的find()方法可以传入一个int类型的参数
**start()和end()方法用于确定子串在目标字符串中的位置
*/
public class StartEnd{
	public static void main(String[] args){
		String regStr = "Java is very easy!";
		System.out.println("目标字符串是：" + regStr);
		Matcher m = Pattern.compile("\\w+").matcher(regStr);
		while(m.find()){
			System.out.println(m.group() +"子串的起始位置" 
				+ m.start() + "，其结束位置：" + m.end()); 
		}
	}
}