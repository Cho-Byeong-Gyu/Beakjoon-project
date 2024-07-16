package BAEKJOON_2743;

/*
 날짜 : 2024.07.15.월
 내용 : 백준 2743번 문제 (문자 길이 재기)
 */

import java.util.*;

public class BAEKJOON_2743 {

	public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);
	 String str = sc.nextLine();						// 문자열 입력받기
	 int strLength = 0;									// 문자열 길이 카운팅할 변수 선언
	 
	 char[] strArray = str.toCharArray();				// 입력받은 문자열 char형 배열에 저장
	 
	 for (int i=0; i<strArray.length; i++) {
		 strLength ++;
	 }
	 
	 System.out.println(strLength);						// 문자열 길이 출력
	}
}
