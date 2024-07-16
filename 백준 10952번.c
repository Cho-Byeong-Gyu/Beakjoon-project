/*
제목: 백준 10952번
날짜; 2024.03.15.금
내용: 

문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
입력은 여러 개의 테스트 케이스로 이루어져 있다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

입력의 마지막에는 0 두 개가 들어온다.

출력
각 테스트 케이스마다 A+B를 출력한다.

예제 입력 1 
1 1
2 3
3 4
9 8
5 2
0 0
예제 출력 1 
2
5
7
17
7
*/

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

int main() {

	int num1, num2;
	int Last = 0;
	int add;


	do{

		scanf("%d %d", &num1, & num2);				// 숫자 2개 입력받기
		
		add = num1 + num2;

		if (num1 == 0 && num2 == 0) {				// 0 0 입력받았을 때의 탈출문
			Last = 100;
		}
		else {
			printf("%d \n", add);
		}

	} while (Last != 100);

	return 0;
}