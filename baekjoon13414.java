import java.io.*;
import java.util.*;

public class baekjoon13414 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args)throws IOException {
        String [] asdf = br.readLine().split(" ");
        int size = Integer.parseInt(asdf[0]);
        int count = Integer.parseInt(asdf[1]);
        Map<String, Integer> map = new HashMap<>();
        Map<Integer, String> reverse = new HashMap<>();


        int last = 1;

        for (int i = 0; i < count; i++) {
            String input = br.readLine();
            if(!map.containsKey(input)) {
                map.put(input, last);
                reverse.put(last, input);
            }
            else {
                map.put(input, last);
                reverse.put(last, input);
            }
            last++;
        }
        ArrayList<Integer> values = new ArrayList<>(map.values());
        Collections.sort(values);

        int minshit = Math.min(size, values.size());

        for(int i = 0; i < minshit; i++){
            int value = values.get(i);
            bw.write(reverse.get(value) + "\n");
        }
        bw.flush();
    }
}
