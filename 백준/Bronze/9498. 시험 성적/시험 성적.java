import java.util.Scanner;

public class Main {
	public static void main(String[] args ) {
		Scanner s = new Scanner(System.in); // scanner 객체 열기
		
		int A; // 점수
		A = s.nextInt();
		
		if (A >= 90) System.out.println("A");
		else if (A >= 80) System.out.println("B");
		else if (A >= 70) System.out.println("C");
		else if (A >= 60) System.out.println("D");
		else System.out.println("F");
		
		s.close(); // scanner 객체 닫기
	}
}