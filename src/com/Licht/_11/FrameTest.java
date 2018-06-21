package com.Licht._11;

import java.awt.Frame;

public class FrameTest {
	public static void main(String[] args){
		Frame f = new Frame("测试窗口");
		f.setBounds(30,30, 250,200);
		//Frame对象初始化默认不可见
		f.setVisible(true);
	}
}
