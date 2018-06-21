package com.Licht._08.AuctionTest;
/*
*利用catch块结合throw语句，可以实现
*多个方法协同处理一个异常的情形
*/
public class AuctionTest{
	private double intPrice = 30.0;
	public void bid(String bidPrice)
	throws AuctionException{
		double d = 0.0;
		try{
			d = Double.parseDouble(bidPrice);
		}
		catch(Exception e){
			//仅在控制台打印异常跟踪信息
			e.printStackTrace();
			//再次抛出自定义异常
			throw new AuctionException("竞拍价必须是整数，" +
				"不能包含其他字符！");
		}
		if (intPrice > d){
			throw new AuctionException("竞拍价比起拍价低，" +
				"不允许竞拍");
		}
	}
	public static void main(String[] args){
		AuctionTest at = new AuctionTest();
		try{
			at.bid("df");
		}
		catch(AuctionException ae){
			//再次捕获bid()方法中的异常，并对该异常进行处理
			System.err.println(ae.getMessage());
		}
	}
}