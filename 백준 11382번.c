/*
제목: 백준 11382번 문제 (브론즈)
날짜: 2024.02.25.일
내용: 

꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!

입력
첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 10^12)이 공백을 사이에 두고 주어진다.

출력
A+B+C의 값을 출력한다.

예제 입력 1 
77 77 7777
예제 출력 1 
7931
*/

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {

	long long num1, num2, num3;				// 10의 12승까지의 범위를 조건문으로 구현할려했는데 넘 복잡함 - 자료형을 long long으로 바꿔주면 해결됨

	scanf("%lld %lld %lld", &num1, &num2, &num3);

	printf("%lld", num1 + num2 + num3);				

	return 0;

}




// 코드가 문제가 아니라 부수적인 말첨가해서 컴파일 결과값에 77 77 7777 말고 다른게 들어가서 실패라고 뜬거였음





/*
int main() {				// 참고한 다른사람코드	

  long long a, b, c;
    
    scanf("%lld %lld %lld", &a, &b, &c);
    
    printf("%lld", a + b + c);

    return 0;
}
*/
