package BEAKJOON_10809;

/*
 날짜 : 2024.07.16.화
 내용 : 백준 10809번 문제 ( 알파벳 찾기 )
 */

import java.util.*;

public class BEAKJOON_10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26]; 
		String str = sc.nextLine();
		
		for(int i=0; i<26; i++) {				// 모든 알파벳에 -1을 대응시켜두기
			arr[i] = -1;								
		}

		for(int i=0; i<str.length(); i++) {		// 입력받은 문자열을 charAt과 반복문을 활용하여 순회하며 일치하는 알파벳이 있을 경우 해당위치의 인덱스를 해당 자리의 value로 건네주기
			
			if (str.charAt(i) == 'a') {			// i번째 자리의 문자열이 a였다면 arr[0]번째에 i(해당 문자의 위치)값을 대입
				if(arr[0] == -1)				// beakjoon에서 o과 같이 중복될때 위치가 앞에있는5가 아닌 6으로 출력되는걸 방지하는 예외처리 
					arr[0] = i;	
			} else if (str.charAt(i) == 'b') {
				if(arr[1] == -1) 				// beakjoon에서 o과 같이 중복될때 위치가 앞에있는5가 아닌 6으로 출력되는걸 방지하는 예외처리 
					arr[1] =i;	
			} else if (str.charAt(i) == 'c') {
				if(arr[2] == -1) 				// beakjoon에서 o과 같이 중복될때 위치가 앞에있는5가 아닌 6으로 출력되는걸 방지하는 예외처리 
					arr[2] =i;
			} else if (str.charAt(i) == 'd') {
				if(arr[3] == -1) 				// beakjoon에서 o과 같이 중복될때 위치가 앞에있는5가 아닌 6으로 출력되는걸 방지하는 예외처리 
					arr[3] =i;
			} else if (str.charAt(i) == 'e') {
				if(arr[4] == -1) 				// beakjoon에서 o과 같이 중복될때 위치가 앞에있는5가 아닌 6으로 출력되는걸 방지하는 예외처리 
					arr[4] =i;
			} else if (str.charAt(i) == 'f') {
				if(arr[5] == -1) 				// beakjoon에서 o과 같이 중복될때 위치가 앞에있는5가 아닌 6으로 출력되는걸 방지하는 예외처리 
					arr[5] =i;
			} else if (str.charAt(i) == 'g') {
				if(arr[6] == -1) 				// beakjoon에서 o과 같이 중복될때 위치가 앞에있는5가 아닌 6으로 출력되는걸 방지하는 예외처리 
					arr[6] =i;
			} else if (str.charAt(i) == 'h') {
				if(arr[7] == -1) 				// beakjoon에서 o과 같이 중복될때 위치가 앞에있는5가 아닌 6으로 출력되는걸 방지하는 예외처리 
					arr[7] =i;
			} else if (str.charAt(i) == 'i') {
				if(arr[8] == -1) 				// beakjoon에서 o과 같이 중복될때 위치가 앞에있는5가 아닌 6으로 출력되는걸 방지하는 예외처리 
					arr[8] =i;
			} else if (str.charAt(i) == 'j') {
				if(arr[9] == -1) 				// beakjoon에서 o과 같이 중복될때 위치가 앞에있는5가 아닌 6으로 출력되는걸 방지하는 예외처리 
					arr[9] =i;
			} else if (str.charAt(i) == 'k') {
				if(arr[10] == -1) 				// beakjoon에서 o과 같이 중복될때 위치가 앞에있는5가 아닌 6으로 출력되는걸 방지하는 예외처리 
					arr[10] =i;
			} else if (str.charAt(i) == 'l') {
				if(arr[11] == -1) 				// beakjoon에서 o과 같이 중복될때 위치가 앞에있는5가 아닌 6으로 출력되는걸 방지하는 예외처리 
					arr[11] =i;
			} else if (str.charAt(i) == 'm') {
				if(arr[12] == -1) 				// beakjoon에서 o과 같이 중복될때 위치가 앞에있는5가 아닌 6으로 출력되는걸 방지하는 예외처리 
					arr[12] =i;
			} else if (str.charAt(i) == 'n') {
				if(arr[13] == -1) 				// beakjoon에서 o과 같이 중복될때 위치가 앞에있는5가 아닌 6으로 출력되는걸 방지하는 예외처리 
					arr[13] =i;
			} else if (str.charAt(i) == 'o') {
				if(arr[14] == -1) 				// beakjoon에서 o과 같이 중복될때 위치가 앞에있는5가 아닌 6으로 출력되는걸 방지하는 예외처리 
					arr[14] =i;
			} else if (str.charAt(i) == 'p') {
				if(arr[15] == -1) 				// beakjoon에서 o과 같이 중복될때 위치가 앞에있는5가 아닌 6으로 출력되는걸 방지하는 예외처리 
					arr[15] =i;
			} else if (str.charAt(i) == 'q') {
				if(arr[16] == -1) 				// beakjoon에서 o과 같이 중복될때 위치가 앞에있는5가 아닌 6으로 출력되는걸 방지하는 예외처리 
					arr[16] =i;
			} else if (str.charAt(i) == 'r') {
				if(arr[17] == -1) 				// beakjoon에서 o과 같이 중복될때 위치가 앞에있는5가 아닌 6으로 출력되는걸 방지하는 예외처리 
					arr[17] =i;
			} else if (str.charAt(i) == 's') {
				if(arr[18] == -1) 				// beakjoon에서 o과 같이 중복될때 위치가 앞에있는5가 아닌 6으로 출력되는걸 방지하는 예외처리 
					arr[18] =i;
			} else if (str.charAt(i) == 't') {
				if(arr[19] == -1) 				// beakjoon에서 o과 같이 중복될때 위치가 앞에있는5가 아닌 6으로 출력되는걸 방지하는 예외처리 
					arr[19] =i;
			} else if (str.charAt(i) == 'u') {	
				if(arr[20] == -1) 				// beakjoon에서 o과 같이 중복될때 위치가 앞에있는5가 아닌 6으로 출력되는걸 방지하는 예외처리 
					arr[20] =i;	
			} else if (str.charAt(i) == 'v') {
				if(arr[21] == -1) 				// beakjoon에서 o과 같이 중복될때 위치가 앞에있는5가 아닌 6으로 출력되는걸 방지하는 예외처리 
					arr[21] =i;
			} else if (str.charAt(i) == 'w') {
				if(arr[22] == -1) 				// beakjoon에서 o과 같이 중복될때 위치가 앞에있는5가 아닌 6으로 출력되는걸 방지하는 예외처리 
					arr[22] =i;
			} else if (str.charAt(i) == 'x') {
				if(arr[23] == -1) 				// beakjoon에서 o과 같이 중복될때 위치가 앞에있는5가 아닌 6으로 출력되는걸 방지하는 예외처리 
					arr[23] =i;
			} else if (str.charAt(i) == 'y') {
				if(arr[24] == -1) 				// beakjoon에서 o과 같이 중복될때 위치가 앞에있는5가 아닌 6으로 출력되는걸 방지하는 예외처리 
					arr[24] =i;
			} else if (str.charAt(i) == 'z') {
				if(arr[25] == -1) 				// beakjoon에서 o과 같이 중복될때 위치가 앞에있는5가 아닌 6으로 출력되는걸 방지하는 예외처리 
					arr[25] =i;
			}
		}
		
		for(int i=0; i<26; i++) {				// 모든 배열안의 값 출력해주기
			System.out.printf("%d ", arr[i]);
		}
	}
}
