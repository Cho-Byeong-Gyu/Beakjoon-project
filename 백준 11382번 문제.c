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

	int num1, num2, num3;
	int result;


	printf("더하고 싶은 정수를 3개 입력해주세요: ");
	scanf("%d %d %d", &num1, &num2, &num3);
	printf("\n");

	if(1 <= num1 && num1 <= 1000000000000) {
	}
	else {
		while (1) {
			printf("1~10의 12승까지의 수들중 다시 입력해주세요: ");
			scanf("%d %d %d", &num1, &num2, &num3);
			printf("\n");

			if (1 <= num1 && num1 <= 1000000000000) {
				break;
			}
			if (1 <= num2 && num2 <= 1000000000000) {
				break;
			}

			if (1 <= num3 && num3 <= 1000000000000) {
				break;
			}
		}
	}
	if (1 <= num2 && num2 <= 1000000000000) {
	}
	else {
		while (1) {
			printf("1~10의 12승까지의 수들중 다시 입력해주세요: ");
			scanf("%d %d %d", &num1, &num2, &num3);
			printf("\n");

			if (1 <= num1 && num1 <= 1000000000000) {
				break;
			}
			if (1 <= num2 && num2 <= 1000000000000) {
				break;
			}

			if (1 <= num3 && num3 <= 1000000000000) {
				break;
			}
		}
	}
	if (1 <= num3 && num3 <= 1000000000000) {
	}
	else {
		while (1) {
			printf("1~10의 12승까지의 수들중 다시 입력해주세요: ");
			scanf("%d %d %d", &num1, &num2, &num3);
			printf("\n");


			if (1 <= num1 && num1 <= 1000000000000) {
				break;
			}
			if (1 <= num2 && num2 <= 1000000000000) {
				break;
			}

			if (1 <= num3 && num3 <= 1000000000000) {
				break;
			}

		}
	}

	result = num1 + num2 + num3;

	printf("세 정수의 총합: %d \n", result);

	return 0;

}