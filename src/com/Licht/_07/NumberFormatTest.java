/*
*NumberFormat抽象类的三种数字格式化器的用法
*/
package com.Licht._07;

import java.util.Locale;
import java.text.NumberFormat;

public class NumberFormatTest{
	public static void main(String[] args){
		//需要被格式化的数字
		double db = 1234000.567;
		//创建四个Locale，分别代表中、日、德、美
		Locale[] locales = {Locale.CHINA, Locale.JAPAN
			, Locale.GERMAN, Locale.US};
		//为上面四个Locale创建12个NuberFormat对象，
		//每个Locale分别有通用数值格式器、百分数格式器、货币格式器
		NumberFormat[] nf = new NumberFormat[12];
		for (int i = 0; i < locales.length; i++){
			nf[i*3] = NumberFormat.getNumberInstance(locales[i]);
			nf[i*3 + 1] = NumberFormat.getPercentInstance(locales[i]);
			nf[i*3 + 2] = NumberFormat.getCurrencyInstance(locales[i]);
		}
		for (int i = 0; i < locales.length; i++){
			String tip = i==0 ? "---中国的格式---" :
				i==1 ? "---日本的格式---" :
				i==2 ? "---德国的格式---" : "---美国的格式---";
			System.out.println(tip);
			System.out.println("通用数值格式" + nf[i*3].format(db));
			System.out.println("百分比数值格式" + nf[i*3 + 1].format(db));
			System.out.println("货币数值格式" + nf[i*3 + 2].format(db));
		}
	}
}