package com.day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {

	public static void main(String[] args) throws IOException {

		// 주민번호검사

		// 941010-2167541
		// 234567 892345
		// 합 = (9*2)+(4*3)+...+(4*5)
		// n = 11-합%11;
		// n = n%10;
		// n == 1 (정상)

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int i, tot, su;

		int[] chk = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };

		System.out.print("주민번호[xxxxxx-xxxxxxx]? ");
		str = br.readLine();

		if (str.length() != 14) {
			System.out.println("입력 오류!!");
			return; // stop
		}

		// index : 01234567890123
		// str :   941010-2167541
		// chk :   234567 892345

		tot = 0;
		for (i = 0; i < 12; i++) {

			if (i >= 6) // 주민번호 뒷자리
				tot += chk[i] * Integer.parseInt(str.substring(i + 1, i + 2));
			else // 주민번호 앞자리 생년월일
				tot += chk[i] * Integer.parseInt(str.substring(i, i + 1));
		}

		su = 11 - tot % 11;

		su = su % 10;

		if (su == Integer.parseInt(str.substring(13))) {
			System.out.println("정확한 주민번호!!");
		} else {
			System.out.println("안 정확한 주민번호!!");
		}

	}

}

// String s = "seoul korea";
// index       01234567890
/*
 * System.out.println(s.substring(0,3)); //seo
 * System.out.println(s.substring(6,8)); //ko
 * System.out.println(s.substring(6)); //korea
 */