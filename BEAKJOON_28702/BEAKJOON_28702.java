package BEAKJOON_28702;

import java.util.*;

public class BEAKJOON_28702 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[3];						// 문자열 3개는 필수로 받아야 함
		int order = 1;										// 숫자만 입력받는 문자열의 위치를 나타낼 변수를 선언
		int OutputNum = 0;									// 출력할 문자열의 원래 숫자를 저장할 변수를 선언
		
		
		for(int i=0; i<3; i++) {							// 연속된 문자열 3개를 입력받을 때 항상 Fizz와 숫자가 하나씩 있어야함 -> 숫자가 반드시 1개또는 2개 있어야하는 걸 이용
			arr[i] = sc.nextLine();
//			System.out.println(arr[i]);						--> test
		
		if(arr[i].matches("^[0-9]+$")) {				// 입력받은 문자열중에 숫자를 입력받은 배열의 인덱스를 order에 저장
			order = i+1;
			
//				System.out.println(order);					--> test
			if( order == 1) {
				OutputNum = Integer.parseInt(arr[0]) +3;	// 출력해야하는 숫자의 원래 수는  order가 1이라면 arr[0]+3임
			} else if (order == 2) {
				OutputNum = Integer.parseInt(arr[1]) +2;	// 출력해야하는 숫자의 원래 수는  order가 1이라면 arr[0]+2임
			} else if (order == 3) {
				OutputNum = Integer.parseInt(arr[2]) +1;	// 출력해야하는 숫자의 원래 수는  order가 1이라면 arr[0]+1임
			}
			
//				System.out.println(OutputNum);				--> test
			}
		}
		if(OutputNum %3 == 0 && OutputNum % 5 == 0) {				// 3과 5의 공배수이면 다음에 오는 문자열로 FizzBuzz 출력
			System.out.println("FizzBuzz");
		} else if ( OutputNum %3 == 0 && OutputNum %5 != 0) {		// 3의 배수이면서 5의 배수가아니면 다음에 오는 문자열로 Fizz 출력
			System.out.println("Fizz");					
		} else if (OutputNum %5 ==0 && OutputNum %3 != 0) {			// 5의 배수이면서 3의 배수가아니면 다음에 오는 문자열로 Buzz 출력
			System.out.println("Buzz");
		} else {													// 3의배수도 아니고 5의 배수도 아니면 다음에 오는 문자열로 OutputNum 출력
			System.out.println(OutputNum);
		}
	}
}

