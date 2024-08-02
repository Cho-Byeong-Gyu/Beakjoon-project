package BAEKJOON_25206;

/*
날짜: 2024.08.02.금
내용: 백준 25206번 문제 (너의 평점은 - 실5)
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BAEKJOON_25206 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double sum = 0;												// 학점의 총점을 저장할 변수
		double majorSum = 0;										// 전공학점의 총점을 저장할 변수
		double majorRating = 0;
		
		for(int i=0; i < 20; i++) {
			String str = br.readLine();								// 20과목들을 for 반복문을 통해 순회하며 전공학점의 총점과 학점의 총점을 구하기
			String[] arr = str.split(" ");
			double grade = 0;										// 등급에 따른 환산 학점 저장할 변수
			
			if(arr[2].charAt(0) == 'A' ) {							// 등급을 환솬점수로 환산, P면 해당 입력줄 스킵
				grade = 4;
			}else if(arr[2].charAt(0) == 'B') {
				grade = 3;
			}else if(arr[2].charAt(0) == 'C') {
				grade = 2;
			}else if(arr[2].charAt(0) == 'D') {
				grade = 1;
			}else if(arr[2].charAt(0) == 'F') {
				grade = 0;
			}else if(arr[2].charAt(0) == 'P') {
				grade = 0;
			}
			if(arr[2].length() > 1 && arr[2].charAt(1) == '+') {	// A+, B+, C+, D+는 0.5씩 학점추가
			    grade += 0.5;
			}
	
			if (sum != 0) {											// 전공평점의 총점 구하기 + 0으로 나누며 생기는 NAN관련 예외처리
				majorRating = majorSum / sum;
			} else {
				majorRating = 0;
			}
			
			majorSum += (Double.parseDouble(arr[1]) * grade); 		// 전공 학점의 총점 계산
			sum += (Double.parseDouble(arr[1]));					// 전공 학점의 총점 구하기
			
//			System.out.println((i+1)+"번째 Sum: "+sum);
//			System.out.println((i+1)+"번째 majorSum: "+(Double.parseDouble(arr[1]))+" * "+grade+" = "+majorSum);
//			System.out.println((i+1)+"번째 majorRating: "+(majorSum)+"/"+sum+"="+majorRating);
		}
		
		System.out.println("전공평점: " + majorRating);
		
		br.close();
	}

}
