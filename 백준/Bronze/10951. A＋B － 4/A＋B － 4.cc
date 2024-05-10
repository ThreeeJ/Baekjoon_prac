#include <iostream>
using namespace std;

int main()
{
	int a, b;
	// 보통은 cin >> a >> b 를 읽은 후 스트림 객체가 반환
	// 조건문 안에 있는 경우 연산자 오버로딩에 의해 bool 값으로 true 혹은 false값을 반환한다. (스트림이 정상 상태면 true, 아닐 경우 false)

	// 결과적으로 cin을 통한 방식과 scanf 방식 모두 "읽은 뒤 EOF 체크"를 해야 한다는 점이 바로 포인트
	while (cin >> a >> b) {
		cout << a + b << endl;
	}
}