import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        bw.write(".  .   .\n");
        bw.write("|  | _ | _. _ ._ _  _\n");
        bw.write("|/\\|(/.|(_.(_)[ | )(/.");
        
        bw.flush();
        
        br.close();
        bw.close();
    }
}