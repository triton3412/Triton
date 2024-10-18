import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class baekjoon18258 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        int last = 0;
        while (n-- > 0) {
            String [] inp = br.readLine().split(" ");
            if(inp[0].equals("push")) {
                last = Integer.parseInt(inp[1]);
                q.add(last);
            }
            else if(inp[0].equals("pop")) {
                if(q.isEmpty()){
                    bw.write("-1\n");
                }
                else{
                    bw.write(q.poll()+"\n");
                }
            }
            else if(inp[0].equals("front")) {
                if(q.isEmpty()) {
                    bw.write("-1\n");
                }
                else{
                    bw.write(q.element() + "\n");
                }
            }
            else if(inp[0].equals("back")) {
                if(q.isEmpty()){
                    bw.write("-1\n");
                }
                else{
                    bw.write(last + "\n");
                }
            }
            else if(inp[0].equals("size")) {
                bw.write(q.size() + "\n");
            }
            else if(inp[0].equals("empty")) {
                if(q.isEmpty()) {
                    bw.write("1\n");
                }
                else{
                    bw.write("0\n");
                }
            }
        }
        bw.flush();
    }
}
