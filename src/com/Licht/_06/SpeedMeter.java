package com.Licht._06;
/*
 * һ���������࣬����=2*PI*���ְ뾶*ת��
 * ���õ��뾶�ķ�����һ�����󷽷�
 */
public abstract class SpeedMeter {
	//ת��
	private double turnRate;
	public SpeedMeter(){
		
	}
	//�ѷ��س��ְ뾶�ķ�������Ϊ���󷽷�
	public abstract double getRadius();
	//����private����
	public void setTurnRate(double turnRate){
		this.turnRate = turnRate;
	}
	//��������ٶȵ�ͨ�÷���
	public double getSpeed(){
		return java.lang.Math.PI * 2 * getRadius() * turnRate;
	}
}
