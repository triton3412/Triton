import java.io.*;
import java.util.*;

public class baekjoon2751 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args){
        Set<Integer> set = new HashSet<Integer>();
        try{
            int n = Integer.parseInt(br.readLine());
            for(int i = 0; i < n; i++){
                set.add(Integer.parseInt(br.readLine()));
            }
            List<Integer> list = new ArrayList<Integer>(set);
            Collections.sort(list);
            for(int i = 0; i < list.size(); i++){
                bw.write(list.get(i) + "\n");
            }
            bw.flush();
        } catch (IOException e){
            System.out.println("Error Detected");
        }
    }
}
