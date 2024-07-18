package BAEKJOON_3003;

/*
 날짜: 2024.07.18.목
 내용: 백준 3003번 문제 (킹,퀸,룩,비숍,나이트,폰)
 */
import java.util.*;

public class BAEKJOON_3003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int[] arr = {1, 1, 2, 2 , 2, 8};				// 초기 피스 갯수들을 배열에 세팅
		
		for(int i=0; i<arr.length; i++) {						// 배열을 순회하며 각각 현재 피스 개수를 입력받아 초기 개수에서 빼고 다시 저장
			int n = sc.nextInt();
			arr[i] = arr[i] - n; 
		}
		
		for(int i=0; i<arr.length; i++) {				// 최종적으로 더 필요하거나 추가해야하는 피스 개수 출력
			System.out.printf("%d ", arr[i]);
		}
	}

}
