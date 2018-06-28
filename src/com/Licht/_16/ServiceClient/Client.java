package com.Licht._16.ServiceClient;
/*
*客户端
 */
import java.net.Socket;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Client{
	public static void main(String[] args)
		throws Exception{
			//ServerSocket和Socket建立网络连接
			Socket s = new Socket("127.0.0.1", 3000); 
			//获取Socket的输入流， InputStreamReader将字节转换为字符，
			//BufferReader将普通Reader包装成BufferReader
			BufferedReader br = new BufferedReader(
				new InputStreamReader(s.getInputStream()));
			String line = br.readLine(); //逐行读取
			System.out.println("来自服务器端的信息：" + line);
			br.close();
			s.close();
		}
}