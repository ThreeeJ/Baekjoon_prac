#include <iostream>
using namespace std;

int main()
{
	bool play = true; // 맞게 연주하면 true, 틀리게 연주하면 false
	int Cmajor[8];
	for (int i = 0; i < 8; i++) {
		cin >> Cmajor[i];
	}

	if (Cmajor[0] == 1) {
		for (int i = 1; i < 8; i++) {
			if (Cmajor[i] == i + 1) continue;
			else {
				play = false;
				break;
			}
		}

		if (play) cout << "ascending" << endl;
		else cout << "mixed" << endl;
	}
	else if (Cmajor[0] == 8) {
		for (int i = 1; i < 8; i++) {
			if (Cmajor[i] == 8 - i) continue;
			else {
				play = false;
				break;
			}
		}

		if (play) cout << "descending" << endl;
		else cout << "mixed" << endl;
	}
	else // 처음부터 틀릴 경우 
		cout << "mixed" << endl;
}