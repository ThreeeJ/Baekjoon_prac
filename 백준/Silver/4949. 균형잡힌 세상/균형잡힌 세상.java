import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String s = br.readLine();

            if (s.equals(".")) { break; }

            Stack<Character> stack = new Stack<Character>();
            boolean isBalance = true;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '.') { break; }

                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.empty()) {
                        bw.write("no\n");
                        isBalance = false;
                        break;
                    }

                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        bw.write("no\n");
                        isBalance = false;
                        break;
                    }
                } else if (c == ']') {
                    if (stack.empty()) {
                        bw.write("no\n");
                        isBalance = false;
                        break;
                    }

                    if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        bw.write("no\n");
                        isBalance = false;
                        break;
                    }
                }
            }

            if (isBalance && stack.isEmpty()) {
                bw.write("yes\n");
            } else if (isBalance && !stack.isEmpty()) {
                bw.write("no\n");
            }
        }

        br.close();
        bw.close();
    }
}