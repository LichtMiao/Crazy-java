package com.Licht._06;

public class AnonymousInner {
	public void test(Device d){
		System.out.println("购买了" + d.getName() +
				"，用掉了" + d.getPrice());
	}
	public static void main(String[] args){
		AnonymousInner ai = new AnonymousInner();
		ai.test(new Device("电子示波器"){
			public double getPrice(){
				return 67.8;
			}
		});
	}
}
