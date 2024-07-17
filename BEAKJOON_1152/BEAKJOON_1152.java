package BEAKJOON_1152;

/*
날짜 : 2024.07.17.수
내용 : 백준 1152번 ( 단어의 개수) 
 */
import java.io.*;

public class BEAKJOON_1152 {

	public static void main(String[] args) throws Exception {
		// BufferredReader를 사용하기 위해 읽어들일 파일이 없거나 읽을 수 없는 경우에 대해 IOException을 throws로 예외처리

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		// (System.in)에서 키보드를 통해byteSteam 형태로 입력받은 값을 InputStreamReader를 활용해 문자스트림형태로 변환시켜주고 BufferedReader를 통해 한꺼번에 데이터를 처리하여 데이터처리성능을 올림
		String str = br.readLine().trim();					// 문자열 입력받기 + 양끝에 있는 스페이스바떄문에 생기는 오차는 trim을 활용해 잡아줌
		
		
		if (str.equals("")) {								// 사용자가 문자열을 제대로 입력했는지 검증하기
			System.out.println(0);					
			return;
		}
			  
		int count = str.split(" ").length;					// split()을 활용하여 공백으로 문자열을 나눠 새로운 배열로 저장될 때 해당 배열의 길이로 쪼개진 단어의 수를 측정
		
		
		System.out.println(count);							// 몇개의 단어로 이루어진건지 출력
		br.close();
	}
}
