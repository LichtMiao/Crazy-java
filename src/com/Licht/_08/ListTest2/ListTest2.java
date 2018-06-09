
package com.Licht._08.ListTest2;

import java.util.ArrayList;
import java.util.List;

public class ListTest2{
	public static void main(String[] args){
		List books = new ArrayList();
		books.add(new String("aa"));
		books.add(new String("bb"));
		books.add(new String("cc"));
		System.out.println(books);
		books.remove(new A());
		System.out.println(books);
	}
}