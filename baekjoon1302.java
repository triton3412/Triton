import java.io.*;
import java.util.*;

public class baekjoon1302 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String input = br.readLine();
            map.put(input, map.getOrDefault(input, 0) + 1);
        }
        Set<String> set = new LinkedHashSet<>(map.keySet());
        Iterator<String> it = set.iterator();
        String max = it.next();
        while(it.hasNext()) {
            String input = it.next();
            if(map.get(input) > map.get(max)) {
                max = input;
            }
        }
        ArrayList<String> list = new ArrayList<>();
        list.add(max);
        Iterator<String> it2 = set.iterator();
        while(it2.hasNext()) {
            String input = it2.next();
            if(Objects.equals(map.get(input), map.get(max))) {
                list.add(input);
            }
        }
        Collections.sort(list);
        bw.write(list.get(0) + "\n");
        bw.flush();
    }
}
