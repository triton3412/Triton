import java.io.*;
import java.util.Arrays;

public class SCPC4Solution {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) {
        try{
            String [] range = br.readLine().split(" ");
            int N = Integer.parseInt(range[0]);
            int L = Integer.parseInt(range[1]);

            String[] A = br.readLine().split(" ");
            String[] B = br.readLine().split(" ");
            int [] a = new int[A.length + 1];
            int [] b = new int[B.length + 1];
            int size = A.length;
            for(int i = 0; i < size; i++){
                a[i] = Integer.parseInt(A[i]);
                b[i] = Integer.parseInt(B[i]);
            }
            Arrays.sort(a);
            Arrays.sort(b);

            int [] maximum = new int [size];

            int max = -1;

            for(int i = 0; i < size; i++){
                maximum[i] = Math.max(Math.abs(b[size-i] - a[i]), Math.abs(a[size - i] - b[i]));
            }
            Arrays.sort(maximum);


            for(int i = size-1; i >= 0; i--){
                if(maximum[i] <= L){
                    max  = maximum[i];
                }
            }


            bw.write("max : " + max + "\n");
            bw.flush();

        }catch (IOException e){
            System.out.println("ERROR DETECTED");
        }
    }
}
