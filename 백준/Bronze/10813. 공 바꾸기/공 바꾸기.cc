#include <iostream>
using namespace std;

int main(void)
{
	int basket[100] = { 0 };
	int N, M, i, j;

	cin >> N >> M;
	for (int a = 1; a <= N; a++) { // 초기화
		basket[a - 1] = a;
	}

	for (int a = 0; a < M; a++) {
		cin >> i >> j;
		int temp;
		temp = basket[i - 1];
		basket[i - 1] = basket[j - 1];
		basket[j - 1] = temp;
	}

	for (int a = 0; a < N; a++) cout << basket[a] << " ";
}