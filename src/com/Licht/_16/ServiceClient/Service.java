package com.Licht._16.ServiceClient;
/*
*服务器端
*网络上传输的是二进制，节点流
 */

import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintStream;

public class Service{
	public static void main(String[] args)
		throws Exception{
			ServerSocket ss = new ServerSocket(30000); //服务器端使用3000端口
			while(true){
				Socket s = ss.accept(); //服务器接收客户端的请求，生成一个Socket
				//s.getOutputStream()获取的是Socket的节点输出流，
				//包装成处理流PrintStream输出
				PrintStream ps = new PrintStream(s.getOutputStream());
				ps.println("你接收到服务器端的信息");
				ps.close();
				s.close();
			}
		}
}