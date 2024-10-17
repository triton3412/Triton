import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class baekjoon11866 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String [] inp = br.readLine().split(" ");
        int n = Integer.parseInt(inp[0]);
        int k = Integer.parseInt(inp[1]);
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while (!q.isEmpty()) {
            for(int i = 0; i < k-1; i++) {
                q.add(q.poll());
            }
            ans.add(q.poll());
        }
        bw.write("<");
        for(int i = 0; i < ans.size(); i++) {
            if(i == ans.size()-1) {
                bw.write(ans.get(i).toString());
            }
            else{
                bw.write(ans.get(i) + ", ");
            }
        }
        bw.write(">");
        bw.flush();
    }
}
