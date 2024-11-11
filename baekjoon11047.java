import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class baekjoon11047 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args)throws IOException {
        String [] input = br.readLine().split(" ");
        int size = Integer.parseInt(input[0]);
        int total = Integer.parseInt(input[1]);
        int asdf = 0;
        ArrayList<Integer> coins = new ArrayList<>();
        for(int i = 0; i < size; i++){
            coins.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(coins, Collections.reverseOrder());
        bw.write("size : " + coins.size() + "\n");
        for(int i = 0; i < coins.size(); i++){
            if(coins.get(i) > total) coins.remove(coins.get(i));
        }
        bw.write("size : " + coins.size() + "\n");
        int shit = 0;
        while(total != 0){
            int inp = total/coins.get(shit);
            total -= inp*coins.get(shit);
            asdf += inp;
            bw.write("asdf : " + asdf + "\n");
            bw.write("total : " + total + "\n");
            shit++;
        }
        bw.write(asdf + "\n");
        bw.flush();
    }
}
