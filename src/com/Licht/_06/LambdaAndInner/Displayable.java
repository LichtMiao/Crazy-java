package com.Licht._06.LambdaAndInner;

interface Displayable {
	void display();
	default int add(int a, int b){
		return a + b;
	}
}
