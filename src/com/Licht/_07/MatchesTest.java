package com.Licht._07;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
/*
**创建一个邮箱地址的Pattern，用这个Pattern与多个邮箱地址进行匹配，
**当Matcher为null时，调用matcher()方法来创建一个Matcher对象，
**然后调用Matcher的reset()防范将该Matcher应用于新的字符序列
*/
public class MatchesTest{
	public static void main(String[] args){
		String[] mails = 
		{
			"kongyeeku@163.com",
			"kongyeeku@gmail.com",
			"ligan@crazyit.org",
			"wawa@abc.xx"
		};
		String mailRegx = "\\w{3,20}@\\w+\\.(com|org|cn|net|gov)";
		Pattern mailPattern = Pattern.compile(mailRegx);
		Matcher matcher = null;
		for(String mail : mails){
			if(matcher == null){
				matcher = mailPattern.matcher(mail);
			}
			else{
				matcher.reset(mail);
			}
			String result = mail + (matcher.matches() ? "是" : "不是")
				+ "一个有效的邮箱地址！";
				System.out.println(result);
		}
	}
}