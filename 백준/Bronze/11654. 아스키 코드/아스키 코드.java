import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char ch = s.next().charAt(0); // 자바에서 char 받기
        System.out.println((int)ch);

        s.close();
    }
}