import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class SCPC3Solution {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(br.readLine());
            for(int x = 1; x <= num; x++) {
                Map<Integer, Integer> map = new HashMap<>();
                Map<Integer, Integer> rel = new HashMap<>();

                int N = Integer.parseInt(br.readLine());

                for (int i = 1; i <= N; i++) {    //횟수 다 0으로 지정
                    map.put(i, 0);
                }

                for(int i = 0; i <= N; i++) {
                    String[] ar = br.readLine().split(" ");
                    int from = Integer.parseInt(ar[0]);
                    int dest = Integer.parseInt(ar[1]);
                    rel.put(from, dest);
                    rel.put(dest, from);
                    map.put(from, map.get(from) + 1);
                    map.put(dest, map.get(dest) + 1);
                }

                int count = 0;

                for(int i = 1; i <= N; i++) {
                    if(map.get(i) < 3) {
                        count++;
                    }
                }
                for(int i = 1; i <= N; i++) {
                    if(map.get(i) < 3 && map.get(rel.get(i)) < 3) {
                        count++;
                    }
                }


                bw.write("Case #" + x + "\n");
                bw.write(count + "\n");
                bw.flush();
            }

        }catch(IOException e){
            System.out.println("ERROR DETECTED");
        }
    }
}
