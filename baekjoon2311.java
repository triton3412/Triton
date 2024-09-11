import java.io.*;
import java.util.*;

public class baekjoon2311 {
    static int [] ret(int num){
        int count = String.valueOf(num).length();
        int [] ret =  new int [count];;
        for(int i = 0; i < count; i++){
            ret[count-i-1] = num%10;
            num/=10;
        }
        return ret;
    }
    static int poww(int x, int P){//숫자 그 쪼갠거 제곱 리턴
        int a = 0;
        for(int i = 0; i < ret(x).length; i++){
            a += (int) Math.pow(ret(x)[i], P);
        }
        return a;
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String [] inp = br.readLine().split(" ");
        int num = Integer.parseInt(inp[0]);
        int gop = Integer.parseInt(inp[1]);
        ArrayList<Long> arr = new ArrayList<>();

        arr.add((long) num);

        long x = poww(num, gop);

        while(!arr.contains(x)){
            arr.add(x);
            x = poww((int) x, gop);
        }
        long start = x;

        /*for(int i = 0; i < arr.size(); i++){
            bw.write(arr.get(i) + " ");
        }
         bw.newLine();
        bw.write("Start : " + start + "\n");*/

        for(int i = 0; i < arr.size(); i++){
            if(Objects.equals(arr.get(i), start)){
                bw.write(i + "\n");
            }
        }
        bw.flush();
    }
}