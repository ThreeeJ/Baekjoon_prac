#include <iostream>
using namespace std;

int main()
{
	int A, B, C;
	cin >> A >> B >> C;

	if (A == B && A == C) cout << 10000 + A * 1000 << endl;
	else if (A == B) cout << 1000 + A * 100 << endl;
	else if (A == C) cout << 1000 + A * 100 << endl;
	else if (B == C) cout << 1000 + B * 100 << endl;
	else {
		if (A > B) {
			if (A > C) cout << A * 100 << endl; // A가 가장 클 때
			else cout << C * 100 << endl; // C가 가장 클 때
		}
		else {
			if (B > C) cout << B * 100 << endl; // B가 가장 클 때
			else cout << C * 100 << endl; // C가 가장 클 때
		}
	}
}