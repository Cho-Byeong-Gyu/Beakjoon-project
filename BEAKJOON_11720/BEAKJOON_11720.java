package BEAKJOON_11720;

/*
 날짜 : 2024.07.16.화
 내용 : 백준 11720번 문제 (숫자의 합)
 */

import java.util.*;

public class BEAKJOON_11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = 0;										// 총합을 구하기 위한 변수선언
		int n = sc.nextInt();
		sc.nextLine();										// nextLine을 활용하여 \n 문자 제거하기
		
		
		String str = sc.nextLine();							// 하나의 긴 숫자를 문자열로 입력받기
		
		for (int i=0; i<n; i++) {							// 반복문을 순회하며 1자리마다 char형으로 변환후 다시 int형으로 변환하여 total 변수에 더하기
			total += (int)str.charAt(i) - 48;
		}
		
		System.out.println(total);							// 각 자리의 숫자들을 더한 총합 출력
	}

}
