package com.Licht._16.UserInfoServerClient;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
*服务器端Thread，处理通信任务
*/
public class ServerThread extends Thread{
	private Socket s;
	BufferedReader br = null;
	PrintStream ps = null;
	public ServerThread(Socket s){
		this.s = s;
	}
	public void run(){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintStream ps = new PrintStream(s.getOutputStream());
			String line = null;
			while((line = br.readLine()) != null){
				//如果读到的行是以InformatinProtocal.USER_ROUND开始，
				//并以其结束，则确定读到的是用户登录的用户名
				if(line.startsWith(InformationProtocol.USER_ROUND)
					&& line.endsWith(InformationProtocol.USER_ROUND)){
					//得到真实消息
					String userName = getRealMsg(line);
					//如果用户名重复
					if(Server.clients.map.containsKey(userName)){
						System.out.println("用户名重复");
						ps.println(InformationProtocol.NAME_REP);//输出表示用户名重复的协议字符
					}
					else{
						System.out.println("成功");
						ps.println(InformationProtocol.LOGIN_SUCCESS); //输出表示登录成功的协议字符
						Server.clients.put(userName, ps); //向客户端与输出流对应的Map中添加用户和Socket
					}
				}
				//如果读到的行是以InformationProtocal.PRIVATE_ROUND开始，
				//并以其结束，则确定是私聊信息，只向特定输出流发送
				//发送的Mdg是包含user和msg的（要发送的用户，和要发送给他的信息）
				else if(line.startsWith(InformationProtocol.PRIVATE_ROUND)
					&& line.endsWith(InformationProtocol.PRIVATE_ROUND)){
					String userAndMsg = getRealMsg(line);
				//以SPLIT_SIGN分割字符串，前半是要私聊用户，后半是要发送的私聊信息
					String user = userAndMsg.split(InformationProtocol.SPLIT_SIGN)[0];
					String msg = userAndMsg.split(InformationProtocol.SPLIT_SIGN)[1];
					//获取私聊用户对应的输出流，根据getKeyByValue()方法获得该输出流对应的原发送客户端，
					//并发送私聊信息
					Server.clients.map.get(user).println(Server.clients
						.getKeyByValue(ps) + "悄悄地对你说：" + msg);
				}
				//公聊信息，向每个Socket发送
				else{
					String msg = getRealMsg(line);
					//遍历clients中的每个输出流
					for (PrintStream clientsPs : Server.clients.valueSet()){
						clientsPs.println(Server.clients.getKeyByValue(ps)
							+ "说 ：" + msg);
					}
				}
			}
		}
		//捕获到异常后，表明Socket对应的客户端出了问题，
		//将其从对应的输出流Map中剔除
		catch(IOException e){
			Server.clients.removeByValue(ps);
			System.out.println(Server.clients.map.size());
			//关闭网络、IO资源
			try{
				if(br != null){
					br.close();
				}
				if(ps != null){
					ps.close();
				}
				if( s != null){
					s.close();
				}
			}
			catch(IOException ex){ //catch中套一层catch，两个形参不同？
				ex.printStackTrace();
			}
		}
	}
	//将读到的内容去掉前后协议字符，恢复成真实消息
			private String getRealMsg(String line){
				return line.substring(InformationProtocol.PROTOCOL_LEN
					, line.length() - InformationProtocol.PROTOCOL_LEN); //真实数据=有协议字符的字符串-协议字符的长度（前后都减掉了）
			}
			public void start() {
				// TODO Auto-generated method stub
				
			}
}