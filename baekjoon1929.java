import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class baekjoon1929 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args)throws IOException {
        String [] inp = br.readLine().split(" ");
        int start = Integer.parseInt(inp[0]);
        int end = Integer.parseInt(inp[1]);
        int [] sosu = new int [end +1];
        Arrays.fill(sosu,1);
        sosu[1] = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 2; i <= end; i++){
            if(sosu[i] != 0){
                arr.add(i);
                for(int j = 2; j <= end /i; j++){
                    if(sosu[i*j] != 0){
                        sosu[i*j] = 0;
                    }
                }
            }
        }
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) >= start){
                bw.write(arr.get(i)+"\n");
            }
        }
        bw.flush();
    }
}
