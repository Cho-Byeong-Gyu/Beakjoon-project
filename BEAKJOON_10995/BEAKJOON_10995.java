package BEAKJOON_10995;

/*
 날짜 : 2024.07.14.일
 내용 : 백준 10995번 문제
 */

import java.util.*;

public class BEAKJOON_10995 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();						// n 입력받기
		
		for(int i=0; i<n; i++) {
			if( i%2 == 0) {							// 짝수인 경우
				for(int j=0; j<n; j++) {
					System.out.printf("* ");
				}

			} else if( i%2 != 0) {					// 홀수인 경우
				for(int j=0; j<n; j++) {
					System.out.printf(" *");
				}
			}
			System.out.println();
		}
		
	}

}
