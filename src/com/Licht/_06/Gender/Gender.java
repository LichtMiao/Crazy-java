package com.Licht._06.Gender;

public enum Gender implements GenderDesc {
	MALE("��"){ // ����������ʵ��һ�����岿��
		public void info(){
			System.out.println("���ö��ֵ��������");
		}
	},
	FEMALE("Ů"){
		public void info(){
			System.out.println("���ö��ֵ����Ů��");
		}
	};
	private String name;
	//ö����Ĺ�����ֻ����private������
	private Gender(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
}
