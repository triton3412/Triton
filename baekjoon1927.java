import java.io.*;
import java.util.PriorityQueue;

public class baekjoon1927 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        int count = Integer.parseInt(br.readLine());
        while(count-- > 0) {
            int input = Integer.parseInt(br.readLine());
            if(input == 0){
                if(minheap.isEmpty()){
                    bw.write(0 + "\n");
                }
                else{
                    bw.write(minheap.poll() + "\n");;
                }
            }
            else{
                minheap.add(input);
            }
        }
        bw.flush();
    }
}
