package com.Licht._06;

public class SubClass extends Out.In{
	public SubClass(Out out){
		out.super("Hello"); // 非静态内部类In类必须使用外部类Out类来调用，
                            // 创建SubClass对象时，必须先创建一个Out对象，
                            // out代表外部类对象，super代表调用（父类）In类构造器
	}
}

