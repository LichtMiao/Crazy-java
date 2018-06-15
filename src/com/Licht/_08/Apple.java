package com.Licht._08;
//定义Apple类时使用了泛型声明
public class Apple<T>{
	//使用T型形参定义实例变量
	public T info;
	public Apple(){}
	public Apple(T info){
		this.info = info;
	}
	public void setInfo(T info){
		this.info = info;
	}
	public T getInfo(){
		return this.info;
	}
	public static void main(String[] args){
		Apple<String> a1 = new Apple<>("苹果");
		System.out.println(a1.getInfo());
		Apple<Double> a2 = new Apple<>(5.67);
		System.out.println(a2.getInfo());
	}
}