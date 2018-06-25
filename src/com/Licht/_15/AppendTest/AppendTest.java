package com.Licht._15.AppendTest;

import java.io.IOException;
import java.io.RandomAccessFile;
//使用RandomAccessFile访问指定的中间部分数据
public class AppendTest{
	public static void main(String[] args){
		try(RandomAccessFile raf = new RandomAccessFile(
			"F:\\eclipsework\\Crazy-java\\src\\com\\Licht\\_15\\out.txt", "rw")){
			raf.seek(raf.length());
			raf.write("追加的内容！\r\n".getBytes());
		}
		catch(IOException ioe){ioe.printStackTrace();}
	}
}