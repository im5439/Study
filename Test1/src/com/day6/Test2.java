package com.day6;

import java.util.Random;

public class Test2 {

	public static void main(String[] args) {

		// 1~45������ �� �� 6���� ������ �߻����� ũ������� ���

		Random rd = new Random();

		int[] num = new int[6];

		int i, j, n, temp;

		n = 0;
		while (n < 6) { // ��� �ݺ����� �� �� ����.(while)
			
			num[n] = rd.nextInt(45) + 1; // 0~44 -> 45��

			for (i = 0; i < n; i++) {

				if (num[i] == num[n]) {
					n--;
					break;
				}

			}

			n++;
		}

		for (i = 0; i < num.length-1; i++) {
			for (j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}

		for (int su : num) {
			System.out.printf("%4d", su);
		}

	}

}