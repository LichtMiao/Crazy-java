package com.Licht._06;
/*
 * Computer�����һ��Output���Ͷ���ʵ��Computer���Printer��ķ���
 * Computer�಻�ٸ��𴴽�Output����
 * ϵͳ�ṩһ��Output����OutputFactory����������Output����
 */
public class Computer {
	// ����һ��Output�ӿ����͵ĳ�Ա����
	private Output out;
	// ������ι�����
	public Computer(Output out){
		this.out = out;
	}
	// ����һ��ģ���ȡ�ַ����ķ���
	public void keyIn(String msg){
		out.getData(msg); // ����Output���ͽӿڵ�getData()���󷽷�
	}
	// ����һ��ģ���ӡ�ķ���
	public void print(){
		out.out(); // ����Output���ͽӿڵ�out()���󷽷�
	}
}
