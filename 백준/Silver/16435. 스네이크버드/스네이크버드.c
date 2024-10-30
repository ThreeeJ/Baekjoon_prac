#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

int main()
{
	int N, L;
	scanf("%d %d", &N, &L);

	int* p = (int*)malloc(sizeof(int) * N);

	int a;
	for (int i = 0; i < N; i++) {
		scanf("%d", &a);
		p[i] = a;
	}

	for (int i = N; i >= 0; i--) { // 버블정렬
		for (int j = 1; j < i; j++) {
			if (p[j - 1] > p[j]) {
				int tmp = p[j - 1];
				p[j - 1] = p[j];
				p[j] = tmp;
			}
		}
	}

	for (int i = 0; i < N; i++) {
		if (L >= p[i]) L++;
	}
	printf("%d\n", L);
	
	return 0;
}