package com.Licht._07;
/*
 * 把所有与Pattern对象匹配的字符串替换成了“哈哈哈”
 */
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class ReplaceTest{
	public static void main(String[] args){
		String[] msgs = 
		{
			"Java has regular expressions in 1.4",
			"regular expressions now expressiong in java",
			"Java represses oracular expressions"
		};
		Pattern p = Pattern.compile("re\\w*");
		Matcher matcher = null;
		for(int i = 0; i < msgs.length; i++){
			if(matcher == null){
				matcher = p.matcher(msgs[i]);
			}
			else{
				matcher.reset(msgs[i]);
			}
			System.out.println(matcher.replaceAll("哈哈哈"));
		}
	}
}