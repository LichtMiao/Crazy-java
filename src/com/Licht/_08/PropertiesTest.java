package com.Licht._08;
/*
*Properties类的用法
*/
import java.util.Properties;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class PropertiesTest{
	public static void main(String[] args)
	throws Exception
	{
		Properties props1 = new Properties();
		props1.setProperty("username", "A");
		props1.setProperty("password", "123");
		props1.store(new FileOutputStream("a.ini"),
			"comment line");
		Properties props2 = new Properties();
		props2.setProperty("mail", "456@mail.com");
		props2.load(new FileInputStream("a.ini"));
		System.out.println(props2);
	}
}