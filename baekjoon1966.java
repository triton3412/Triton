import java.io.*;
import java.util.*;

public class baekjoon1966 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void toback(Queue<Integer> q) {
            q.add(q.element());
            q.remove();
    }
    public static int pqq(Queue<Integer> q, Queue<Integer> q2, PriorityQueue<Integer> pq) {
        while (true) {
                if (pq.element().equals(q.element())) {
                    pq.poll();
                    q.poll();
                    int n = q2.poll();
                    return n;
                }
                toback(q);
                toback(q2);
        }
    }

    public static void main(String[] args) {
        try {
            int Count = Integer.parseInt(br.readLine());
            for (int c = 0; c < Count; c++) {
                String[] num = br.readLine().split(" ");
                int N = Integer.parseInt(num[0]);
                int M = Integer.parseInt(num[1]);
                PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
                Queue<Integer> q = new LinkedList<>();
                Queue<Integer> q2 = new LinkedList<>();
                for (int i = 0; i < N; i++) {
                    q2.add(i);
                }
                String[] impo = br.readLine().split(" ");
                for (int i = 0; i < N; i++) {
                    pq.add(Integer.parseInt(impo[i]));
                    q.add(Integer.parseInt(impo[i]));
                }
                int i = 1;
                while (true) {
                    int n = pqq(q, q2, pq);
                    if (n == M) {
                        break;
                    }
                    i++;
                }
                bw.write(String.valueOf(i));
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e){
            System.out.println("Error Detected");
        }
    }
}
