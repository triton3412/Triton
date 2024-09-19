import java.io.*;

public class test {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args)throws IOException {
        int n = Integer.parseInt(br.readLine());
        int five = n/5 - 1;
        n -= five*5;
        int three = n/3;
        n -= three*3;
        if(n == 0){
             bw.write(five + three + "\n");
        }
        else{
            bw.write(-1 + " ");
        }
        bw.flush();
    }
}
