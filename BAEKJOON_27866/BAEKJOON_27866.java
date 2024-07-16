package BAEKJOON_27866;

import java.util.*;
/*
 날짜 : 2024.07.14.일
 내용 : 백준 27866번
  */

public class BAEKJOON_27866 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();				// 문자열을 입력받아 변수 str에 저장
		
		char[] S = str.toCharArray();			// 입력받은 문자열을 char형 배열에 저장 
		
		int i = sc.nextInt();					// 출력해야하는 인덱스를 지정하는데 필요한 변수 i를 선언
				
		System.out.printf("%c", S[i-1]);
	}

}
