import java.io.*;
import java.util.PriorityQueue;

public class baekjoon18111 {
    static void in(){
        time+=2;
        Inven++;
    }
    static void out(){
        time++;
    }
    static int [][] ground;
    static int Inven;
    static int time;
    static int line(int [][] ground, int line) {
        int totalblock = 0;
        int time = 0;
        for (int i = 1; i < ground.length; i++) {
            for (int j = 1; j < ground[0].length; j++) {
                if (ground[i][j] > line){
                    time += 2*(ground[i][j] - line);
                    totalblock -= ground[i][j] - line;
                }
                else if(ground[i][j] < line){
                    time += line - ground[i][j];
                    totalblock += line - ground[i][j];
                }
            }
        }
        if(Inven >= totalblock){
            return time;
        }
        else{
            return -1;
        }
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        String [] inp = br.readLine().split(" ");
        int n = Integer.parseInt(inp[0]);
        int m = Integer.parseInt(inp[1]);
        int mintime = 999999999;
        int maxheight = 0;
        Inven = Integer.parseInt(inp[2]);
        ground = new int [n+1][m+1];

        int max = 0;
        int min = 256;
        for(int i = 1; i <= n; i++){
            inp = br.readLine().split(" ");
            for(int j = 1; j <= m; j++){
                ground[i][j] = Integer.parseInt(inp[j-1]);
                if(ground[i][j] > max) max = ground[i][j];
                else if(ground[i][j] < min) min = ground[i][j];
            }
        }
        //시간은 적고 높이는 높아야 함
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i = min; i <= max; i++){
            int asdf = line(ground, i);
            if(asdf != -1){
                if(asdf < mintime){
                    mintime = asdf;
                    maxheight = i;
                }
                else if(asdf == mintime && maxheight < i){
                    mintime = asdf;
                    maxheight = i;
                }
            }
        }
        bw.write(mintime + " " + maxheight + "\n");
        bw.flush();
    }
}
