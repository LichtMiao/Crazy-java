package com.Licht._07;

import java.util.Scanner;

public class ScannerKeyBoardTest {
	public static void main(String[] args){
		//System.in��׼���룬����������
		Scanner sc = new Scanner(System.in);
		//��������һ�У���ֻ�ѻس���Ϊ�ָ���
		sc.useDelimiter("\n");
		//�ж��Ƿ�����һ��������
		while(sc.hasNext()){
			System.out.println("��������������ǣ�"
					+ sc.next());
		}
	}
}
