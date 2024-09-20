import java.io.*;
import java.util.Arrays;

public class baekjoon11399 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String [] inp = br.readLine().split(" ");
        int [] input = new int [n];
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(inp[i]);
        }
        Arrays.sort(input);

        int sum = 0;
        for(int i = 0; i < input.length; i++) {
            sum += (i+1) * input[n-i-1];
        }

        bw.write(sum + "\n");
        bw.flush();
    }
}
