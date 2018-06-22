/*通过事件适配器来创建事件监听器，
*运行用户单击窗口右上角的×按钮结束程序
*/
package com.Licht._11;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class WindowAdapterTest{
	private Frame f = new Frame();
	private TextArea ta = new TextArea(6,40);
	public void init(){
		//为窗口添加事件监听器
		f.addWindowListener(new MyListener());
		f.add(ta);
		f.pack();
		f.setVisible(true);
	}
	class MyListener extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			System.out.println("用户窗口关闭\n");
			System.exit(0);
		}
	}
	public static void main(String[] args){
		new WindowAdapterTest().init();
	}
}
