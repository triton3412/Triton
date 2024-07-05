import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class baekjoon2164 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void removelow (Queue<Integer> q) {
        try {
            while(q.size() != 1){
                q.remove();
                q.add(q.element());
                q.remove();
            }
            bw.write(q.element().toString());
            bw.flush();
        } catch (IOException e) {
            System.out.println("Error Detected");}
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        try{
            int n = Integer.parseInt(br.readLine());
            for (int i = 1; i <= n; i++) {
                queue.add(i);
            }
            removelow(queue);
        } catch (IOException e){
            System.out.println("Error Detected");
        }

    }
}

