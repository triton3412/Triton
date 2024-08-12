import java.io.*;

public class test {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = 1000000000;
        bw.write(n + "\n");
        bw.flush();
    }
}