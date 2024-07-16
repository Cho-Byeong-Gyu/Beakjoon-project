package BAEKJOON_10809_2;

/*
 날짜 : 2024.07.17.수
 내용 : 백준 10809번 문제 ( 알파벳 찾기 )
 */

import java.util.*;

public class BAEKJOON_10809_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26]; 
		String str = sc.nextLine();
		
		for(int i=0; i<26; i++) {						// 모든 알파벳에 -1을 대응시켜두기
			arr[i] = -1;								
		}

			
												
		for(int i=0; i<str.length(); i++) {				// 입력받은 문자열을 charAt과 반복문을 활용하여 순회하며 일치하는 알파벳이 있을 경우 해당위치의 인덱스를 해당 자리의 value로 건네주기
			if(arr[str.charAt(i)-'a'] == -1)			// 소문자의 알바펫들만 입력받으며 1씩 간격으로 문자열들을 순회하는 것을 아스키 코드를 활용해 비교하기
				arr[str.charAt(i)-'a'] = i;				// i가 2이면 str.charAt(i)는 baekjoon중에 'e'이고, e-a의 아스키코드값은 4, arr[4] == 2
		}
			
		for(int i=0; i<26; i++) {						// 모든 배열안의 값 출력해주기
			System.out.printf("%d ", arr[i]);
		}
	}
}
