package com.Licht._06;
/*
 * 使用接口Command来定义一个处理行为的方法process()
 */
public interface Command {
	void process(int[] target);
}
