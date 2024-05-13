#include <iostream>
#include <string>
using namespace std;

int main(void)
{
	int num = 1;
	string S;
	getline(cin, S);

	for (int i = 0; i < S.length(); i++) {
		if (S.length() == 1 && S[0] == ' ') { // 공백 하나 일 때
			num = 0;
			break;
		}

		if ((i == 0 && S[i] == ' ') || (i == S.length() - 1 && S[i] == ' '))
			continue; // 첫 글자와 마지막 글자가 공백일 때
		else if (S[i] == ' ') num++; // 그 외 공백 처리 
	}

	cout << num << endl;
}