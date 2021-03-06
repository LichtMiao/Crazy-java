package com.Licht._08;

import java.io.FileInputStream;
import java.io.IOException;

public class FinallyTest{
	public static void main(String[] args){
		FileInputStream fis = null;
		try{
			fis = new FileInputStream("a.txt");
		}
		catch(IOException ioe){
			System.out.println(ioe.getMessage());
			//return语句强制方法返回，但finally块依然会执行
			return;
		}
		finally{
			//关闭磁盘文件，回收资源
			if(fis != null){
				try{
					fis.close();
				}
				catch(IOException ioe){
					ioe.printStackTrace();
				}
			}
			System.out.println("执行finally块中的资源回收");
		}
	}
}