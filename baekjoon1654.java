import java.io.*;

public class baekjoon1654 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static long sadf(long [] lopes, long n){
        long count = 0;
        for (long lope : lopes) {
            count += lope / n;
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        String [] inp = br.readLine().split(" ");
        int lope = Integer.parseInt(inp[0]);
        int target = Integer.parseInt(inp[1]);
        long [] lopes = new long[lope];
        for(int i = 0; i < lope; i++){
            lopes[i] = Integer.parseInt(br.readLine());
        }
        long ans = 0;
        long left = 1;
        long right = 2147483647;
        while(left <= right){
            long mid = (left + right)/2;
            long shit = sadf(lopes, mid);
            if(shit >= target){
                ans = mid;
                left = mid + 1;
            }
            else if(shit < target){
                right = mid - 1;
            }
        }
        bw.write(ans + "\n");
        bw.flush();
    }
}
