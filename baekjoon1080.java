import java.io.*;
import java.util.Arrays;

public class baekjoon1080 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int [][] origin;
    static int [][] diff;
    static void change(int n, int m){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(diff[n+i][m+j] == 1){
                    diff[n+i][m+j] = 0;
                }
                else if(diff[n+i][m+j] == 0){
                    diff[n+i][m+j] = 1;
                }
            }
        }
    }
    static void print()throws IOException{
        for(int i = 1; i < diff.length; i++){
            for(int j = 1; j < diff[0].length; j++){
                bw.write(diff[i][j] + " ");
            }
            bw.newLine();
        }
        bw.newLine();
    }
    public static void main(String[] args) throws IOException {
        String [] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        origin = new int [n+1][m+1];
        for(int i = 1; i <= n; i++){
            String inp = br.readLine();
            for(int j = 1; j <= m; j++){
                origin[i][j] = Character.getNumericValue(inp.charAt(j-1));
            }
        }
        diff = new int [n+1][m+1];
        for(int i = 1; i <= n; i++){
            Arrays.fill(diff[i], 0);
        }
        for(int i = 1; i <= n; i++){
            String inp = br.readLine();
            for(int j = 1; j <= m; j++){
                if(Character.getNumericValue(inp.charAt(j-1)) != origin[i][j]){
                    diff[i][j] = 1;
                }
            }
        } //여기까지 입력 다 받음
//        print();

        int count = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(diff[i][j] == 1){
                    if(i <= n-2 && j <= m-2){
                        change(i, j);
//                        print();
                        count++;
                    }
                }
            }
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(diff[i][j] == 1){
                    bw.write(-1 + "\n");
                    bw.flush();
                    return;
                }
            }
        }
        bw.write(count + "\n");
        bw.flush();
    }
}
