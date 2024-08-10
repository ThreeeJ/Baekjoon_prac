import java.util.Scanner;

public class Main {
	public static void main(String[] args ) {
		Scanner s = new Scanner(System.in); // scanner 객체 열기
		
		int A, B;
		A = s.nextInt();
		B = s.nextInt();
		
		if (A == B) System.out.println("==");
		else if (A > B) System.out.println(">");
		else System.out.println("<");
		
		s.close(); // scanner 객체 닫기
	}
}