package com.Licht._06;
/*
 * ʹ��һ�ε������ڲ��ഴ��ĳ���ӿ���Ҫ�Ķ���
 */
public class AnonymousTest {
	public void test(Product1 p){
		System.out.println("������" + p.getName() + 
				",�õ���" + p.getPrice());
	}
	public static void main(String[] args){
		AnonymousTest at = new AnonymousTest();
		at.test(new Product1(){
			public double getPrice(){
				return 567.8;
			}
			public String getName(){
				return "AGP�Կ�";
			}
		});
	}
}
