package com.Licht._07;

import java.time.*;

public class NewDataPackageTest{
	public static void main(String[] args){
	/***clock的用法***/
	Clock clock = Clock.systemUTC();
	System.out.println("当前时刻为：" + clock.instant());
	//获取对应的毫秒数，与System.currentTimeMillis()输出相同
	System.out.println(clock.millis());
	System.out.println(System.currentTimeMillis());
	/***Duration的用法***/
	Duration d = Duration.ofSeconds(6000);
	System.out.println("6000ms相当于" + d.toMinutes() + "分");
	System.out.println("6000ms相当于" + d.toHours() + "小时");
	System.out.println("6000ms相当于" + d.toDays() + "天");
	//在clock基础上增加6000ms，返回新的clock值
	Clock clock2 = Clock.offset(clock,d);
	System.out.println("当前时刻加6000ms" + clock2.instant());
	/***Instant的用法***/
	Instant instant = Instant.now();
	System.out.println(instant);
	//在instant基础上增加6000ms，返回新的instant值
	Instant instant2 = instant.plusSeconds(6000);
	System.out.println(instant2);
	//根据字符串解析instant对象
	Instant instant3 = Instant.parse("2014-02-23T10:12:35.342Z");
	System.out.println(instant3);
	//在instant3基础上增加5小时4分，返回新的instant4值
	Instant instant4 = instant3.plus(Duration.ofHours(5).plusMinutes(4));
	System.out.println(instant4);
	//获取instant4 5天以前的时刻
	Instant instant5 = instant4.minus(Duration.ofDays(5));
	System.out.println(instant5);
	}
}