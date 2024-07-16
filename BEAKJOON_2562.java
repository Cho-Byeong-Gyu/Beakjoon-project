/*
 제목: 백준 2562번 
 날짜: 2024.03.28.목
 내용: 
 문제
9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.

예를 들어, 서로 다른 9개의 자연수

3, 29, 38, 12, 57, 74, 40, 85, 61

이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.

입력
첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.

출력
첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.

예제 입력 1 
3
29
38
12
57
74
40
85
61
예제 출력 1 
85
8
 */

package BEAKJOON__2562;

import java.util.Scanner;

public class BEAKJOON_2562 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);    // 스캐너 클래스의 객체 생성
		
		int[] arr = new int[9];		//	자연수9개 입력받을 배열 선언
		int max=0;					// 최댓값을 저장할 변수 선언
		int max_idx =1; 				// 최잿값 순서저장할 변 수 선언
		
		
		for(int i=0; i<arr.length; i++) {		// 반복문을 활용하여 배열에 9개의 자연수 입력받기
			arr[i] = sc.nextInt();
		}
		
		for (int j=1; j<arr.length; j++) {		// for문으로 배열 훑으며 최댓값과 위치 찾아내기
			if(max<arr[j]) {
				max = arr[j]; 
				max_idx = j+1;
			}
		}
		
		System.out.println(max);
		System.out.println(max_idx);
			
	}

}
