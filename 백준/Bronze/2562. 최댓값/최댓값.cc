#include <iostream>
using namespace std;

int main(void)
{
	int n = 9;
	int integer, max = 0, max_index = 0;
	for (int i = 1; i <= n; i++) {
		cin >> integer;
		if (max < integer) {
			max = integer;
			max_index = i;
		}
	}
	cout << max << endl << max_index << endl;
}