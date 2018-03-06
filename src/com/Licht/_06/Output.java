package com.Licht._06;
/*
 * ����һ��Output�ӿ�
 */
public interface Output {
	// �ӿ��ﶨ��ĳ�Ա����ֻ���ǳ���
	int MAX_CACHE_LINE = 50;
	
	// �ӿ��ﶨ�����ͨ����������public����(public abstract����ʡ��)����
	void out();
	void getData(String msg);
	
	// �ӿ��ж���Ĭ�Ϸ�����������default����
	// ����û��static������ʹ�ýӿ���ֱ�ӵ��ã���Ҫʹ�ýӿڵ�ʵ����������Ĭ�Ϸ���
	default void print(String...msgs){
		for(String msg : msgs){
			System.out.println(msg);
		}
	}
	default void test(){
		System.out.println("Ĭ�ϵ�test()����");
	}
	// �ӿ��ж����෽����������static����
	static String staticTest(){
		return "�ӿ�����෽��";
	}
}
