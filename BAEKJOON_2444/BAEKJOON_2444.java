package BAEKJOON_2444;

/*
 날짜: 2024.07.18.목
 내용: 백준 2444번 문제 (별 찍기7)
 */

import java.util.*;

public class BAEKJOON_2444 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();							// 한라인에 별의 최대 갯수 입력받기
		
		
		for (int i=1; i<=n; i++) {						// 윗부분	(공백은 점점감소 별은 홀수단위로 증가)
			for (int j= n-i; j > 0; j--) {
			    System.out.print(" ");
			}
			
		    for (int j=1; j<=(2*i-1); j++) {			// 별을 홀수(2n-1)개씩 증가 -> 1,3,5,7,9,...
                System.out.print("*");
            }
			System.out.println();
		}
		


		for (int i=n-1; i>=1; i--) {					 // 아랫부분 (공백은 점점증가 별은 홀수단위로 감소) + n-1부터 감소하기 시작 (최대라인 한줄임)
            for (int j=1; j<=n-i; j++) {				 
                System.out.print(" ");
            }

            for (int j=1; j<=(2*i-1); j++) {			 // 별을 홀수(2n-1)개씩 감소 -> 7,5,3,1,...
                System.out.print("*");
            }
            System.out.println();
        }
		
	}

}
