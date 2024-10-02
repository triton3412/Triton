import java.io.*;

public class baekjoon1072 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String [] inp = br.readLine().split(" ");
        long total = Long.parseLong(inp[0]);
        long win = Long.parseLong(inp[1]);
        int Z = (int) ((double)win*100/total);
        long left = 0;
        long right = (long) 1e9;
        long answer = -1;
        while (left <= right) {
            long mid = (left + right) / 2;
            long newRate = (long) ((double)(win + mid) * 100 / (total + mid));
            if (newRate != Z) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        bw.write(answer + "\n");


        bw.flush();
    }
}
