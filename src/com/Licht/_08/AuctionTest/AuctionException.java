package com.Licht._08.AuctionTest;
/*
*自定义异常类
*/
public class AuctionException extends Exception{
	public AuctionException(){}
	public AuctionException(String msg){
		//调用父类的构造器
		super(msg);
	}
}