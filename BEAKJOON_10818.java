
/*
 제목: 백준 10818번
 날짜: 2024.03.25
 내용: 
 문제
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

출력
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.

예제 입력 1 
5
20 10 35 30 7
예제 출력 1 
7 35
 */
package BEAKJOON_10818;

import java.util.*;

public class BEAKJOON_10818 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		// sc 라는 이름의 스캐너 객체 생성
		
		int n = sc.nextInt();						// 입력받은 값을 N이라는 변수에 저장
		
		int[] arr = new int[n];

		
		for(int j=0; j<arr.length; j++) {
			arr[j] = sc.nextInt();						// 입력받은 값을 N이라는 변수에 저장
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}else if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.printf("%d %d", min, max);
	}
}
