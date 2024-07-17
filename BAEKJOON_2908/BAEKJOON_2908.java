package BAEKJOON_2908;

/*
 날짜: 2024.07.17.수
 내용: 백준 2908번 (상수)
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BAEKJOON_2908 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		String str = br.readLine();
		
		if (str.equals("")) {								// 사용자가 문자열을 제대로 입력했는지 검증하기
			System.out.println("문자열을 입력하지 않으셨습니다.");				
			return;
		}
		
		String[] num = str.split(" ");									     	// BufferedReader를 활용하기 위해 Split()메서드를 써서 숫자2개를 문자열로 입력받기
	
		int A = Integer.parseInt(new StringBuilder(num[0]).reverse().toString());		// StringBuilder와 reverse속성을 활용해 문자열 상태에서 숫자를 뒤집기
		int B = Integer.parseInt(new StringBuilder(num[1]).reverse().toString());		// StringBuilder와 reverse속성을 활용해 문자열 상태에서 숫자를 뒤집기
		
		
		
		if( A >= B ){															// 거꾸로 뒤집힌 숫자의 대소 비교후 더 큰 수를 출력
			System.out.println(A);
		} else {
			System.out.println(B);
		}
		
		
		br.close();																// Reader 닫아주기
	}

}
