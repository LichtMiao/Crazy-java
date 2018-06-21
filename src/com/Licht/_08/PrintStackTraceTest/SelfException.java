package com.Licht._08.PrintStackTraceTest;
//自定义SelfException类
class SelfException extends Exception{
	public SelfException(){}
	public SelfException(String msg){
		super(msg);
	}
}