import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class baekjoon18110 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int updown(float n){
        n += 0.5;
        return (int)n;
    }
    public static void main(String[] args) throws IOException {
        int opi = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < opi; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        float rem = (float) (list.size() * 0.15);
        int remo = updown(rem);

        Collections.sort(list);

        int sum = 0;
        int count = 0;
        for(int i = remo; i < list.size() - remo; i++) {
            sum += list.get(i);
            count++;
        }
        int aver = updown((float) sum / count);
        bw.write(String.valueOf(aver));
        bw.flush();
    }
}
