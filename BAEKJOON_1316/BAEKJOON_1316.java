package BAEKJOON_1316;
/*
 날짜: 2024.07.21.일
 내용: 백준 1316번 (그룹 단어 체커)
 */

import java.util.*;

public class BAEKJOON_1316 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();							// 그룹 단어 체크할 문자열의 갯수 입력받는 변수
		sc.nextLine();									// \n 제거	
		int GroupCount = 0;									// 그룹 단어 개수 체크할 변수
		
		for(int i=0; i<n; i++) {
			String str = sc.nextLine();					// 그룹 단어 체크할 문자열 입력받기
//			System.out.println();					
//			System.out.println("i: "+ i);					
			int nonGroupCount = 0;							// 그룹 문자열이 아닌걸 체크할 때 사용되는 변수
			
			for(int j=0; j<str.length(); j++) {			// 반복문을 활용하여 문자열을 순회하며 그룹 단어인지 체킹후 카운팅
				char ch = str.charAt(j);
//				System.out.println(j+"번째 ch: "+ch);					
				
				int chLocation = str.indexOf(ch, j+1);
//				System.out.println(j+"번째 chLocation: "+chLocation);					
				if(chLocation == -1) {					// indexOf의 반환값이 -1이면 해당문자가 없다는 것이므로 해당 문자는 그룹단어 성립
					continue;
				}else if(chLocation > -1) {				// indexOf의 반환값이 -1이 아니라 다른 값이라면 다른 값이 존재한다는 것이므로 연속된 것인지 아닌지 판단
					if(chLocation - j == 1) {			// 원래 위치에서 chLoaction을 뺸 값이 1이라면 연속되어 같은 문자가 나온 것이므로 그룹 단어 성립
						continue;
					}else if (chLocation - j > 1) {		// 원래 위치에서 chLocation을 뺵 값이 1보다 크다면 연속되지 않게 같은 문자가 또 있는 것이기에 그룹단어에 성립되지 않음
						nonGroupCount++;
						break;
					}
				}
			}
			if(nonGroupCount > 0 ) {					// break문으로 빠져나올 때 그룹단어가 아니라고 카운팅 되었다면 그룹단어 수를 카운팅하지 않음
				continue;
			}else if(nonGroupCount == 0) {				// nonGroupCount이 카운팅 되지 않았다면 그룹 단어로 카운팅
				GroupCount++;
			}
		}
		System.out.println(GroupCount);					// 그룹 단어 개수 출력
	}
}
