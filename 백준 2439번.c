/*
����: ���� 2439��
��¥: 2024.03.15.��
����: 

�Է�
ù° �ٿ� N(1 �� N �� 100)�� �־�����.

���
ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ����Ѵ�.

���� �Է� 1 
5
���� ��� 1 
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

    scanf("%d", &N);          // N �Է¹ޱ�

    for (int i = 1; i <= N; i++) {

        for (int j = N - i; j > 0; j--) {              // ����κ� ��� for��
            printf(" ");
        }

        for (int k = i; k > 0; k--) {                  // �Ƕ�̵� * ��� for��
            printf("*");
        }

        printf("\n");
    }

    return 0;
}