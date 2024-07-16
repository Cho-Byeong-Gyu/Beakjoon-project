/*
제목: 백준 2439번
날짜: 2024.03.15.금
내용: 

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

예제 입력 1 
5
예제 출력 1 
    *
   **
  ***
 ****
*****

*/

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

int main() {

    int N = 0;               

    scanf("%d", &N);          // N 입력받기

    for (int i = 1; i <= N; i++) {

        for (int j = N - i; j > 0; j--) {              // 공백부분 출력 for문
            printf(" ");
        }

        for (int k = i; k > 0; k--) {                  // 피라미드 * 출력 for문
            printf("*");
        }

        printf("\n");
    }

    return 0;
}