/*
 * DataFormat的四个静态常量SHORT、MEDIUM、LONG、FULL,
 * 通过这四个样式参数可以控制生成的格式化字符串。
 */
package com.Licht._07;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;


public class DataFormatTest{
	private static final int SHORT = 0;
	private static final int MEDIUM = 0;
	private static final int LONG = 0;
	private static final int FULL = 0;

	public static void main(String[] args) throws ParseException
	{
		//需要被格式化的时间
		Date dt = new Date();
		//创建两个Lacale，分别代表中国、美国
		Locale[] locales = {Locale.CHINA, Locale.US};
		//为上面两个Locale创建16个DataFormat对象
		DateFormat[] df = new DateFormat[16];
		for (int i = 0; i < locales.length; i++){
			df[i * 8] = DateFormat.getDateInstance(SHORT, locales[i]);
			df[i * 8 + 1] =DateFormat.getDateInstance(MEDIUM, locales[i]);
			df[i * 8 + 2] =DateFormat.getDateInstance(LONG, locales[i]);
			df[i * 8 + 3] =DateFormat.getDateInstance(FULL, locales[i]);
			df[i * 8 + 4] =DateFormat.getTimeInstance(SHORT, locales[i]);
			df[i * 8 + 5] =DateFormat.getTimeInstance(MEDIUM, locales[i]);
			df[i * 8 + 6] =DateFormat.getTimeInstance(LONG, locales[i]);
			df[i * 8 + 7] =DateFormat.getTimeInstance(FULL, locales[i]);
		}
		for (int i =0; i < locales.length; i++){
			String tip = i == 0 ? "---中国日期格式---" : "---美国日期格式---" ;
			System.out.println(tip);
			
			System.out.println("SHORT格式的日期格式：" 
				+ df[i * 8].format(dt));
			System.out.println("MEDIUM格式的日期格式：" 
				+ df[i * 8 + 1].format(dt));
			System.out.println("LONG格式的日期格式：" 
				+ df[i * 8 + 2].format(dt));
			System.out.println("FULL格式的日期格式：" 
				+ df[i * 8 + 3].format(dt));
			System.out.println("SHORT格式的时间格式：" 
				+ df[i * 8 + 4].format(dt));
			System.out.println("MEDIUM格式的时间格式：" 
				+ df[i * 8 + 5].format(dt));
			System.out.println("LONG格式的时间格式：" 
				+ df[i * 8 + 6].format(dt));
			System.out.println("FULL格式的时间格式：" 
				+ df[i * 8 + 7].format(dt));
		}
	}
}