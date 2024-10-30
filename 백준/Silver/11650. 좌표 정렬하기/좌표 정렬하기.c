#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

typedef struct xy {
	int x;
	int y;
}xy;

int compare(const xy* a, const xy* b) {
	if (a->x != b->x)
		return a->x - b->x;
	else
		return a->y - b->y;
}

int main()
{
	int N;
	int x, y;

	scanf("%d", &N);
	xy* p = (xy*)malloc(sizeof(xy) * N);
	for (int i = 0; i < N; i++) {
		scanf("%d %d", &x, &y);
		p[i].x = x;
		p[i].y = y;
	}

	qsort(p, N, sizeof(xy), compare);

	for (int i = 0; i < N; i++) {
		printf("%d %d\n", p[i].x, p[i].y);
	}
	
	return 0;
}