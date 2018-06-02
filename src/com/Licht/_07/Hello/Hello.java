/*
*完成程序国际化
*/
package com.Licht._07.Hello;
import java.util.Locale;
import java.util.ResourceBundle;

public class Hello{
	public static void main(String[] args){
		//取得系统默认的国家/
		Locale myLocale = Locale.getDefault(Locale.Category.FORMAT);
		//根据指定的国家/语言加载资源包
		ResourceBundle bundle = ResourceBundle
				.getBundle("com.Licht._07.Hello.mess", myLocale);
		//打印从资源文件中取得的信息
		System.out.println(bundle.getString("Hello"));
	}
}