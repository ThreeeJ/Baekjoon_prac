import java.util.Scanner;

public class Main {
	public static void main(String[] args ) {
		Scanner s = new Scanner(System.in); // scanner 객체 열기
		
		int A, B;
		A = s.nextInt();
		B = s.nextInt();
		
		System.out.println(A - B);
		
		s.close(); // scanner 객체 닫기
	}
}