import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str;
        str = s.next();
        System.out.println(str.length());

        s.close();
    }
}