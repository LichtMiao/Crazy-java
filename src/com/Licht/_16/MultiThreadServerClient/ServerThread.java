package com.Licht._16.MultiThreadServerClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ServerThread implements Runnable{
	//定义当前线程所处的Socket
	Socket s = null;
	//该线程所处Socket对应的输入流
	BufferedReader br = null;
	public ServerThread(Socket s)
		throws Exception{ 
			this.s = s;
			BufferedReader br = new BufferedReader(
				new InputStreamReader(s.getInputStream()));
	}
	public void run(){
		try{
			String content = null;
			//采用循环不断从Socket中读取客户单发来的数据
			while((content = readFromClient()) != null){
				//遍历socketList中每个Socket，
				//并将读到的内容发送给每个Socket
				for(Socket s : MyServer.socketList){
					PrintStream ps = new PrintStream(s.getOutputStream());
					ps.println(content);
				}
			}
		}
		catch(IOException ioe){ioe.printStackTrace();}
	}
	private String readFromClient(){
		try{
			return br.readLine();
		}
		catch(IOException ioe){
			MyServer.socketList.remove(s);
		}
		return null;
	}
}