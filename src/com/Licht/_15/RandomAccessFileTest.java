package com.Licht._15;

import java.io.IOException;
import java.io.RandomAccessFile;
//使用RandomAccessFile访问指定的中间部分数据
public class RandomAccessFileTest{
	public static void main(String[] args){
		try(RandomAccessFile raf = new RandomAccessFile(
			"F:\\eclipsework\\Crazy-java\\src\\com\\Licht\\_15\\RandomAccessFileTest.java", "r")){
			System.out.println("RandomAccessFile的文件指针的初始位置："
				+ raf.getFilePointer());
			//移动指针
			raf.seek(300);
			byte[] bbuf = new byte[1024];
			int hasRead = 0;
			while((hasRead = raf.read(bbuf)) > 0){ //读取输入流，并存在byte类型数组中
			    //取出“竹筒”中的字节，并将字节数转换成字符串输出
				System.out.println(new String(bbuf, 0, hasRead));
			}
		}
		catch(IOException ioe){ioe.printStackTrace();}
	}
}