import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class baekjoon1260 {
    static int [][] graph;
    static boolean [] visited;
    static Queue<Integer> q = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();
    static void dfs(int start)throws IOException{
        q.add(start);
        visited[start] = true;
        for(int i = 1; i < graph.length; i++){
            if(!visited[i] && graph[start][i] == 1){
                dfs(i);
            }
        }
        while(!q.isEmpty()){
            bw.write(q.poll() + " ");
        }
    }
    static void bfs(int start)throws IOException{
        q2.add(start);
        visited[start] = true;
        while(!q2.isEmpty()){
            bw.write(q2.element() + " ");
            int now = q2.poll();
            for(int i = 1; i < graph.length; i++){
                if(!visited[i] && graph[now][i] == 1){
                    visited[i] = true;
                    q2.add(i);
                }
            }
        }
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String [] inp = br.readLine().split(" ");
        int node = Integer.parseInt(inp[0]);
        int lines = Integer.parseInt(inp[1]);
        int start = Integer.parseInt(inp[2]);
        graph = new int[node +1][node +1];
        visited = new boolean[node+1];
        for(int i = 0; i < lines; i++) {
            inp = br.readLine().split(" ");
            graph[Integer.parseInt(inp[0])][Integer.parseInt(inp[1])] = 1;
            graph[Integer.parseInt(inp[1])][Integer.parseInt(inp[0])] = 1;
        }
        dfs(start);
        Arrays.fill(visited, false);
        bw.newLine();
        bfs(start);
        bw.flush();
    }
}
