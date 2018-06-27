package com.Licht._15;
/*
 * 利用Buffer和Channel传统方式，
 * 不使用map()映射
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
public class ReadFile{
	public static void main(String[] args)
	throws IOException{
		try(FileInputStream fis = new FileInputStream("F:" 
			+ "\\eclipsework\\Crazy-java\\src\\com\\Licht\\_15\\ReadFile.java");
		FileChannel fcin = fis.getChannel();){
			//定义一个ByteBuffer对象，用于重复取水
			ByteBuffer buffer = ByteBuffer.allocate(256);
			while(fcin.read(buffer) != -1){
				buffer.flip();
				Charset charset = Charset.forName("GBK");
				CharsetDecoder decoder = charset.newDecoder();
				CharBuffer charBuffer = decoder.decode(buffer);
				System.out.println(charBuffer);
				buffer.clear();
			}
		}
		
	}
}