package com.quiz4;

import java.io.IOException;

public class Q1 {

//	[문제1]
//			System.in.read()만 사용해서 숫자를 입력받고
//			입력받은 수까지의 합계를 구하시오(힌트 : 48)
//
//			조건
//			1.BufferedReader X
//			2.Scanner X
//
//			모양
//			수입력? 10
//			1-10까지의 합: 55

	public static void main(String[] args) throws IOException {

		int n = 0, s = 0;
		int data;
		System.out.print("어떤수 : ");
		while ((data = System.in.read()) != 13) { // 13은 Enter
			n = n * 10 + data - 48; // 문자0 -> ASCII48
		}

		for (int i = 1; i <= n; i++) {
			s += i;
		}
		System.out.print("결과  : " + s);

	}

}
