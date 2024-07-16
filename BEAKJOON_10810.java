/*
 입력
첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.

둘째 줄부터 M개의 줄에 걸쳐서 공을 넣는 방법이 주어진다. 각 방법은 세 정수 i j k로 이루어져 있으며, i번 바구니부터 j번 바구니까지에 k번 번호가 적혀져 있는 공을 넣는다는 뜻이다. 예를 들어, 2 5 6은 2번 바구니부터 5번 바구니까지에 6번 공을 넣는다는 뜻이다. (1 ≤ i ≤ j ≤ N, 1 ≤ k ≤ N)

도현이는 입력으로 주어진 순서대로 공을 넣는다.

출력
1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다. 공이 들어있지 않은 바구니는 0을 출력한다.

예제 입력 1 
5 4
1 2 3
3 4 4
1 4 1
2 2 2
예제 출력 1 
1 2 1 1 0
 */

package BEAKJOON_10810;

import java.util.*;

public class BEAKJOON_10810 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();			// n 입력받기 - 바구니 갯수
		int m = sc.nextInt();			// m 입력받기 - 넣는 공을 입력받는 횟수
		int rage_s = 0;
		int rage_e = 0;
		int num = 0;
		
		int[] arr = new int[n+1]; 		// 크기가 n인 배열 선언
		
		for( int i=1; i<=m; i++) {		// 바구니에 넣을 때에 쓰이는 범위와 값 입력받기
			rage_s = sc.nextInt();
			rage_e = sc.nextInt();
			num = sc.nextInt();
			
			while(rage_s <= rage_e) {   // 범위에 따라 바구니에 값 넣어주는 반복문
				arr[rage_s] = num;
				rage_s ++;
			}
		}
		
		for(int j=1; j<=n; j++ ) {
			System.out.printf("%d ", arr[j]);
		}
	}
}
