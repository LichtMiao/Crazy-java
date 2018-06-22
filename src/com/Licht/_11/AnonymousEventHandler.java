//使用匿名内部类创建事件监听器
package com.Licht._11;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
public class AnonymousEventHandler{
	private Frame f = new Frame("测试");
	private TextArea ta= new TextArea(6,40);
	public void init(){
		//以匿名内部类的形式创建事件监听器
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.out.println("closing window");
				System.exit(0);
			}
		});
		f.add(ta);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args){
		new AnonymousEventHandler().init();
	}
}