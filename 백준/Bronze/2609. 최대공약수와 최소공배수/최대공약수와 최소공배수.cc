#include <iostream>
using namespace std;

int main()
{
	int x, y;
	cin >> x >> y;

	int gcd = 1; // 최대공약수
	int lcm = 1; // 최소공배수

	int i = 2;
	while (true) {
		if (i > x || i > y) {
			lcm *= x;
			lcm *= y;
			break;
		}
		else {
			if (x % i == 0 && y % i == 0) {
				gcd *= i;
				lcm *= i;
				x = x / i;
				y = y / i;
				i = 2;
				continue;
			}
		}
		i++;
	}

	cout << gcd << endl << lcm << endl;
}