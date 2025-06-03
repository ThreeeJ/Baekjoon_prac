import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = 0;
        boolean intFind = false;

        for (int i=0; i<3; i++) {
            String str = br.readLine();

            char ch = str.charAt(0);
            if (ch != 'F' && ch != 'B') {
                x = Integer.parseInt(str);
                intFind = true;
            }

            if (intFind) {
                x++;
            }

        }

        if (x % 3 == 0 && x % 5 == 0) {
            bw.write("FizzBuzz");
        } else if (x % 3 == 0) {
            bw.write("Fizz");
        } else if (x % 5 == 0) {
            bw.write("Buzz");
        } else {
            bw.write(String.valueOf(x));
        }

        bw.flush();

        bw.flush();
        bw.close();
    }
}