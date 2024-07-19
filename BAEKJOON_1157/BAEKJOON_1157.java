package BAEKJOON_1157;
/*
 날짜: 2024.07.19.금
 내용: 백준 1157번 문제 (단어 공부)
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BAEKJOON_1157 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		String str = br.readLine();
		int[] arr = new int[26];				// 문자마다 갯수 카운틸항 길이26짜리 배열선언
		int maxCount = 0;						// 가장 많은 카운팅 횟수 저장
		int tempCount =0;						// 카운팅 수가 같을 때 그 카운팅 횔수 저장할 변수
		char maxChar = 'a';						// 가장 많이 중복된 문자저장
		
		for(int i=0; i<26; i++) {				// 배열의 각자리 카운팅 0으로 초기화
			arr[i] = 0;
			System.out.printf("arr"+i+": %d개 ", arr[i]);	
		}
		System.out.println();
		
		for(int i=0; i<str.length(); i++) {		// 배열의 각자리에 해당 문자 중복 카운팅
			char ch = Character.toUpperCase(str.charAt(i));
				arr[ch - 'A'] += 1;
		}
		
		System.out.println("카운팅 테스트");
		for(int i=0; i<26; i++) {				// 배열의 각자리 카운팅 제대로 됐는지 테스트
			System.out.printf("arr"+i+": %d개 ", arr[i]);	
		}
		System.out.println();
		
		for(int i=0; i<26; i++) {				// 중복횟수 가장많은 문자 선별하는 for문
			if( arr[i] > maxCount) {			// maxCount보다 클경우 해당 문자 maxChar로 저장
				maxCount = arr[i];
				maxChar = (char)(i+ 'A');
			}else if( arr[i] == maxCount) {		// 카운팅 수가 같은적이 있다면 가장 최근에 중복된 카운팅 횟수 저장
				tempCount = maxCount;
			}
		}
		System.out.println("maxCount: " +maxCount);
		System.out.println("tempCount: " +tempCount);
		
		if(maxCount > tempCount) {				// 단독으로 카운팅 젤 많은 문자 출력
			System.out.println(maxChar);
		}else if(maxCount == tempCount) {		// 중복된 카운팅이 있을 경우 ? 문자 출력
			System.out.println("?");
		}
		
	}

}
