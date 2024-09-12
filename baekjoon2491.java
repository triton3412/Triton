import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class baekjoon2491{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args)throws IOException {
        int [] shit = new int [Integer.parseInt(br.readLine())];
        int [] arr = new int [shit.length];
        String [] inp = br.readLine().split(" ");
        PriorityQueue<Integer> asdf = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0; i < inp.length; i++){
            arr[i] = Integer.parseInt(inp[i]);
        }
        int count = 1;
        for(int i = 1; i < inp.length; i++){
            if (arr[i-1] > arr[i]) {
                asdf.add(count);
                count = 0;
            }
            count++;
        }
        asdf.add(count);
        count = 1;
        for(int i = 1; i < inp.length; i++){
            if (arr[i-1] < arr[i]) {
                asdf.add(count);
                count = 0;
            }
            count++;
        }
        asdf.add(count);
        bw.write(asdf.element()+"\n");
        bw.flush();
    }
}
