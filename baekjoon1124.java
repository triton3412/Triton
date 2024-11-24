import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class baekjoon1124 {
    static boolean [] eratos = new boolean [100001];
    static ArrayList<Integer> era = new ArrayList<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static boolean check(int n){
        int count = 1;
        int asdf = 0;
        while(!eratos[n]){
            if(n%era.get(asdf) == 0){
                n /= era.get(asdf);
                count++;
            }
            else{
                asdf++;
            }
        }
        return eratos[count];
    }
    public static void main(String[] args) throws IOException {
        Arrays.fill(eratos, true);
        eratos[0] = false; eratos[1] = false;
        String [] inp = br.readLine().split(" ");
        int n = Integer.parseInt(inp[0]);
        int m = Integer.parseInt(inp[1]);
        for (int i = 2; i <= m; i++) {
            if(eratos[i]){
                for(int j = 2; j*i <= m; j++){
                    eratos[i*j] = false;
                }
            }
        }

        for(int i = 2; i <= m; i++){
            if(eratos[i]) {
                era.add(i);
            }
        }

        //여기까지가 소수 판별문

        int count = 0;
        for(int i = n; i <= m; i++){
            if(check(i)) count++;
        }
        bw.write(count + "\n");
        bw.flush();
    }
}
