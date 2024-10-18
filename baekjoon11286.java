import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class baekjoon11286 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        PriorityQueue<Integer> plus = new PriorityQueue<>();
        PriorityQueue<Integer> minus = new PriorityQueue<>(Comparator.reverseOrder());
        int n = Integer.parseInt(br.readLine());
        while(n-- > 0){
            int input = Integer.parseInt(br.readLine());
            if(input == 0){
                if(plus.isEmpty() && minus.isEmpty()){
                    bw.write("0\n");
                }
                else if(plus.isEmpty()){
                    bw.write(minus.poll() + "\n");
                }
                else if(minus.isEmpty()){
                    bw.write(plus.poll() + "\n");
                }
                else{
                    if(plus.peek() > Math.abs(minus.peek())){
                        bw.write(minus.poll() + "\n");
                    }
                    else if(plus.peek() < Math.abs(minus.peek())){
                        bw.write(plus.poll() + "\n");
                    }
                    else if(plus.peek() == Math.abs(minus.peek())){
                        bw.write(minus.poll() + "\n");
                    }
                }
            }
            else{
                if(input > 0){
                    plus.add(input);
                }
                else if(input < 0){
                    minus.add(input);
                }
            }
        }
        bw.flush();
    }
}
