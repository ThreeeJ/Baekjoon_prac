import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        boolean student[] = new boolean[30];
        for(int i=0; i<28; i++) {
            int num = s.nextInt();
            student[num-1] = true;
        }
        for (int i=0; i<30; i++) {
            if(!student[i]) {
                System.out.println(i+1);
            }
        }

        s.close();
    }
}