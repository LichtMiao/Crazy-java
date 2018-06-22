package com.Licht._11;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
*一个监听器监听多个组件，一个组件被多个监听器监听。
*单击b1，两个监听器的actionPerformed()方法都会被触发，
*而f1同时监听b1、b2，它们之中任意按钮被单击时，监听器的
*actionPerform()方法都会被触发。
*/
public class MultiListener{
	private Frame f = new Frame("测试");
	
	private TextArea ta = new TextArea(6,40);
	private Button b1 = new Button("按钮1");
	private Button b2 = new Button("按钮2");
	public void init(){
		//设置Frame为FlowLayout布局管理,按钮居中，横向间隔20，垂直间隔5
		f.setLayout(new FlowLayout(FlowLayout.CENTER, 20,5));
		//创建FirstListener事件监听器的实例
		FirstListener f1 = new FirstListener();
		//给b1按钮注册两个事件监听器
		b1.addActionListener(f1);
		b1.addActionListener(new SecondListener());
		//给b2按钮注册事件监听器f1
		b2.addActionListener(f1);
		f.add(ta);
		Panel p = new Panel();
		f.add(b1);
		f.add(b2);
		f.add(p, BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	//实现事件监听器类，它实现ActionListener接口
	class FirstListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			ta.append("第一个事件监听器被触发，事件源是"
		+ e.getActionCommand() + "\n");
		}
	}
	class SecondListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			ta.append("单击了“"
		+ e.getActionCommand() + " ”按钮\n");
		}
	}
	
	public static void main(String[] args){
		new MultiListener().init();
	}
}