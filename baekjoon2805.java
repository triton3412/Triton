import java.io.*;

public class baekjoon2805 {
    static long total(int [] trees, long height){
        long fuck = 0;
        for(int i = 0; i<trees.length; i++){
            if(trees[i] > height){
                fuck += trees[i] - height;
            }
        }
        return fuck;
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String [] qwer = br.readLine().split(" ");
        int count = Integer.parseInt(qwer[0]);
        int target = Integer.parseInt(qwer[1]);
        int [] trees = new int[count];
        String [] tree = br.readLine().split(" ");
        for (int i = 0; i < count; i++) {
            trees[i] = Integer.parseInt(tree[i]);
        }
        long left = 1;
        long right = (int) 2e9;
        long ans = 0;
        while(left <= right){
            long mid = (left + right) / 2;
            long shit = total(trees, mid);
            if(shit >= target){
                ans = mid;
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        bw.write(ans+"\n");
        bw.flush();
    }
}
