/*
*如何获取java所支持的国家和语言
*/
package com.Licht._07;
import java.util.Locale;

public class LocaleList{
	public static void main(String[] args){
		Locale[] localeList = Locale.getAvailableLocales();
		for(int i = 0; i < localeList.length; i++){
			//输出所有支持的国家和语言
			System.out.println(localeList[i].getDisplayCountry()
				+ "=" + localeList[i].getCountry() + " "
				+ localeList[i].getDisplayLanguage() + "="
				+ localeList[i].getLanguage());
		}
	}
}