package com.Licht._11;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Button;
public class GridLayoutTest{
	public static void main(String[] args){
		Frame f = new Frame("计算器");
		//f.setLayout(new BorderLayout(30,5));
		Panel p1 = new Panel();
		p1.add(new TextField(30));
		f.add(p1, BorderLayout.NORTH);
		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(3, 5, 4, 4));
		String[] name  = {"0", "1", "2", "3"
			, "4", "5", "6", "7", "8", "9"
			, "+", "-", "*", "/", "."};
		//向Panel中添加15个按钮
		for(int i = 0; i < 15; i++){
			p2.add(new Button(name[i]));
		}
		f.add(p2); //默认将p2添加到f中间
		f.pack(); //设置窗口为最佳大小
		f.setVisible(true);
	}
}