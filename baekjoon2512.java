import java.io.*;
import java.util.Arrays;

public class baekjoon2512 {
    static long fuckin(long [] bud, long n){
        long sum = 0;
        for(int i = 0; i < bud.length; i++){
            if(bud[i] < n){
                sum += bud[i];
            }
            else{
                sum += n;
            }
        }
        return sum;
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int asdf = Integer.parseInt(br.readLine());
        long [] bud = new long [asdf];
        String [] inp = br.readLine().split(" ");
        for(int i = 0; i < inp.length; i++){
            bud[i] = Long.parseLong(inp[i]);
        }
        long budjet = Long.parseLong(br.readLine());

        long left = 1;
        long right = (int) 1e9;
        long jehan = 0;
        long sum = 0;
        for(int i = 0; i < inp.length; i++){
            sum += bud[i];
        }
        Arrays.sort(bud);
        if(sum <= budjet){
            bw.write(bud[asdf-1] + "\n");
        }
        else {
            while (left <= right) {
                long mid = (left + right) / 2;
                long input = fuckin(bud, mid);
                if (input <= budjet) {
                    jehan = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            bw.write(jehan + "\n");
        }
        bw.flush();
    }
}
