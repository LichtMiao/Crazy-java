package com.Licht._11;
import java.awt.Frame;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventQs{
	private Frame f = new Frame("测试事件");
	private Button ok = new Button("确定");
	private TextField tf = new TextField(30);
	public void init(){
		//注册事件监听器
		ok.addActionListener(new OkListener());
		f.add(tf);
		f.add(ok, BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	class OkListener implements ActionListener{
		//下面定义的方法是事件处理器，用于响应特定的事件
		public void actionPerformed(ActionEvent e){
			System.out.println("用户单击了ok按钮");
			tf.setText("Hello");
		}
	}
	
	public static void main(String[] args){
		new EventQs().init();
	}
}