import java.io.*;
import java.util.*;

public class baekjoon1764 {
    public static void main(String[] args){
        try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set <String> set = new HashSet<>();
        ArrayList<String> ddbd = new ArrayList<>();


            String [] num = br.readLine().split(" ");
            int n = Integer.parseInt(num[0]);
            int m = Integer.parseInt(num[1]);
            while(n-- > 0){
                set.add(br.readLine());
            }
            while(m-- > 0){
                String s = br.readLine();
                if (set.contains(s)) {
                    ddbd.add(s);
                }
            }
            Collections.sort(ddbd);
            bw.write(ddbd.size() + "\n");
            for(String s : ddbd){
                bw.write(s);
                bw.flush();
                bw.newLine();
            }
            bw.close();
            br.close();
        }catch(Exception e){
            System.out.println("Error Encountered");
        }
    }
}
