package com.Licht._08.TreeMapTest;

import java.util.TreeMap;

public class TreeMapTest{
	public static void main(String[] args){
		TreeMap tm = new TreeMap();
		tm.put(new R(3), "aa");
		tm.put(new R(-5), "bb");
		tm.put(new R(9), "cc");
		System.out.println(tm);
		System.out.println(tm.firstEntry() + "\n" +
		tm.lastKey() + "\n" +
		tm.higherKey(new R(2)) + "\n" +
		tm.higherEntry(new R(2)) + "\n" +
		tm.subMap(new R(-1), new R(4)));
	}
}