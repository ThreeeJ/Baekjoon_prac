#include <iostream>
#include <string>
using namespace std;

int main(void)
{
	int alpha[26] = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
	string S;
	cin >> S;
	for (int i = 0; i < S.length(); i++) {
		if (alpha[S[i] - 'a'] != -1) continue;
		else alpha[S[i] - 'a'] = i;
	}
	for (int i = 0; i < 26; i++) {
		cout << alpha[i] << " ";
	}
}