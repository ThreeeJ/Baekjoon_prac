#include <iostream>
#include <string>
using namespace std;

int main(void)
{
	int N, sum = 0;
	string num;
	cin >> N >> num;

	for (int i = 0; i < N; i++) {
		sum += num[i] - '0'; // (- '0') 으로 char -> int로 변환
	}
	cout << sum << endl;
}