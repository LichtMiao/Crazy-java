package com.Licht._08;

import java.util.ArrayList;
import java.util.List;

public class GenericList{
	public static void main(String[] args){
		List<String> strList = new ArrayList<String>();
		strList.add("AA");
		strList.add("BBB");
		strList.forEach(str -> System.out.println(str.length()));
	}
}