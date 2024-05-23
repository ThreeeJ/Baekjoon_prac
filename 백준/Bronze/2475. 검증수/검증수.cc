#include <iostream>
using namespace std;

int main()
{
	int KOI[5];
	int sum = 0;
	for (int i = 0; i < 5; i++) {
		cin >> KOI[i];
	}

	for (int i = 0; i < 5; i++) {
		sum += KOI[i] * KOI[i];
	}
	
	cout << sum % 10 << endl;
}