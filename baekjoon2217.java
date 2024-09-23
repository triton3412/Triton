import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class baekjoon2217 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(br.readLine());
        var arr = new ArrayList<Integer>();
        for (int i = 0; i < count; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(arr);
        var res = new ArrayList<Integer>();

        for(int i = 0; i < arr.size(); i++){
            res.add(arr.get(i) * (count-i));
        }
        res.sort(Collections.reverseOrder());
        bw.write(res.get(0) + "\n");
        bw.flush();
    }
}
