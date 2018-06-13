package com.Licht._08;
/*
*List类比Set类还增加了listIterator()方法，与Iterator不同
*/
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class ListIteratorTest{
	public static void main(String[] args){
		String[] books = {
			"aa", "bb",
			"cc"
		};
		List bookList = new ArrayList();
		for(int i = 0; i < books.length; i++){
			bookList.add(books[i]);
		}
		ListIterator lis = bookList.listIterator();
		//正向迭代
		while(lis.hasNext()){
			System.out.println(lis.next());
			lis.add("迭代过程中可以上一次迭代元素后面添加新元素");
		}
		//反向迭代
		while(lis.hasPrevious()){
			System.out.println(lis.previous());
		}	
	}
}