import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class baekjoon17219 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        Map<String, String> table = new HashMap<>();
        String [] input = br.readLine().split(" ");
        int put = Integer.parseInt(input[0]);
        int ques = Integer.parseInt(input[1]);
        for(int i = 0; i < put; i++){
            input = br.readLine().split(" ");
            table.put(input[0], input[1]);
        }
        for(int i = 0; i < ques; i++){
            bw.write(table.get(br.readLine()) + "\n");
        }
        bw.flush();
    }
}
