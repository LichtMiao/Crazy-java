package com.Licht._06;
/*
 * 一个抽象车速类，车速=2*PI*车轮半径*转速
 * 而得到半径的方法是一个抽象方法
 */
public abstract class SpeedMeter {
	//转速
	private double turnRate;
	public SpeedMeter(){
		
	}
	//把返回车轮半径的方法定义为抽象方法
	public abstract double getRadius();
	//设置private变量
	public void setTurnRate(double turnRate){
		this.turnRate = turnRate;
	}
	//定义计算速度的通用方法
	public double getSpeed(){
		return java.lang.Math.PI * 2 * getRadius() * turnRate;
	}
}
