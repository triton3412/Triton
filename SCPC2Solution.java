import java.io.*;
import java.util.Arrays;

public class SCPC2Solution {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) {
        try{
            int cou = Integer.parseInt(br.readLine());
            for(int x = 0; x < cou; x++){
                int size = Integer.parseInt(br.readLine());
                int [] n = new int[size];
                String [] str = br.readLine().split(" ");
                for(int i = 0; i < size; i++){
                    n[i] = Integer.parseInt(str[i]);
                }
                Arrays.sort(n);

                long total = 0;

                int count = size/4;

                for(int i = 0; i < count; i++){
                    total += 2L *(n[size-(i+1)] - n[i]);
                }
                bw.write("Case #" + (x + 1) + "\n");
                bw.write((total) + "\n");
                bw.flush();

            }
        } catch (IOException e){
            System.out.println("Error Detected");
        }
    }
}
