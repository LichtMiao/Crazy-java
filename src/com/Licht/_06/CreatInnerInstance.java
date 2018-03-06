package com.Licht._06;
/*
 * 在外部类外创建实例
 */
public class CreatInnerInstance {
	public static void main(String[] args){
		Out.In in = new Out().new In("测试信息");
	}
}
