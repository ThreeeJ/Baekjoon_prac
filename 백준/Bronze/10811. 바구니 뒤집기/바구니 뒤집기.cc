#include <iostream>
using namespace std;

int main(void)
{
	int basket[100] = { 0 };
	int N, M, i, j;

	cin >> N >> M;
	for (int a = 0; a < N; a++) {
		basket[a] = a + 1;
	}
	for (int a = 0; a < M; a++) {
		cin >> i >> j;
		for (int b = 0; b < (j - i + 1) / 2; b++) {
			int temp;
			temp = basket[i - 1 + b];
			basket[i - 1 + b] = basket[j - 1 - b];
			basket[j - 1 - b] = temp;
		}
	}

	for (int a = 0; a < N; a++) cout << basket[a] << " ";
}