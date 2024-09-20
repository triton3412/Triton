import java.io.*;
import java.util.Arrays;

public class baekjoon1026 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args)throws IOException {
        int size = Integer.parseInt(br.readLine());
        int [] A = new int[size];
        int [] B = new int[size];
        String [] inp = br.readLine().split(" ");
        for(int i = 0; i < inp.length; i++){
            A[i] = Integer.parseInt(inp[i]);
        }
        inp = br.readLine().split(" ");
        for(int i = 0; i < inp.length; i++){
            B[i] = Integer.parseInt(inp[i]);
        }
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0; i < size/2; i++){
            int temp = B[i];
            B[i] = B[size - 1 - i];
            B[size - 1 - i] = temp;
        }
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum += A[i]*B[i];
        }
        bw.write(sum+"\n");
        bw.flush();
    }
}
