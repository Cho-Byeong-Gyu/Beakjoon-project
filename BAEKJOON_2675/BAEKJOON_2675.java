package BAEKJOON_2675;

/*
 날짜 : 2024.07.17.수
 내용 : 백준 2675번 (문자열 반복)
 */

import java.util.*;

public class BAEKJOON_2675 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();										// 전체 입력받을 횟수 정하는 변수 n 선언
		String[] arr = new String[n];								// 최종 출력형태를 맞추기 위해 최종 결과값 잠시담아둘 Stirng배열 arr 선언
		
		for(int i=0; i<n; i++) {
			String result = "";										// 최종 출력 결과값 담아둘 result 변수 선언
			int m = sc.nextInt();									// 각각의 문자열을 몇번 반복할 것인지 정하는 변수 m 선언
			
			String str = sc.nextLine().trim(); 							// 반복시킬 문자열 입력받기
			
			for (int h=0; h< str.length(); h++) {
				for(int k=0; k < m; k++) {							// Stirng 배열에 최종결과값 담워뒀다가 한꺼번에 출력하기 (출력형태 맞춰주기 위해서)
					result += str.charAt(h);		
				}
			}
			arr[i] = result;
		}
		for (int i=0; i<n; i++) {									// 최종 결과값들 출력
			System.out.println(arr[i]);
		}

	}

}
