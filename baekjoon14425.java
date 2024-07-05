import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class baekjoon14425 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] ars){
        Set<String> set = new HashSet<>();
        int count = 0;
        try {
            String[] num = br.readLine().split(" ");
            int n = Integer.parseInt(num[0]);
            int m = Integer.parseInt(num[1]);
            for (int i = 0; i < n; i++) {
                set.add(br.readLine());
            }
            for (int i = 0; i < m; i++) {
                if(set.contains(br.readLine())){
                    count++;
                }
            }
            bw.write(String.valueOf(count));
            bw.flush();
        } catch(IOException e){
            System.out.println("Error Detected");
        }
    }
}
