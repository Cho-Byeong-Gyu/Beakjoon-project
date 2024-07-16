/*
제목: 백준 10807번
날짜: 2024.03.18
내용: 정수 n개를 입력받고 그 n 개의 정수들중에 3번쨰 줄에 입력하는 정수가 몇개 있는지 알려주는 프로그램만들기

입력
첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다. 셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.

출력
첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.

예제 입력 1
11
1 4 1 2 4 2 4 2 3 4 4
2
예제 출력 1
3

예제 입력 2
11
1 4 1 2 4 2 4 2 3 4 4
5
예제 출력 2
0

*/

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {

	int n;
	int Inum;
	int count = 0;

	scanf("%d \n", &n);

	int Narr[100];

	for (int i = 0; i < n; i++) {				// n개의 정수를 배열에 입력받기
		scanf("%d ", &Narr[i]);
	}	
	

	scanf("%d", &Inum);							// 찾고싶은 숫자 입력받기

	for (int k = 0; k < n; k++) {
		if (Inum == Narr[k]) {					// 입력받은 정수와 같은 수 카운팅
			count++;
		}
	}

	printf("%d", count);						// 입력한 숫자가 몇개 있는지 출력
	
	return 0;
}


