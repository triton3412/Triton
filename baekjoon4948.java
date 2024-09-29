import java.io.*;
import java.util.Arrays;

public class baekjoon4948 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static boolean [] sosu = new boolean [250001];
    public static void main(String[] args) throws IOException {
        Arrays.fill(sosu, true);
        sosu[1] = false;
        for(int i = 2; i <= 123456; i++){
            if(sosu[i]){
                for(int j = i; j <= 250000; j+=i){
                    if(j != i){
                        sosu[j] = false;
                    }
                }
            }
        }

        while(true){
            int input = Integer.parseInt(br.readLine());
            if(input == 0){
                break;
            }
            else {
                int count = 0;
                for (int i = input + 1; i <= 2 * input; i++) {
                    if (sosu[i]) {
                        count++;
                    }
                }
                bw.write(count + "\n");
                count = 0;
            }
        }
        bw.flush();
    }
}
