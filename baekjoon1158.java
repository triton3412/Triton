import java.io.*;
import java.util.*;

public class baekjoon1158 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void Yosefus(Queue<Integer> q, int M) {
        Queue<Integer> result = new LinkedList<>();
        try{
            while(!q.isEmpty()){
                for(int i = 1; i < M; i++){
                    q.add(q.element());
                    q.remove();
                }
                result.add(q.element());
                q.remove();
            }
            bw.write("<");
            bw.flush();
            while(!result.isEmpty()){
                if(result.size() == 1){
                    bw.write(String.valueOf(result.poll()));
                }
                else {
                    bw.write(result.poll() + ", ");
                    bw.flush();
                }
            }
            bw.write(">");
            bw.flush();
        } catch (IOException e) {
            System.out.println("Error Detected");
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        try{
            String[] num = br.readLine().split(" ");
            int K = Integer.parseInt(num[0]);
            int M = Integer.parseInt(num[1]);
            for (int i = 1; i <= K; i++) {
                q.add(i);
            }
            Yosefus(q, M);

        } catch (IOException e){
            System.out.println("Error Detected");
        }
    }
}
