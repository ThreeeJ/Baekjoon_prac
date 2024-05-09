#include <iostream>
using namespace std;

int main()
{
	int h, m, plus;
	cin >> h >> m >> plus;

	if (m + plus < 60) cout << h << " " << m + plus << endl;
	else cout << (h + ((m + plus) / 60)) % 24 << " " << (m + plus) % 60 << endl;
}