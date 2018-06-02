package com.Licht._07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
**互联网爬虫，自动从打断字符串中找出电话号码
*/
public class FindGroup{
	public static void main(String[] args){
		//使用字符串模拟从网上得到的源码
		String str = "尽快联系我11111222222"
			+ "交朋友，电话号码是13111333333"
			+ "出售二手电脑，联系方式151333344455";
		//正则表达式抓取13*和15*段的手机号
		Matcher m = Pattern.compile("((13\\d)|(15\\d))\\d{8}").matcher(str);
		//将所有负荷正则表达式的子串全部输出
		while(m.find()){
			System.out.println(m.group());
		}
	}
}