import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class baekjoon2578 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int garobingo(int [][] bingo) {
        int count = 0;
        for (int i = 0; i < 5; i++) {//가로 빙고 체크
            if(bingo[i][0] == 0 && bingo[i][1] == 0 && bingo[i][2] == 0 && bingo[i][3] == 0 && bingo[i][4] == 0) {
                count++;
            }
        }
        return count;
    }
    static int serobingo(int [][] bingo) {
        int count = 0;
        for(int i = 0; i < 5; i++){//세로 빙고 체크
            if(bingo[0][i] == 0 && bingo[1][i] == 0 && bingo[2][i] == 0 && bingo[3][i] == 0 && bingo[4][i] == 0){
                count++;
            }
        }
        return count;
    }
    static int daebingo(int [][] bingo) {
        int count = 0;
        if(bingo[0][4] == 0 && bingo[1][3] == 0 && bingo[2][2] == 0 && bingo[3][1] == 0 && bingo[4][0] == 0){
            count++;
        }
        return count;
    }
    static int daebingo2(int [][] bingo) {
        int count = 0;
        if(bingo[0][0] == 0 && bingo[1][1] == 0 && bingo[2][2] == 0 && bingo[3][3] == 0 && bingo[4][4] == 0){
            count++;
        }
        return count;
    }
    static int total(int [][] bingo) {
        int count = 0;
        count += serobingo(bingo);
        count += garobingo(bingo);
        count += daebingo(bingo);
        count += daebingo2(bingo);
        return count;
    }
    static int [] find (int [][] bingo, int n) {
        int [] res = new int[2];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(bingo[i][j] == n){
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }
    static void print(int [][] bingo)throws IOException {
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                bw.write(String.format("%-4d ", bingo[i][j]));
            }
            bw.newLine();
        }
        bw.flush();
    }
    public static void main(String[] args)throws IOException {
        int [][] bingo = new int [5][5];
        for(int i = 0; i < 5; i++){
            String [] inp = br.readLine().split(" ");
            for(int j = 0; j < 5; j++){
                bingo[i][j] = Integer.parseInt(inp[j]);
            }
        }//여기까지 빙고 입력 안료
        //이제 여기부터 진행자가 값 부름
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i = 0; i < 5; i++){
            String [] inp = br.readLine().split(" ");
            for(int j = 0; j < 5; j++){
                queue.add(Integer.parseInt(inp[j]));
            }
        }
        int count = 0;
        while (total(bingo) < 3) {
            bingo[find(bingo, queue.element())[0]][find(bingo, queue.poll())[1]] = 0;
            count++;
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}