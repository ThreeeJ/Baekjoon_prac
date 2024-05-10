#include <iostream>
using namespace std;

int main()
{
	int integer[100];
	int N, v, count = 0;

	cin >> N;
	for (int i = 0; i < N; i++) {
		cin >> integer[i];
	}

	cin >> v;
	for (int i = 0; i < N; i++) {
		if (v == integer[i]) count++;
	}

	cout << count << endl;
}