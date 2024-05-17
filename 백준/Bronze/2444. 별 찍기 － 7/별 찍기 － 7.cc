#include <iostream>
using namespace std;

int main()
{
	int N;
	cin >> N;

	for (int i = 0; i <= (2 * N - 1) / 2; i++) {
		for (int j = 0; j < N + i; j++) {
			if (j >= N - 1 - i && j <= N - 1 + i) {
				cout << "*";
			}
			else cout << " ";
		}
		cout << "\n";
	}
	for (int i = (2 * N - 1) / 2 - 1; i >= 0; i--) {
		for (int j = 0; j < N + i; j++) {
			if (j >= N - 1 - i && j <= N - 1 + i) {
				cout << "*";
			}
			else cout << " ";
		}
		cout << "\n";
	}
}