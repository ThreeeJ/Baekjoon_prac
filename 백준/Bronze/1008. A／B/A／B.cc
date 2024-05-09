#include <iostream>
using namespace std;

int main()
{
	double A, B;
	cin >> A >> B;

	cout << fixed; // 소수점 아래로 고정
	cout.precision(12); // 실수를 12자리로 나타내기(정수 포함)
	// 두가지를 같이 쓰면 소수점 아래 12자리를 나타낸다.

	cout << A / B;
}