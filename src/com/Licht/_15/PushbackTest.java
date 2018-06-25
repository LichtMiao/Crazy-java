package com.Licht._15;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

/*
*找出“new PushbackReader"字符串，当找到该字符串时，
*打印出目标字符串之前的内容
*/
public class PushbackTest{
	public static void main(String[] args){
		
		//创建PushbackReader对象，指定推回缓冲区长度64
		try(PushbackReader pr = new PushbackReader(new FileReader(
			"F:\\eclipsework\\Crazy-java\\src\\com\\Licht\\_15\\PushbackTest.java"), 64)){
			char[] buf = new char[32];
			String lastContent = "";
			int hasRead = 0;
			//读取pr的输入流，并将其存在buf数组中
			while((hasRead = pr.read(buf)) > 0){
				//将读取的内容转换成字符串
				String content = new String(buf, 0, hasRead);
				int targetIndex = 0;
				if ((targetIndex = (lastContent + content)
					.indexOf("new PushbackReader")) > 0){ //返回子串第一次出现的索引
					//将本次内容和上次内容一起推回缓冲区
					pr.unread((lastContent + content).toCharArray());
					//重新定义一个长度为targetIndex的数组
					if(targetIndex > 32){
						buf = new char[targetIndex]; 
					}
					//读取目标字符串之前的内容
					pr.read(buf, 0, targetIndex);
					//打印获取的内容
					System.out.println(new String(buf, 0, targetIndex));
					System.exit(0);
				}
				else{
					//打印上次读取的内容
					System.out.println(lastContent);
					lastContent = content;
				}
			}
		}
		catch(IOException ioe){ioe.printStackTrace();}
	}
}