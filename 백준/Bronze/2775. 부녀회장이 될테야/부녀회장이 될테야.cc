#include <iostream>
using namespace std;

int sum(int k, int n) {
	if (n == 1) {
		return 1;
	}
	else if (k == 0) {
		return n;
	}
	else {
		return sum(k - 1, n) + sum(k, n - 1);
	}
}

int main() {
    int T, k, n;
    int num = 0;
    cin >> T;
    for (int i = 0; i < T; i++) {
        cin >> k >> n;
        num = sum(k, n);
        cout << num << endl;
    }
}