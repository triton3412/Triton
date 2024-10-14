import java.io.*;
import java.util.Arrays;

public class baekjoon2776 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int testCases = Integer.parseInt(br.readLine());
        while (testCases-- > 0) {
            int [] arr = new int[Integer.parseInt(br.readLine())];
            String [] inp = br.readLine().split(" ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(inp[i]);
            }
            Arrays.sort(arr);
            int [] note = new int [Integer.parseInt(br.readLine())];
            inp = br.readLine().split(" ");
            for (int i = 0; i < note.length; i++) {
                note[i] = Integer.parseInt(inp[i]);
            }
            for(int i = 0; i < note.length; i++) {
                if(Arrays.binarySearch(arr, note[i]) >= 0) {
                    bw.write(1 + "\n");
                }
                else{
                    bw.write(0 + "\n");
                }
            }
            bw.flush();
        }
    }
}
