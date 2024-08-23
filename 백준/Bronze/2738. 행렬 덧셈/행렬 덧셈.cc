#include <iostream>
#include <cstdlib>
using namespace std;

int main()
{
	int N, M;
	cin >> N >> M;

	int** A = new int* [N];
	for (int i = 0; i < N; i++)
		A[i] = new int[M];

	int** B = new int* [N];
	for (int i = 0; i < N; i++)
		B[i] = new int[M];

	int** total = new int* [N];
	for (int i = 0; i < N; i++)
		total[i] = new int[M];

	for (int i = 0; i < N; i++) {
		for (int j = 0; j < M; j++) {
			cin >> A[i][j];
		}
	}
	for (int i = 0; i < N; i++) {
		for (int j = 0; j < M; j++) {
			cin >> B[i][j];
		}
	}
	for (int i = 0; i < N; i++) {
		for (int j = 0; j < M; j++) {
			total[i][j] = A[i][j] + B[i][j];
		}
	}

	for (int i = 0; i < N; i++) {
		for (int j = 0; j < M; j++) {
			cout << total[i][j] << " ";
		}
		cout << endl;
	}

	for (int i = 0; i < N; i++)
		delete[] A[i];
	delete[]A;

	for (int i = 0; i < N; i++)
		delete[] B[i];
	delete[]B;

	for (int i = 0; i < N; i++)
		delete[] total[i];
	delete[]total;
}