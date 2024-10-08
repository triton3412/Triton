import java.io.*;

public class baekjoon16401 {
    static long count(long [] snack, long length){
        long sum = 0;
        for(int i = 0; i < snack.length; i++){
            sum += snack[i]/length;
        }
        return sum;
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String [] inp = br.readLine().split(" ");
        int people = Integer.parseInt(inp[0]);
        int snacks = Integer.parseInt(inp[1]);
        long [] snack = new long[snacks];
        inp = br.readLine().split(" ");
        for (int i = 0; i < snacks; i++) {
            snack[i] = Long.parseLong(inp[i]);
        }
        long left = 1;
        long right = (long)1e9;
        long ans = 0;
        while(left <= right){
            long mid = (left + right)/2;
            long input = count(snack, mid);
            if(input >= people){
                ans = mid;
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        bw.write(ans+"\n");
        bw.flush();
    }
}
