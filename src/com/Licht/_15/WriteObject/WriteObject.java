package com.Licht._15.WriteObject;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;
//将Person对象写入磁盘
public class WriteObject{
	public static void main(String[] args){
		//创建ObjectOutputStream类型输出流
		try(ObjectOutputStream oos = new ObjectOutputStream(
			new FileOutputStream("F:\\eclipsework\\Crazy-java\\src\\"
					+ "com\\Licht\\_15\\WriteObject\\object.txt"))){
			Person per = new Person("孙悟空", 500);
			oos.writeObject(per); //将per对象写入输出流
			}
		catch(IOException ioe){ioe.printStackTrace();}
	}
}