import java.util.Scanner;

public class Main {
	public static void main(String[] args ) {
		Scanner s = new Scanner(System.in); // scanner 객체 열기
		
		long A, B, C;
		A = s.nextLong();
		B = s.nextLong();
		C = s.nextLong();
		
		System.out.println(A + B + C);
		
		s.close(); // scanner 객체 닫기
	}
}