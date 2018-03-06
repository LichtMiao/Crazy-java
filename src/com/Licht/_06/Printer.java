package com.Licht._06;
/*
 * ����һ��ʵ�ֽӿ�Output,Product����Printer
 */
public class Printer implements Output, Product {
	private String[] printData = new String[MAX_CACHE_LINE];
	//�����¼��ǰ��Ҫ��ӡ����ҵ��
	private int dataNum = 0;
	//ʵ�ֽӿ�Output�ĳ��󷽷�out()
	public void out(){
		//ֻҪ������ҵ���ͼ�����ӡ
		while(dataNum >0){
			System.out.println("��ӡ����ӡ�� " + printData[0]);
			//����ҵ������ǰ��һλ������ʣ�µ���ҵ����һ
			System.arraycopy(printData, 1
					, printData, 0, --dataNum);
		}
	}
	//ʵ�ֽӿ�Output��ĳ��󷽷�getData()
	//�����ӡ������msg
	public void getData(String msg){
		if(dataNum >= MAX_CACHE_LINE){
			System.out.println("����������������ʧ��");
		}
		else {
			//�Ѵ�ӡ��������ӵ�����ѱ������ݵ�������1
			printData[dataNum++] = msg;
		}
	}
	
	//ʵ�ֽӿ�Product�ĳ��󷽷�getProduceTime()
	public int getProduceTime(){
		return 45;
	}
	public static void main(String[] args){
		//����һ��Printer���󣬵���Outputʹ��
		Output o = new Printer();
		o.getData("���");
		o.getData("��");
		o.out();
		o.getData("è");
		o.getData("��");
		o.out();
		//����Output�ӿ��ж����Ĭ�Ϸ���
		o.print("�����", "��˽�", "�׹Ǿ�");
		o.test();
		//����һ��Printer���󣬵���Productʹ��
		Product p = new Printer();
		System.out.println(p.getProduceTime());
		//���нӿ����͵����ñ���������ֱ�Ӹ���Object���͵ı���
		Object obj = p;//����ת��
	}
}
