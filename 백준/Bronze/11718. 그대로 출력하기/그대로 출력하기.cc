#include <iostream>
#include <string>
using namespace std;

int main(void)
{
	string S;

	while (true) {
		getline(cin, S);
		if (S == "") break;
		cout << S << endl;
	}
}