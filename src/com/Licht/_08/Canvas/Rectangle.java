package com.Licht._08.Canvas;
//定义Shape的子类Rectangle
public abstract class Rectangle extends Shape{
	public void draw(Canvas c){
		System.out.println("在画布" + c + "上画一个矩形");
	}
}