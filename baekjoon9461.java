import java.io.*;
import java.util.Arrays;

public class baekjoon9461 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static long [] arr = new long [100];
    public static long pado(int n){
        int [] in = new int [100];
        if(n < 4){
            return 1;
        }
        else{
            if(arr[n-1] == 0){
                arr[n-1] = pado(n-2) + pado(n-3);
                return arr[n-1];
            }
            else{
                return arr[n-1];
            }
        }

    }
    public static void main(String[] args) throws IOException {
        Arrays.fill(arr, 0);
        int count = Integer.parseInt(br.readLine());
        for(int i = 0; i < count; i++){
            bw.write(pado(Integer.parseInt(br.readLine()))+"\n");
        }
        bw.flush();
    }
}
