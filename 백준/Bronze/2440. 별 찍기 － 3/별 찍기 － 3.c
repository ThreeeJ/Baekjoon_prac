#include <stdio.h>
int main(void)
{
	int x;
	scanf("%d", &x);
	for (int i = x; i > 0; i--) {
		for (int k = 1; k <= i; k++) {
			printf("*");
		}
		printf("\n");
	}
	return 0;
}