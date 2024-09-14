import java.io.*;
import java.util.*;

public class test {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args)throws IOException {
        String [] asdf = br.readLine().split(" ");
        int size = Integer.parseInt(asdf[0]);
        int count = Integer.parseInt(asdf[1]);
        Map<Integer, Integer> map = new HashMap<>();


        int last = 1;

        for (int i = 1; i < count; i++) {
            int input = Integer.parseInt(br.readLine());
            if(!map.containsKey(input)) {
                map.put(input, last);
            }
            else {
                map.put(input, last);
            }
            last++;
        }
        bw.newLine();

        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);

        for(int i = 0; i < list.size(); i++) {
            bw.write(list.get(i)+" ");
        }
        bw.flush();

    }
}
