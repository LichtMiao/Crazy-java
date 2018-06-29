package com.Licht._16.UserInfoServerClient;


import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.BufferedReader;
import java.io.IOException;
/*客户端*/
public class Client{
	private static final int SERVER_PORT = 30000;
	private Socket s;
	private BufferedReader brKeyIn = null;
	private BufferedReader brServer = null;
	private PrintStream ps = null;
	public void init(){
		try{
			//获取键盘输入流
			BufferedReader brKeyIn = new BufferedReader(new InputStreamReader(System.in));
			Socket s = new Socket("127.0.01", SERVER_PORT);
			BufferedReader brServer = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintStream ps = new PrintStream(s.getOutputStream());
			//采用循环不断地弹出对话框要求用户输入用户名
			String tip = "";
			while(true){
				String userName = JOptionPane.showInputDialog(tip + "输入用户名");
				//在用户名的前后增加协议字符发送
				ps.println(InformationProtocol.USER_ROUND + userName 
						+ InformationProtocol.USER_ROUND);
				//读取服务器端的响应
				String result = brServer.readLine();
				//如果用户名重复，则开始下次循环
				if(result.equals(InformationProtocol.NAME_REP)){
					tip = "用户名重复，请重新";
					continue;
				}
				//如果服务器端返回登录成功，则结束循环
				if (result.equals(InformationProtocol.LOGIN_SUCCESS)){
					break;
				}
			}
		}
		//捕获到异常，关闭资源，并退出该程序
		catch(UnknownHostException ex){
			System.out.println("找不到远程服务器，请确定服务器已经启动个！");
			closeRs();
			System.exit(1); //非0表示非正常退出
		}
		catch(IOException ioe){
			System.out.println("网络异常！请重新登录！");
			closeRs();
			System.exit(1);
		}
		//以该Socket对应的服务器端输入流启动ClientThread线程
		new ClientThread(brServer).start();
	}

		//定义一个读取键盘输出，并向网络发送的方法
		private void readAndSend(){
			try{
				String line = null;
				while((line = brKeyIn.readLine()) != null){
					//如果发送的信号中有冒号，并且以//开头，则认为想发送私聊信息
					if (line.indexOf(":") > 0 && line.startsWith("//")){
						line = line.substring(2);
						//以：分割字符串，前半是要私聊的用户，后半是发送的消息
						ps.println(InformationProtocol.PRIVATE_ROUND 
							+ line.split(":")[0] + InformationProtocol.SPLIT_SIGN 
							+ line.split(":")[1] + InformationProtocol.PRIVATE_ROUND); 
					}
				}
			}
			//捕捉到异常，关闭网络资源，并退出该程序
			catch(IOException ex){
				System.out.println("网络通信异常！请重新登录！");
				closeRs();
				System.exit(1);
			}
		}
		//关闭Socket、输入、输出流
		private void closeRs(){
			try{
				if (brKeyIn != null){
					brKeyIn.close();
				}
				if (brServer != null){
					brServer.close();
				}
				if (ps != null){
					ps.close();
				}
				if(s != null){
					s.close();
				}
			}
			catch (IOException ioe){
				ioe.printStackTrace();
			}
		}
	public static void main(String[] args){
		Client client = new Client();
		client.init();
		client.readAndSend();
	}
}