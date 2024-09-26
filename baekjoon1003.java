import java.io.*;
import java.util.Arrays;

public class baekjoon1003 {
    //Tlqkf 메모이제이션으로 풀어야되잖아 괜히지웠네 귀찮게
    static int [] one = new int [41];
    static int [] zero = new int [41];
    static int ones(int n){
        if(one[n] == -1){
            if (n == 0) {
                one[n] = 0;
                return one[n];
            } else if (n == 1) {
                one[n] = 1;
                return one[n];
            } else {
                one[n] = ones(n-1) + ones(n-2);
                return one[n];
            }
        }
        else{
            return one[n];
        }
    }
    static int zeros(int n){
        if(zero[n] == -1){
            if (n == 0) {
                zero[n] = 1;
                return zero[n];
            } else if (n == 1) {
                zero[n] = 0;
                return zero[n];
            } else {
                zero[n] = zeros(n-1) + zeros(n-2);
                return zero[n];
            }
        }
        else{
            return zero[n];
        }
    }


    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(br.readLine());
        while(count --> 0){
            Arrays.fill(one, -1);
            Arrays.fill(zero, -1);
            int n = Integer.parseInt(br.readLine());
            bw.write(zeros(n) + " " + ones(n) + "\n");
        }
        bw.flush();
    }
}
