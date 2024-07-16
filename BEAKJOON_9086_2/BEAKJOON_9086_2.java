package BEAKJOON_9086_2;

/*
 날짜 : 2024.07.15.월
 내용 : 백준 9086번 문제 (문자열)
 */
import java.util.*;

public class BEAKJOON_9086_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();												// 문자열을 몇번 입력받을지 세팅하는 변수 선언
		int strLength = 0;													// 문자열의 길이를 저장할 변수 선언
		String[] stringArray = new String[n]; 
		char[] strArray	= new char[n];
		sc.nextLine();														// \n 개행문자 제거

		for (int i=0; i<n; i++) {											// string배열에 입력받은 str들을 담아두기
			String str = sc.nextLine();										// n번 만큼 문자열을 입력받기
			stringArray[i] = str;											
		}
		
		for(int i=0; i<n; i++) {											// stringArray에서 저장해도 str들을 하나씩 불러와 각각 처음과 끝의 문자열 출력
			
			strArray = stringArray[i].toCharArray();						// 입력받은 문자열을 cahr형 배열로 형변환
		
			for(int j=0; j < strArray.length; j++) {						// 문자열의 마지막 문자의 인덱스를 알아내기위해 for문을 활용하여 배열의 길이 구하기
				strLength++;
			}
			
			if (strArray.length > 0) { 
				System.out.printf("%c%c",strArray[0], strArray[strLength-1]);	// 길이가7이면 strArray[6]이 제일 마지막이므로 strArray[strLength-1]로 마지막 문자 출력
				System.out.println();
			} 
			strLength = 0;													// 문자열 구하는 카운팅 다시 0으로 초기화
		}
	
	}
}