#include <iostream>
#include <string>
using namespace std;

int main()
{
	string S;
	cin >> S;

	int count = 0;
	for (int i = 0; i < S.length(); i++) {
		switch (S[i]) {
		case 'c':
			if (S[i + 1] == '=') {
				count++;
				i += 1;
			}
			else if (S[i + 1] == '-') {
				count++;
				i += 1;
			}
			else count++;
			break;
		case 'd':
			if (S[i + 1] == 'z' && S[i + 2] == '=') {
				count++;
				i += 2;
			}
			else if (S[i + 1] == '-') {
				count++;
				i += 1;
			}
			else count++;
			break;
		case 'l': case 'n':
			if (S[i + 1] == 'j') {
				count++;
				i += 1;
			}
			else count++;
			break;
		case 's': case 'z':
			if (S[i + 1] == '=') {
				count++;
				i += 1;
			}
			else count++;
			break;
		default:
			count++;
		}
	}
	
	cout << count << endl;
}