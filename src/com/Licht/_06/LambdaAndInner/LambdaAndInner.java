package com.Licht._06.LambdaAndInner;

public class LambdaAndInner {
	private int age = 12;
	private static String name = "crazy";
	public void test(){
		String book = "���java";
		//ʹ��Lambda���ʽ������һ��Displayable�ӿڵ�ʵ��
		Displayable dis = () -> {
			//�������ڲ������Ƶ��ǣ�Lambda���ʽ�����˾ֲ�����book��
			//�൱����final�����ˣ����Ҳ�޷���book���¸�ֵ
			System.out.println("book�ֲ�����Ϊ" + book);
			System.out.println("�ⲿ���ageʵ������Ϊ" + age);
			System.out.println("�ⲿ���nameʵ������Ϊ" + name);
		};
		//ʹ��Lambda���ʽ������һ��Displayable�ӿڵ�ʵ����
		//���Ե��ýӿ��еĳ��󷽷���Ĭ�Ϸ���
		dis.display();
		//Lambda���ʽ���ܵ��ýӿ��е�Ĭ�Ϸ�������ֱ��add��3,5)����
		System.out.println(dis.add(3, 5));
	}
	public static void main(String[] args){
		LambdaAndInner lambda = new LambdaAndInner();
		lambda.test();
	}
}
