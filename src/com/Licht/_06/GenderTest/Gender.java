package com.Licht._06.GenderTest;

public enum Gender {
	//�˴���ö��ֵ������ö�Ӧ�Ĺ�����������
	MALE("��"), FEMALE("Ů");
	private String name;
	//ö����Ĺ�����ֻ����private������
	private Gender(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
}
