package com.Licht._07;

public class StringBuilderTest {
 public static void main(String[] args)
 {
	 StringBuilder sb = new StringBuilder();
	 sb.append("java");
	 sb.insert(0,"hello "); // hello java
	 sb.replace(5, 6, ","); // hello,java
	 sb.delete(5, 6); // hellojava
	 System.out.println(sb);
	 sb.reverse(); // avajolleh
	 System.out.println(sb);
	 System.out.println(sb.length());  //9
	 System.out.println(sb.capacity()); // 16
	 sb.setLength(5); // avajo
	 System.out.println(sb);
 }
}
