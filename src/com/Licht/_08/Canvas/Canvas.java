package com.Licht._08.Canvas;

import java.util.List;

//定义Canvas类，是Shape子类的对象
public class Canvas{
	//同时在画布上绘制多个形状
	public void drawAll(List<? extends Shape> shapes){
		for(Shape s : shapes){
			s.draw(this);
		}
	}
}