package com.Licht._06;
/*
 * ����ⲿ���Ա�������ڲ����Ա�������ڲ����﷽���ľֲ�����ͬ����
 * �����ʹ��this���ⲿ������.this��Ϊ�޶�������
 */
public class DiscernVariable {
	private String prop = "�ⲿ���ʵ������";
	private class InClass{
		private String prop = "�ڲ����ʵ������";
		public void info(){
			String prop = "�ֲ�����";
			//ͨ���ⲿ������.this.varName�����ⲿ����
			System.out.println("�ⲿ���ʵ������ֵ��" + DiscernVariable.this.prop);
			//ͨ��this.varName�����ڲ�����
			System.out.println("�ڲ����ʵ������ֵ��" + this.prop);
			//ֱ�ӷ��ʾֲ�����
			System.out.println("�ֲ�������ֵ��" + prop);
		}
	}
	public void test(){
		InClass in = new InClass();
		in.info();
	}
	public static void main(String[] args){
		new DiscernVariable().test();
	}
}
