/*
제목: 백준 10813번 문제
날짜: 2024.04.17.수
내용: 
 입력
첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.

둘째 줄부터 M개의 줄에 걸쳐서 공을 교환할 방법이 주어진다. 각 방법은 두 정수 i j로 이루어져 있으며, i번 바구니와 j번 바구니에 들어있는 공을 교환한다는 뜻이다. (1 ≤ i ≤ j ≤ N)

도현이는 입력으로 주어진 순서대로 공을 교환한다.

출력
1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다.

예제 입력 1 
5 4
1 2
3 4
1 4
2 2
예제 출력 1 
3 1 4 2 5
 */

package BAEKJOON_10813;

import java.util.*;

public class BAEKJOON_10813 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;					// 바구니 갯수 세팅 
		int m;					// 자리를 바꾸는 횟수 세팅
		int Fnum = 0;			// 자리를 바꿀 숫자 입력받는 변수1
		int Lnum = 0;			// 자리를 바꿀 숫자 입력받는 변수2
		
		n = sc.nextInt();
		m = sc.nextInt();
			
		int[] arr = new int[n+1];	

		for(int k =0; k < n+1; k++) {			// 번호대로 값 세팅
			arr[k] = k;
		}
		
		for (int i=0; i<m; i++) {				// 배열 인덱스 0 공간을 활용해서 자리 바꾸기
			
			Fnum = sc.nextInt();
			Lnum = sc.nextInt();
			
			arr[0] = arr[Fnum];
			arr[Fnum] = arr[Lnum];
			arr[Lnum] = arr[0];
		}
		
		for(int j=1; j<n+1; j++) {				// 배열 출력
			System.out.printf("%d ", arr[j]);
		}
	}
}
