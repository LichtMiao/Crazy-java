package com.Licht._15;

import java.io.Rand插入的内容
插入的内容
omAccessFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
*向指定文件、指定位置插入内容
*/
public class InsertContent{
	//定义insert()方法：文件名，插入点位置，插入内容
	public static void insert(String fileName
		, long pos, String insertContent) throws IOException{
		File tmp = File.createTempFile("tmp", null);//创建临时文件
		tmp.deleteOnExit();//临时文件将在JVM退出时删除
		
		try(
			RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
			//使用临时文件来保存插入点后的数据
			FileOutputStream tmpOut = new FileOutputStream(tmp);
			FileInputStream tmpIn = new FileInputStream(tmp);){
			raf.seek(pos);
			//----将插入点之后的内容读入到临时文件中保存-----//
			byte[] bbuf = new byte[64];
			int hasRead = 0;
			while((hasRead = raf.read(bbuf)) > 0){
				tmpOut.write(bbuf, 0, hasRead);
			}
			//----插入内容----//
			raf.seek(pos);
			raf.write(insertContent.getBytes());
			//----追加临时文件中的内容----//
			while((hasRead = tmpIn.read(bbuf)) > 0){
				raf.write(bbuf, 0, hasRead);
			}
		}
		catch(IOException ioe){ioe.printStackTrace();}
	}
	public static void main(String[] args) 
			throws Exception {
			insert("F:\\eclipsework\\Crazy-java\\src\\com\\Licht\\_15\\InsertContent.java"
				, 45, "插入的内容\r\n");
		}
}