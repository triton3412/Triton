import java.io.*;
import java.util.Arrays;

public class baekjoon11659 {
    static int [] sums;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String [] input = br.readLine().split(" ");
        int nums = Integer.parseInt(input[0]);
        int TestCases = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        int [] numbers = new int [nums+1];
        sums = new int [nums+1];
        Arrays.fill(sums, -1);
        sums[0] = 0;
        for(int i = 1; i <= nums; i++){
            numbers[i] = Integer.parseInt(input[i-1]);
        }
        while(TestCases-- > 0){
            int sum = 0;
            input = br.readLine().split(" ");
            int start = Integer.parseInt(input[0]);
            int end = Integer.parseInt(input[1]);
            if(sums[start-1] != -1 && sums[end] != -1){
                bw.write(sums[end] - sums[start-1] + "\n");
            }
            else{
                for(int i = 1; i <= end; i++){
                    if(sums[i] == -1){
                        sums[i] = sums[i-1] + numbers[i];
                    }
                }
                bw.write(sums[end] - sums[start-1] + "\n");
            }
        }
        bw.flush();
    }
}
