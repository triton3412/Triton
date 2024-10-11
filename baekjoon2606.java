import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class baekjoon2606 {
    static int [][] graph;
    static boolean [] visited;
    static Queue<Integer> q = new LinkedList<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int nodes = Integer.parseInt(br.readLine());
        int lines = Integer.parseInt(br.readLine());
        graph = new int[nodes+1][nodes+1];
        visited = new boolean[nodes+1];
        for(int i = 0; i < lines; i++) {
            String [] input = br.readLine().split(" ");
            graph[Integer.parseInt(input[0])][Integer.parseInt(input[1])] = 1;
            graph[Integer.parseInt(input[1])][Integer.parseInt(input[0])] = 1;
        }
        int start = 1;
        q.add(start);
        visited[start] = true;
        while(!q.isEmpty()) {
            int now = q.poll();
            for(int i = 1; i < graph.length; i++) {
                if(!visited[i] && graph[now][i] == 1) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
        int sum = 0;
        for(int i = 2; i < visited.length; i++) {
            if(visited[i]) {
                sum++;
            }
        }
        bw.write(sum + "\n");
        bw.flush();
    }
}
