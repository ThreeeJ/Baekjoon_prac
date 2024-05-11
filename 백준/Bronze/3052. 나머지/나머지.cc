#include <iostream>
using namespace std;

int main(void)
{
	int count = 0;
	int rest[42] = { 0 };
	for (int i = 0; i < 10; i++) {
		int n;
		cin >> n;
		rest[n % 42]++;
	}
	for (int i = 0; i < 42; i++) {
		if (rest[i] != 0) count++;
	}
	cout << count << endl;
}