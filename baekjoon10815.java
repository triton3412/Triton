import java.io.*;
import java.util.*;

public class baekjoon10815 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int inputcount = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();
        String [] input = br.readLine().split(" ");
        for (int i = 0; i < inputcount; i++) {
            set.add(Integer.parseInt(input[i]));
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int findcount = Integer.parseInt(br.readLine());
        String [] find = br.readLine().split(" ");
        for (int i = 0; i < findcount; i++) {
            if(Collections.binarySearch(list, Integer.parseInt(find[i])) < 0){
                bw.write(0 + " ");
            }
            else{
                bw.write(1 + " ");
            }
        }
        bw.flush();
    }
}
