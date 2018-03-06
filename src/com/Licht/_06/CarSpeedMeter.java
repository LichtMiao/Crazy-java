package com.Licht._06;
/*
 * 定义SpeedMeter的子类，实现父类的抽象方法getRadius()
 */
public class CarSpeedMeter extends SpeedMeter {
	public double getRadius(){
		return 0.28;
	}
	public static void main(String[] args){
		CarSpeedMeter csm = new CarSpeedMeter();
		//设置转速，访问父类的private变量
		csm.setTurnRate(15.0);
		System.out.println(csm.getSpeed());//父类的通用计算转速的方法
	}
}
