#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

#define MAX_NAME 100
typedef struct namelist {
	char name[MAX_NAME];
} namelist;

int compare(const namelist* a, const namelist* b) {
	return strcmp(a->name, b->name);
}

int main()
{
	int N, M;
	char name[MAX_NAME];
	scanf("%d %d", &N, &M);

	namelist* list = (namelist*)malloc(sizeof(namelist) * (N + M));
	namelist* hearseenot = (namelist*)malloc(sizeof(namelist) * (N > M ? N : M));
	int size = 0;

	for (int i = 0; i < N + M; i++) {
		scanf("%s", name);
		strcpy(list[i].name, name);
	}
	qsort(list, N + M, sizeof(namelist), compare);

	for (int i = 1; i < N + M; i++) {
		if (strcmp(list[i - 1].name, list[i].name) == 0) {
			strcpy(hearseenot[size++].name, list[i].name);
			i++;
		}
	}

	printf("%d\n", size);
	for (int i = 0; i < size; i++) {
		printf("%s\n", hearseenot[i].name);
	}

	return 0;
}