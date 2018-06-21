package com.Licht._11;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class PanelTest {
	public static void main(String[] args){
		Frame f = new Frame("测试窗口");
		Panel p = new Panel();
		//向Panel容器中添加两个组件
		p.add(new TextField(20));
		p.add(new Button("单击我"));
		//将Panel容器添加到Frame窗口中
		f.add(p);
		f.setBounds(30,30, 250,130);
		f.setVisible(true);
	}
}
