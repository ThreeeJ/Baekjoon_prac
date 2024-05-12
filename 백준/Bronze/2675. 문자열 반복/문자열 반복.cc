#include <iostream>
#include <string>
using namespace std;

int main(void)
{
	int T, R;
	string S;
	cin >> T;

	while (T--) {
		cin >> R >> S;

		for (int i = 0; i < S.length(); i++) {
			for (int j = 0; j < R; j++) {
				cout << S[i];
			}
		}
		cout << "\n";
	}
}