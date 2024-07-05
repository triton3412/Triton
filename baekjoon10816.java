import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class baekjoon10816 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) {
        try{
            int have = Integer.parseInt(br.readLine());
            HashMap<String, Integer> list = new HashMap<>();
            String[] input = br.readLine().split(" ");
            for (int i = 0; i < have; i++) {
                String key = input[i];
                if (!list.containsKey(key)) {
                    list.put(key, 1);  // key는 숫자, value는 횟수
                }
                else {
                    list.put(key, list.get(key) + 1);
                }
            }
            int count = Integer.parseInt(br.readLine());
            String[] read = br.readLine().split(" ");

            for (int i = 0; i < count; i++) {
                String query = read[i];
                if (!list.containsKey(query)) {
                    bw.write("0");
                } else {
                    bw.write(String.valueOf(list.get(query)));
                }
                bw.write(" ");  // 각 결과를 새로운 줄에 출력
            }

            bw.flush();
        }catch(Exception e){
            System.out.println("Error Encountered");
        }

    }
}
