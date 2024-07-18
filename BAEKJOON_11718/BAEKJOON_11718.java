package BAEKJOON_11718;

/*
날짜: 2024.07.18.목
내용: 백준 11718번 (그대로 출력하기)
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BAEKJOON_11718 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		
		while((str=br.readLine())!=null) {					// BufferedReader를 활용해 개행줄에 입력한 값이 없을 때까지 한줄씩출력 + println으로 줄마다 개행
			System.out.println(str);
		}
		br.close();											// Reader 종료시켜주기
	}
}
