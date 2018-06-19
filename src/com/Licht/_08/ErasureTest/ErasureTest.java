package com.Licht._08.ErasureTest;
/*
*当把一个具有泛型信息的对象赋给灭有泛型信息对象时，
*尖括号内的内容都将被扔掉
*/
public class ErasureTest{
	public static void main(String[] args){
	Apple<Integer> a = new Apple<>(6);
	Integer as = a.getSize();
	//把a对象赋值给b变量，尖括号的信息将丢失
	Apple b = a;
	//由于编译器知道Apple类的类型形参上限Number，
	//所以编译器依然直到b的getSize()方法返回的是Number类型
	Number size1 = b.getSize();
	}
}
