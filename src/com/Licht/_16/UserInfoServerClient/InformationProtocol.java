package com.Licht._16.UserInfoServerClient;
/*
*定义接口，用于提供协议字符
*客户端发送不同信息之前，先对内容进行处理
*/
public interface InformationProtocol{
	//定义协议字符的长度
	int PROTOCOL_LEN = 2;
	//定义协议字符，服务器端和客户端交换信息都该在前、后添加这种特殊字符
	String MSG_ROUND = "§№";
	String USER_ROUND = "€◇";
	String LOGIN_SUCCESS = "1";
	String NAME_REP = "-1";
	String PRIVATE_ROUND = "★【";
	String SPLIT_SIGN = "※";
}