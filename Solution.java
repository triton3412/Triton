import java.io.*;

public class Solution {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static int countzero (long [] w2){
        int count = 0;
        for(int i=0;i<w2.length;i++){
            if(w2[i]>0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException {

        //N하고 Q 입력받기
        String [] inp = br.readLine().split(" ");
        int N = Integer.parseInt(inp[0]); //N = 프로세스 개수 (W 크기)
        int Q = Integer.parseInt(inp[1]); //Q = 질의 개수 (X 크기)


        String [] strW = br.readLine().split(" "); //W 입력받기
        long [] W = new long[N];
        for (int i = 0; i < N; i++) {
            W[i] = Integer.parseInt(strW[i]);
        }


        String [] strX = br.readLine().split(" "); //X 값 입력받음
        int [] X = new int [Q];
        for (int i = 0; i < Q; i++) {
            X[i] = Integer.parseInt(strX[i]);
        }

        //이제 반복문 짜기

        int sum = 0;

        for (int i = 0; i < Q; i++) {
            long[] w2 = W;
            int count = 0;
            if(X[i] < N){
                int nf = 0;
                while(true){
                    if(count == X[i]){
                        bw.write((nf%N) + 1 + "\n");
                        sum += (nf%N) + 1;
                        break;
                    }
                    else if(w2[nf%N] > 0){
                        w2[nf%N]--;
                        count++;
                    }
                    nf++;
                }
            }
            else{
                while(count < X[i]){
                    count += countzero(w2);
                    for(int j=0;j<w2.length;j++){
                        w2[j]--;
                    }
                }
                int nf = 0;
                while(true){
                    if(count == X[i]){
                        sum += (nf%N) + 1;
                        break;
                    }
                    else{
                        if(w2[nf%N] > 0){
                            w2[nf%N]--;
                            count++;
                        }
                    }
                    nf++;
                }
            }
        }
        bw.write(sum+"\n");
        bw.flush();
    }
}
