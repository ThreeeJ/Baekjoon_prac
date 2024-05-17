#include <iostream>
#include <string>
using namespace std;

int main()
{
	string S;
	cin >> S;
	
	int len = S.length();

	for (int i = 0; i < len / 2; i++) {
		if (S[i] != S[len - 1 - i]) {
			cout << 0;
			return 0;
		}
	}

	cout << 1;
}