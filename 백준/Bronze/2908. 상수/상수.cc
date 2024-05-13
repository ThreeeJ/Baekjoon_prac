#include <iostream>
#include <string>
using namespace std;

int main(void)
{
	string A, B, rMax;
	cin >> A >> B;

	for (int i = 2; i >= 0; i--) {
		if (A[i] == B[i]) continue;
		else if (A[i] > B[i]) { rMax = A; break; }
		else { rMax = B; break; }
	}
	for (int i = 2; i >= 0; i--) {
		cout << rMax[i];
	}
	cout << "\n";
}