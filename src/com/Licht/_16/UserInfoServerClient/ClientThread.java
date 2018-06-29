package com.Licht._16.UserInfoServerClient;


import java.io.BufferedReader;
import java.io.IOException;
/*
*客户端线程负责处理服务器端来的输入流
*/
public class ClientThread extends Thread{
	BufferedReader brServer = null;
	public ClientThread(BufferedReader brServer){
		this.brServer = brServer;
	}
	public void run(){
		try{
			String line = null;
			while((line = brServer.readLine()) != null){
				System.out.println(line); //打印从服务器端读到的内容
			}
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
		//使用finally块来关闭该线程对应的输入流
		finally{
			try{
				if(brServer != null){
					brServer.close();
				}
			}
			catch(IOException ex){
				ex.printStackTrace();
			}
		}
	}
}