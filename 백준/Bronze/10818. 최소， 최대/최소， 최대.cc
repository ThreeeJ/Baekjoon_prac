#include <iostream>
using namespace std;

int main(void)
{
	int integer;
	int N, min = 1000000, max = -1000000;

	cin >> N;
	for (int i = 0; i < N; i++) {
		cin >> integer;
		if (min > integer) min = integer;
		if (max < integer) max = integer;
	}

	cout << min << " " << max << endl;
}