#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
	int N;
	cin >> N;

	int* p = new int[N]; // 동적할당

	for (int i = 0; i < N; i++) {
		cin >> p[i];
	}

	int Max = *max_element(p, p + N); // 최대값 구하는 함수
	int Min = *min_element(p, p + N); // 최솟값 구하는 함수
	/*
	max_element(start, end)를 이용하면[start, end) 범위 중에 가장 큰 값의 iterator를 반환한다.
	*max_element(start, end)를 이용하면[start, end) 범위 중에 가장 큰 값의 value를 반환한다.
	min_element(start, end)를 이용하면[start, end) 범위 중에 가장 작은 값의 iterator를 반환한다.
	*min_element(start, end)를 이용하면[start, end) 범위 중에 가장 작은 값의 value를 반환한다.
	*/

	cout << Max * Min << endl;

	delete[]p; // 동적할당 해제
}