package com.Licht._06;
/*
 * ϵͳ�ṩһ��Output����OutputFactory����������Output����
 */
public class OutputFactory {
	// �÷�������һ��Outputʵ�����ʵ�����÷���ֻ���𴴽�Outputʵ����
	// ���崴����һ��ʵ����Ķ����ɸ÷���������
	public Output getOutput(){
		return new BetterPrinter();
	}
	public static void main(String[] args){
		OutputFactory of  = new OutputFactory();
		Computer c = new Computer(of.getOutput());
		c.keyIn("è");
		c.keyIn("��");
		c.print();
	}
}
