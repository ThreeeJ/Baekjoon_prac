#include <iostream>
using namespace std;

int main()
{
	int integer[10000];
	int N, X;

	cin >> N >> X;
	for (int i = 0; i < N; i++) {
		cin >> integer[i];
	}

	for (int i = 0; i < N; i++) {
		if (X > integer[i]) cout << integer[i] << " ";
	}
}