package com.day6;

public class Test6 {

	public static void main(String[] args) {

		// 배열의 배열

		int[][] arr = new int[6][6];

		int i, j;
		int n = 0;

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
//				System.out.println(i+":"+j);

				n++;
				arr[i][j] = n;
				arr[5][j] += n; // 세로
				arr[i][5] += n; // 가로
				arr[5][5] += n; // 전체

			}
		}

		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length; j++) {

				System.out.printf("%4d", arr[i][j]);
				
			}
			System.out.println();
		}

	}

}
