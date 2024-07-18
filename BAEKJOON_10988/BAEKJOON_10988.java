package BAEKJOON_10988;
/*
 날짜: 2024.07.18.목
 내용: 백준 10988번 문제 (팰린드롬인지 확인하기)
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BAEKJOON_10988 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();									// 처음 입력받은 문자열을 저장할 변수선언
		StringBuilder sb = new StringBuilder(str);
		
		if(str.equals(sb.reverse().toString())) {					// Stringbuilder 객체를 String 타입으로 변환후, 원래 문자열과 뒤집은 문자열이 그대로 같은지 비교
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		
			
		br.close();													// Reader 종료해주기
	}
}
