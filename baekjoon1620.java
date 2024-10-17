import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class baekjoon1620 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        String [] inp = br.readLine().split(" ");
        int n = Integer.parseInt(inp[0]);
        int probs = Integer.parseInt(inp[1]);
        Map<String, Integer> nametonum = new HashMap<>();
        Map<Integer, String> numtoname = new HashMap<>();
        for(int i = 1; i <= n; i++){
            String shit = br.readLine();
            nametonum.put(shit, i);
            numtoname.put(i, shit);
        }
        for(int i = 0; i < probs; i++){
            String input = br.readLine();
            if(input.charAt(0) >= 'A' && input.charAt(0) <= 'Z'){
                bw.write(nametonum.get(input) + "\n");
            }
            else{
                bw.write(numtoname.get(Integer.parseInt(input)) + "\n");
            }
        }
        bw.flush();
    }
}
