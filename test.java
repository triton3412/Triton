import java.io.*;
import java.util.Arrays;

public class test {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        boolean [] sosu = new boolean[250001];
        int n = Integer.parseInt(br.readLine());
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
        int count = 0;
        for(int i = n+1; i <= 2*n; i++){
            if(sosu[i]){
                count++;
            }
        }
        bw.write(count + "\n");
        bw.flush();
    }
}
