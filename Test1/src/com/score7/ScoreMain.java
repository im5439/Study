package com.score7;

import java.util.Scanner;

import com.db.DBConn;

public class ScoreMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Score ob = new Score();
		
		int ch;
		
		try {
			
			while(true) {
				
				do {
					System.out.println("1.입력  2.수정  3.삭제  4.전체출력  5.학번검색  6.종료");
					System.out.print("> ");
					ch = sc.nextInt();
				} while(ch < 1 || ch > 6);
				
				switch(ch) {
				
				case 1 :
					ob.insert();
					break;
				case 2 :
					ob.update();
					break;
				case 3 :
					ob.delete();
					break;
				case 4 :
					ob.selectAll();
					break;
				case 5 :
					ob.searchHak();
					break;
				case 6 :
					DBConn.close();
					System.out.println("종료");
					System.exit(0);

				}
				
				
				
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	

}
