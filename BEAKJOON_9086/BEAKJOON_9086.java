package BEAKJOON_9086;

/*
 날짜 : 2024.07.15.월
 내용 : 백준 9086번 문제 (문자열)
 */
import java.util.*;

public class BEAKJOON_9086 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();													// 문자열을 몇번 입력받을지 세팅하는 변수 선언
		String[] stringArray = new String[n]; 
		sc.nextLine();															// \n 개행문자 제거

		for (int i=0; i<n; i++) {												// string배열에 입력받은 str들을 담아두기
			String str = sc.nextLine();											// n번 만큼 문자열을 입력받기
			stringArray[i] = str;											
		}
		
		for(int i=0; i<n; i++) {												//string형 배열을 순회하며 charAt을 활용하여 처음과 끝 문자열만 출력	
			int strLength = 0;													// 문자열의 길이를 저장할 변수 선언
			strLength = stringArray[i].length();
			
			System.out.printf("%c%c \n",stringArray[i].charAt(0), stringArray[i].charAt(strLength-1));	
		}
	
	}
}
