package BAEKJOON_10811;

import java.util.*;

/*
날짜 : 2024.07.13.토
내용 : 백준 10811번 문제
 */


public class BAEKJOON_10811 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();						// 바구니의 갯수를 입력받을 변수 n 선언
		int m = sc.nextInt();						// 바구니의 순서를 바꿀 횟수를 입력받는 변수 m 선언
		
		int[] arr = new int[n+1];					// m의 범위가 1부터 n까지니까 n+1 크기의 바구니 역할인 배열 선언
		
		for(int i = 0; i <= n; i++ ) {				// 바구니안에 value로 index값 주기
			arr[i] = i;
		}
		
		for( int k = 1;  k <= m; k++ ) {			// m번만큼 i와j입력받기
			int i = sc.nextInt();					// i 입력받기
			int j = sc.nextInt();					// j 입력받기
			
			while (j-i >= 0) {						// 양쪽의 범위가 서로 만나거나 넘어서 교차될떄 까지 양끝 숫자들의 위치를 바꿔 역순으로 바꾸기
				int temp = arr[i];					// i번쟤 값 자리바꾸기 위해 임시로 저장
				arr[i] = arr[j];					// i번째 값에 j번쨰 값 넣기
				arr[j] = temp;						// j번째에 k값(원래 i값) 넣어 i번쨰값과 j번째 값 서로 바꾸기
				i++;								
				j--;								// i는 1씩 키우고 j는 1씩 작아지게해서 반복하기
			}
		}
		
		for (int i = 1; i<=n; i++) {				// 배열 arr의 1부터 n까지 바구니 안의 값(value) 출력하기 
			System.out.printf("%d ", arr[i]);				
		}
		

	}

}
