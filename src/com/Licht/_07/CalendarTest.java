package com.Licht._07;

import java.util.Calendar;
//YEAR,MONTH,DATA都是Calendar的类变量
public class CalendarTest{
	public static void main(String[] args){
	Calendar c = Calendar.getInstance();
	//取出年
	System.out.println(c.get(Calendar.YEAR));
	//取出月
	System.out.println(c.get(Calendar.MONTH));
	//取出日
	System.out.println(c.get(Calendar.DATE));
	//分别设置年、月、日、小时、分、秒
	c.set(2003,10,23,12,32,23);
	System.out.println(c.getTime()); //2002-11-23 12:32:23，年从0开始计数
	//将Calendar的年向前推一年
	c.add(Calendar.YEAR, -1);
	System.out.println(c.getTime()); //2002-11-23 12:32:23
	//将Calendar的月向前推8个月
	c.roll(Calendar.MONTH, -8);
	System.out.println(c.getTime()); //2002-03-23 12:32:23
	}
}
