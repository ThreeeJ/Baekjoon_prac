#include <iostream>
#include <string>
using namespace std;

int main(void)
{
	int T;
	cin >> T;
	for (int i = 0; i < T; i++) {
		int len;
		string S;
		cin >> S;
		len = S.length();
		cout << S[0] << S[len - 1] << endl;
	}
}