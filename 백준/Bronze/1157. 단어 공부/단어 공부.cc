#include <iostream>
#include <string>
using namespace std;

int main()
{
	int alpha[26] = { 0 };
	string S;
	cin >> S;

	for (int i = 0; i < S.length(); i++) {
		if (S[i] >= 'a' && S[i] <= 'z') { // 소문자 -> 대문자 변환
			alpha[S[i] - 32 - 'A']++;
		}
		else alpha[S[i] - 'A']++;
	}

	int big = alpha[0];
	int bigIndex = 0;
	bool same = false; // 같은 것이 없다.
	for (int i = 1; i < 26; i++) {
		if (alpha[i] == 0) continue; // 하나도 나오지 않은 알파벳들 건너뛰기

		if (big == alpha[i]) same = true; // 같은 것이 있다.
		else if (big < alpha[i]) {
			big = alpha[i];
			bigIndex = i;
			same = false;
		}
	}

	if (same) cout << "?\n";
	else cout << (char)(bigIndex + 'A') << endl;
}