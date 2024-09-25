import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class test {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args)throws IOException {
        int n = Integer.parseInt(br.readLine());
        int [] sosu = new int [n + 1];
        Arrays.fill(sosu,1);
        sosu[1] = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 2; i <= n; i++){
            if(sosu[i] != 0){
                arr.add(i);
                for(int j = 2; j <= n /i; j++){
                    if(sosu[i*j] != 0){
                        sosu[i*j] = 0;
                    }
                }
            }
        }
        /*for(int i = 0; i < arr.size(); i++){
            bw.write(arr.get(i)+" ");
        }*/
        bw.newLine();
        int [] target = new int [2];
        for(int i = arr.size() - 1; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                if(arr.get(j) + arr.get(i) == n){
                    target[0] = arr.get(j);
                    target[1] = arr.get(i);
                }
            }
        }
        bw.write(target[0]+" "+target[1]);
        bw.flush();
    }
}
