package BAEKJOON_1546;

import java.util.*;

/*
날짜 : 2024.07.13.토
내용 : 백준 10811번 문제
 */


public class BAEKJOON_1546 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		
		
		int n = sc.nextInt(); 					// 점수를 입력받을 시험과목수를 지정할 변수n 세팅
		
		double[] arr = new double[n+1]; 		// 시험 본 과목의 수만큼의 크기를 같는 배열선언
		double maxNum = 0;						// 과목들중 점수가 가장 높은 점수 저장할 변수 maxNum 선언
		double newGrade = 0;					// 새롭게 산출한 점수 저장한 변수 선언
		double newGradeTotal = 0;				// 새롭게 산출한 점수의 총점을 선언
		
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt(); 				// num 이라는 변수로 시험점수를 입력받기
		}
		
		for(int i = 0; i<n; i++) {
		   if(arr[i] >= maxNum) {
			   maxNum = arr[i];					// 새로 입력한 값이 더 클때 최댓값으로 변경, 처음에 인덱스 0과1 비교
		   }
		}
	
		for (int i=0; i<n; i++) {				// 각 과목의 점수를 새롭게 산출
			arr[i] = arr[i]/maxNum*100;
			newGradeTotal += arr[i];
		}
		
        System.out.println(newGradeTotal/n);
	}
}