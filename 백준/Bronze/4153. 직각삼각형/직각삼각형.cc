#include <iostream>
using namespace std;

int main()
{
	int x, y, z;
	while (true) {
		cin >> x >> y >> z;
		if (x == 0 && y == 0 && z == 0) break;
		else {
			if (x > y) {
				if (x > z) {
					if (x * x == y * y + z * z) cout << "right" << endl;
					else cout << "wrong" << endl;
				}
				else {
					if (z * z == x * x + y * y) cout << "right" << endl;
					else cout << "wrong" << endl;
				}
			}
			else {
				if (y > z) {
					if (y * y == x * x + z * z) cout << "right" << endl;
					else cout << "wrong" << endl;
				}
				else {
					if (z * z == x * x + y * y) cout << "right" << endl;
					else cout << "wrong" << endl;
				}
			}
		}
	}
}