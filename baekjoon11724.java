import java.io.*;
import java.util.*;

public class baekjoon11724 {
    static Queue<Integer> q = new LinkedList<>();
    static int [][] graph;
    static boolean [] visited;
    static void dfs(int start) {
        q.add(start);
        visited[start] = true;
        for(int i = 1; i < graph.length; i++){
            if(!visited[i] && graph[start][i] == 1){
                dfs(i);
            }
        }
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String [] inp = br.readLine().split(" ");
        int node = Integer.parseInt(inp[0]);
        int line = Integer.parseInt(inp[1]);
        graph = new int [node+1][node+1];
        visited = new boolean [node+1];
        for(int i = 0; i < line; i++){
            inp = br.readLine().split(" ");
            graph[Integer.parseInt(inp[0])][Integer.parseInt(inp[1])] = 1;
            graph[Integer.parseInt(inp[1])][Integer.parseInt(inp[0])] = 1;
        }
        int result = 0;
        for(int i = 0; i < node+1; i++){
            if(!visited[i]){
                dfs(i);
                result++;
            }
        }
        bw.write(result-1 + "\n");
        bw.flush();
    }
}
