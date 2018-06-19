package com.Licht._08;

import java.util.Date;

//空指针异常
public class NullTest{
	public static void main(String[] args){
		Date d = null;
		try{
			//调用Null对象的after()方法将引发NullPointerException异常
			System.out.println(d.after(new Date()));
		}
		catch (NullPointerException ne){
			System.out.println("空指针异常");
		}
		catch(Exception e){
			System.out.println("未知异常");
		}
	}
}