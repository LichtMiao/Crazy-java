package com.Licht._16.MultiThreadServerClient;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyServer{
	//定义保存suoyouSocket的ArrayList，并将其包装成线程安全的
	public static List<Socket> socketList 
		= Collections.synchronizedList(new ArrayList<>());
	public static void main(String[] args)
		throws Exception{
			//创建ServerSocket监听
			ServerSocket ss = new ServerSocket(30000);
			while(true){
				Socket s = ss.accept();
				socketList.add(s);
				//当客户端连接成功后启动一个ServerThread为该客户端服务
				new Thread(new ServerThread(s)).start();
			}
	}
}