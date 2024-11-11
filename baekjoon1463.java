import java.io.*;
import java.util.Arrays;

public class baekjoon1463 {
    static int [] memory = new int [1000001];
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        Arrays.fill(memory, -1);
        memory[0] = 0;
        memory[1] = 0;
        memory[10] = 3;
        int n = Integer.parseInt(br.readLine());
        for(int i = 2; i <= n; i++){
            memory[i] = memory[i-1] + 1;
            if(i%3 == 0){
                memory[i] = Math.min(memory[i/3] + 1, memory[i]);
            }
            if(i%2 == 0){
                memory[i] = Math.min(memory[i/2] + 1, memory[i]);
            }
        }
        bw.write(memory[n] + "\n");
        bw.flush();
    }
}
