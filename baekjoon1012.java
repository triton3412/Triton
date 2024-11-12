import java.io.*;
import java.util.Arrays;

public class baekjoon1012 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int count = 0;
    static int [][] table;
    static boolean [][] visited;
    static int [] dx = {-1, 1, 0, 0};
    static int [] dy = {0, 0, -1, 1};
    static void dfs(int x, int y){
        visited[x][y] = true;
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx <= table.length && ny >= 0 && ny <= table[0].length){
                if(!visited[nx][ny] && table[nx][ny] == 1){
                    dfs(nx, ny);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        int TestCases = Integer.parseInt(br.readLine());
        while(TestCases-- > 0){
            String [] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            table = new int[n + 1][m + 1];
            visited = new boolean[n+1][m+1];
            for(int i = 0; i <= n; i++){
                Arrays.fill(table[i], 0);
            }
            int bugs = Integer.parseInt(input[2]);
            while(bugs-- > 0){
                String [] inp = br.readLine().split(" ");
                table[Integer.parseInt(inp[0])][Integer.parseInt(inp[1])] = 1;
            }
            for(int i = 0; i <= n; i++){
                for(int j = 0; j <= m; j++){
                    if(table[i][j] == 1 && !visited[i][j]){
                        dfs(i,j);
                        count++;
                    }
                }
            }
            for(int i = 0; i <= n; i++){
                for(int j = 0; j <= m; j++){
                    bw.write(table[i][j] + " ");
                }
                bw.newLine();
            }
            bw.write(count + "\n");
            count = 0;
        }
        bw.flush();
    }
}
