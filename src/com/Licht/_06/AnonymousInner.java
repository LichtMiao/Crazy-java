package com.Licht._06;

public class AnonymousInner {
	public void test(Device d){
		System.out.println("������" + d.getName() +
				"���õ���" + d.getPrice());
	}
	public static void main(String[] args){
		AnonymousInner ai = new AnonymousInner();
		ai.test(new Device("����ʾ����"){
			public double getPrice(){
				return 67.8;
			}
		});
	}
}
