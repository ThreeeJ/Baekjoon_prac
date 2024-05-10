#include <iostream>
using namespace std;

int main(void)
{
	int basket[100] = { 0 };
	int N, M, i, j, k;

	cin >> N >> M;
	for (int a = 0; a < M; a++) {
		cin >> i >> j >> k;
		for (int b = i; b <= j; b++) {
			basket[b - 1] = k;
		}
	}

	for (int a = 0; a < N; a++) cout << basket[a] << " ";
}