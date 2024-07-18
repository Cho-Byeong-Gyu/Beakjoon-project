package BAEKJOON_5622;

/*
날짜 : 2024.07.18.목
내용 : 백준 5622번 (다이얼) 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BAEKJOON_5622 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		String str = br.readLine();										// 문자열 입력받기
		int result = 0;													// 최소 시간 결과 값
		
		if(str.equals("")) {											// 사용자 입력 검증
			System.out.println("문자열을 입력하지 않으셨습니다.");
			return;
		}
		
		for(int i=0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch == 'A' || ch == 'B' || ch == 'C') {
				result += 3;
			}else if(ch == 'D' || ch == 'E' || ch == 'F') {
				result += 4;
			}else if(ch == 'G' || ch == 'H' || ch == 'I') {
				result += 5;
			}else if(ch == 'J' || ch == 'K' || ch == 'L') {
				result += 6;
			}else if(ch == 'M' || ch == 'N' || ch == 'O') {
				result += 7;
			}else if(ch == 'P' || ch == 'Q' || ch == 'R' || ch == 'S') {
				result += 8;
			}else if(ch == 'T' || ch == 'U' || ch == 'V') {
				result += 9;
			}else if(ch == 'W' || ch == 'X' || ch == 'Y' || ch == 'Z') {
				result += 10;
			}else {
				result += 11;
			}
		}
		System.out.println(result);
		
		
		
		br.close();											// Reader 종료시켜주기
	}

}
