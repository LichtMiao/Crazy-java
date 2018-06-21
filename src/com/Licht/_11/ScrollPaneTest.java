package com.Licht._11;

import java.awt.Button;
import java.awt.Frame;
import java.awt.ScrollPane;
import java.awt.TextField;

public class ScrollPaneTest {
	public static void main(String[] args){
		Frame f = new Frame("测试窗口");
		//总是具有滑动条
		ScrollPane sp = new ScrollPane(
				ScrollPane.SCROLLBARS_ALWAYS);
		sp.add(new TextField(20));
		sp.add(new Button("单击我"));
		f.add(sp);
		f.setBounds(30,30,250,120);
		f.setVisible(true);
	}
}
