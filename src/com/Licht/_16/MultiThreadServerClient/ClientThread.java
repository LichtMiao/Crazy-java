package com.Licht._16.MultiThreadServerClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientThread implements Runnable{
	private Socket s;
	BufferedReader br = null;
	public ClientThread(Socket s)
		throws Exception{
			this.s = s;
			BufferedReader br = new BufferedReader(
				new InputStreamReader(s.getInputStream()));
	}
	public void run(){
		try{
			String content = null;
			while((content = br.readLine()) != null){
				System.out.println(content);
			}
		}
		catch(Exception e){e.printStackTrace();}
	}
}