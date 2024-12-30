import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a, b, c;

        while (true) {
            a = s.nextInt();
            b = s.nextInt();
            c = s.nextInt();

            if (a == 0 && b == 0 && c == 0) break;

            if (a > b) {
                if (a > c) { // a가 가장 클 때
                    if (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) {
                        System.out.println("right");
                    } else {
                        System.out.println("wrong");
                    }
                } else { // c가 가장 클 때
                    if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                        System.out.println("right");
                    } else {
                        System.out.println("wrong");
                    }
                }
            } else {
                if (b > c) { // b가 가장 클 때
                    if (Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) {
                        System.out.println("right");
                    } else {
                        System.out.println("wrong");
                    }
                } else { // c가 가장 클 때
                    if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                        System.out.println("right");
                    } else {
                        System.out.println("wrong");
                    }
                }
            }
        }

        s.close();
    }
}