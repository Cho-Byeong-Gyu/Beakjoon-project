package BAEKJOON_2941;

/*
날짜: 2024.07.20.토요일
내용: 백준 2941번 (크로아티아 알파벳)
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BAEKJOON_2941 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		String str = br.readLine();													// 문자열 입력받기
  
        String[] Alphabet = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };	// indexOf와 replaceAll 메서드를 활용해 크로아티아 알파벳들을 하나의 문자열로 대체하여 전체문자열의 길이를 측정
		int n = 0;																	// 크로아티아 알파벳의 위치를 나타내는 변수 선언

		for (int i = 0; i < Alphabet.length; i++) {									// for문을 돌며 indexOf로 크로아티아 알파벳이 있다면 해당 index를 n에 저장, 없다면 반환되는 -1을 저장
            n = str.indexOf(Alphabet[i]);            
			if (n >= 0) {															// 크로아티아 알파벳이 존재할 때 해당 문자열 전체를 replaceAll을 통해 하나의 문자로 대체
				str = str.replace(Alphabet[i], "a");
			}
		}
		System.out.println(str.length());											// 문자열의 길이를 출력
		
		br.close();
	}

}
