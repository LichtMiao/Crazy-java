package com.Licht._16.MultiThreadServerClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class MyClient{
	public static void main(String[] args)
		throws Exception{
			Socket s = new Socket("127.0.0.1", 30000);
			new Thread(new ClientThread(s)).start();
			PrintStream ps = new PrintStream(s.getOutputStream());
			String line = null;
			//不断读取键盘的输入
			BufferedReader br = new BufferedReader(
				new InputStreamReader(s.getInputStream()));
			while((line = br.readLine()) != null){
				//键盘输入写入Socket输出流
				ps.println(line);
			}
		}
}