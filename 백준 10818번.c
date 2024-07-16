/*
제목: 백준10818번
날짜: 2024.03.23.토
내용: 

문제
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

출력
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.

예제 입력 1 
5
20 10 35 30 7
예제 출력 1 
7 35
*/

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

int main(void) {

	int N = 0;
	int min = 0;
	int max = 0;

	scanf("%d \n", &N);					// N 입력받기

	int arr[10] = { 0, };			// arr라는 이름의 길이 1,000,000짜리 배열 선언


	for (int i = 0; i < N; i++) {
		scanf("%d ", &N);
	}
	
	min = arr[0];
	for (int i = 0; i < N; i++) {

		if (min > arr[i + 1]) {			// 최소값 판별하는 조건문
			min = arr[i + 1];
		}
		else if (min <= arr[i + 1]) {
		}
	}

	max = arr[0];
	for (int j = 0; j < N; j++) {

		if (max > arr[j + 1]) {			// 최댓값 판별하는 조건문
			max = arr[j];
		}
		else if (max <= arr[j + 1]) {
			max = arr[j];
		}
	}


	printf("%d %d", min, max);
}
