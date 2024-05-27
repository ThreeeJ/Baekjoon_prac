#include <iostream>
using namespace std;

int main()
{
	int N, Ncnt = 0; // Ncnt : 그룹 단어가 아닌 갯수
	string word;

	cin >> N;
	for (int i = 0; i < N; i++) {
		cin >> word;
		bool alpha[26] = { false, };

		alpha[word[0] - 'a'] = true; // 첫 글자
		for (int j = 1; j < word.length(); j++) {
			if (word[j] == word[j - 1]) continue;
			else if (word[j] != word[j - 1] && alpha[word[j] - 'a'] == true) {
				Ncnt++;
				break;
			}
			else alpha[word[j] - 'a'] = true;
		}
	}

	cout << N - Ncnt << endl;
}