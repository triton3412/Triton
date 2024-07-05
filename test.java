import java.io.*;
import java.util.Arrays;

public class test {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) {
        try {
            int size = Integer.parseInt(br.readLine());
            long[] n = new long[size];
            //String[] str = br.readLine().split(" ");
            for (int i = 0; i < size; i++) {
                n[i] = i;
            }
            Arrays.sort(n);

            long total = 0;

            int count = size / 4;

            for (int i = 0; i < count; i++) {
                total += 2L * (n[size - (i + 1)] - n[i]);
            }
            bw.write(total + "\n");
            bw.flush();
        } catch (IOException e){
            System.out.println("ERROR DETECTED");
        }
    }
}
