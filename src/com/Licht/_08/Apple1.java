package com.Licht._08;
//设定类型形参的上限
public class Apple1<T extends Number>{
	T col;
	public static void main(String[] args){
		Apple1<Integer> ai = new Apple1<>();
		Apple1<Double> ad = new Apple1<>();
	}
}