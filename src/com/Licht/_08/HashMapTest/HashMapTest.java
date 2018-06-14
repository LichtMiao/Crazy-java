package com.Licht._08.HashMapTest;

import java.util.HashMap;

public class HashMapTest{
	public static void main(String[] args){
		HashMap hm = new HashMap();
		hm.put(new A(60000), "aa");
		hm.put(new A(87563), "bb");
		hm.put(new A(1232), new B()); 
		//不是按照添加的顺序输出的
		System.out.println(hm + ",");
		//由于B对象与任何value比较都为true,但输出却为false？
		System.out.println(hm.containsValue("dd")); //true???
		System.out.println(hm.containsKey(new A(87563))); //true
		hm.remove(new A(1232)); //删除最后一个字符串
		System.out.println(hm);
	}
}