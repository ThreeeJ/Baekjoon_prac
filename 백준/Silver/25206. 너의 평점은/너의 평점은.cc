#include <iostream>
using namespace std;

typedef struct Major {
	string subject; // 과목명
	double credit; // 학점
	string grade; // 점수
} Major;

int main()
{
	Major M[20];
	double totalCredit = 0;
	double totalGrade = 0;
	for (int i = 0; i < 20; i++) {
		cin >> M[i].subject >> M[i].credit >> M[i].grade;
		totalCredit += M[i].credit;

		if (M[i].grade == "A+") totalGrade += 4.5 * M[i].credit;
		else if (M[i].grade == "A0") totalGrade += 4.0 * M[i].credit;
		else if (M[i].grade == "B+") totalGrade += 3.5 * M[i].credit;
		else if (M[i].grade == "B0") totalGrade += 3.0 * M[i].credit;
		else if (M[i].grade == "C+") totalGrade += 2.5 * M[i].credit;
		else if (M[i].grade == "C0") totalGrade += 2.0 * M[i].credit;
		else if (M[i].grade == "D+") totalGrade += 1.5 * M[i].credit;
		else if (M[i].grade == "D0") totalGrade += 1.0 * M[i].credit;
		else if (M[i].grade == "F") totalGrade += 0.0 * M[i].credit;
		else if (M[i].grade == "P") totalCredit -= M[i].credit;
	}

	cout << totalGrade / totalCredit << endl;
}