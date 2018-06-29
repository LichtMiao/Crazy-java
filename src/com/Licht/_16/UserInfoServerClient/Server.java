package com.Licht._16.UserInfoServerClient;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintStream;
import java.io.IOException;
/*服务器端*/
public class Server{
	private static final int SERVER_PORT = 30000;
	//使用InformationMap保存用户和对应输出流之间的关系
	public static InformationMap<String, PrintStream> clients 
		= new InformationMap<>();
	public void init(){
		try{
			ServerSocket ss = new ServerSocket(SERVER_PORT);
			while(true){
				Socket s = ss.accept();
				new ServerThread(s).start();
			}
		}
		catch(IOException ex){
			System.out.println("服务器启动失败，是否端口"
					+ SERVER_PORT + "已被占用？");
		}
	}
	public static void main(String[] args){
		Server server = new Server();
		server.init();
	}
}