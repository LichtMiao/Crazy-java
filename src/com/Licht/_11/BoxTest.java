package com.Licht._11;

import java.awt.Frame;
import javax.swing.Box;
import java.awt.Button;
import java.awt.BorderLayout;

public class BoxTest{
	private Frame f = new Frame();
	//定义水平摆放组件的Box对象
	private Box horizontal = Box.createHorizontalBox();
	//定义水平摆放组件的Box对象
	private Box vertical = Box.createVerticalBox();
	public void init(){
		horizontal.add(new Button("水平按钮1"));
		horizontal.add(new Button("水平按钮2"));
		vertical.add(new Button("垂直按钮1"));
		vertical.add(new Button("垂直按钮2"));
		f.add(horizontal, BorderLayout.NORTH);
		f.add(vertical);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args){
		new BoxTest().init();
	}
}