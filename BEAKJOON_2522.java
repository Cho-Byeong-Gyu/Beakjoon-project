package BEAKJOON_2522;

/*
 날짜: 2024.07.14.일
 내용: 백준 2522번 문제
 */

import java.util.*;

public class BEAKJOON_2522 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();				// 최대 별의 갯수를 입력받기

		for (int i=1; i<=n; i++) {			// 윗부분
			int starCount = i;
			while(starCount > 0) {
				System.out.printf("*");
				starCount--;
			}
			System.out.printf("\n");
		}

		for (int i=1; i<=n; i++) {			// 아랫부분
			int starCount = n-i;
			while(starCount > 0) {
				System.out.printf("*");
				starCount--;
			}
			System.out.printf("\n");
		}
	}
}