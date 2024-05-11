#include <iostream>
using namespace std;

int main(void)
{
	double grade[1000] = { 0 };
	int N;
	cin >> N;
	for (int i = 0; i < N; i++) { // 현재 성적 기입
		cin >> grade[i];
	}

	double M = grade[0];
	for (int i = 1; i < N; i++) { // 현재 성적 중 가장 높은 성적찾기
		if (M < grade[i]) M = grade[i];
	}

	for (int i = 0; i < N; i++) { // 가장 높은 성적을 토대로 점수 고치기
		grade[i] = grade[i] / M * 100;
	}

	double sum = 0;
	for (int i = 0; i < N; i++) { // 총점 구하기
		sum += grade[i];
	}

	cout << sum / N << endl;
}