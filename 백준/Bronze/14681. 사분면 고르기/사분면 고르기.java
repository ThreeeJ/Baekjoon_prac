import java.util.Scanner;

public class Main {
	public static void main(String[] args ) {
		Scanner s = new Scanner(System.in); // scanner 객체 열기
		
		int X, Y;
		X = s.nextInt();
		Y = s.nextInt();
		
		if (X > 0 && Y > 0) System.out.println("1");
		else if (X < 0 && Y > 0) System.out.println("2");
		else if (X < 0 && Y < 0) System.out.println("3");
		else System.out.println("4");
		
		s.close(); // scanner 객체 닫기
	}
}