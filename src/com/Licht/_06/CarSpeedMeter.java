package com.Licht._06;
/*
 * ����SpeedMeter�����࣬ʵ�ָ���ĳ��󷽷�getRadius()
 */
public class CarSpeedMeter extends SpeedMeter {
	public double getRadius(){
		return 0.28;
	}
	public static void main(String[] args){
		CarSpeedMeter csm = new CarSpeedMeter();
		//����ת�٣����ʸ����private����
		csm.setTurnRate(15.0);
		System.out.println(csm.getSpeed());//�����ͨ�ü���ת�ٵķ���
	}
}
