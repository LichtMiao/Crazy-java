/*
*使用MessageFormat类的format()方法为消息中的占位符指定参数
*/
package com.Licht._07.HelloArg;

import java.util.Locale;
import java.util.ResourceBundle;
import java.text.MessageFormat;
import java.util.Date;

public class HelloArg{
	public static void main(String[] args){
		//定义一个Locale变量
		Locale currentLocale = null;
		//如果运行程序指定了两个参数
		if (args.length ==2){
			//使用运行程序的两个参数构造Locale实例
			currentLocale = new Locale(args[0], args[1]);
		}
		else{
			//直接使用系统默认的Locale
			currentLocale = Locale.getDefault(Locale.Category.FORMAT);
		}
		//根据Locale加载语言资源
		ResourceBundle bundle = ResourceBundle.getBundle("com.Licht._07.HelloArg.myMess", currentLocale);
		//取得已加载语言资源文件中msg对应消息
		String msg = bundle.getString("msg");
		//使用MessageFormat类的format()为带占位符的字符串传入参数
		System.out.println(MessageFormat.format(msg, "yeeky", new Date()));
	}
}