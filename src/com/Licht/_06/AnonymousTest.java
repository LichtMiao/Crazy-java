package com.Licht._06;
/*
 * 使用一次的匿名内部类创建某个接口需要的对象
 */
public class AnonymousTest {
	public void test(Product1 p){
		System.out.println("购买了" + p.getName() + 
				",用掉了" + p.getPrice());
	}
	public static void main(String[] args){
		AnonymousTest at = new AnonymousTest();
		at.test(new Product1(){
			public double getPrice(){
				return 567.8;
			}
			public String getName(){
				return "AGP显卡";
			}
		});
	}
}
