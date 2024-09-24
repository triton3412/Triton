import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class baekjoon2960 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String [] inp = br.readLine().split(" ");
        int N = Integer.parseInt(inp[0]);
        int index = Integer.parseInt(inp[1]);
        int [] sosu = new int [N+1];
        Arrays.fill(sosu,1);
        sosu[1] = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 2; i <= N; i++){
            if(sosu[i] != 0){
                for(int j = 1; j <= N/i; j++){
                    if(sosu[i*j] != 0){
                        arr.add(i*j);
                        sosu[i*j] = 0;
                    }
                }
            }
        }
        bw.write(arr.get(index-1) + "\n");
        bw.flush();
    }
}
