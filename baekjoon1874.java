import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class baekjoon1874 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        Stack<Integer> st = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int [n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        ArrayList<String> ar = new ArrayList<>();
        int push = 1;
        for(int i = 0; i < n; i++) {
            int tg = arr[i];
            while((st.isEmpty() || st.get(st.size()-1) != tg) && push <= n) {
//                bw.write("push : " + push + "\n");
                ar.add("+");
                st.push(push);
                push++;
            }
            if(st.get(st.size()-1) == tg) {
//                bw.write("pop : " + st.pop() + "\n");
                ar.add("-");
                st.pop();
            }
            else if(push > n){
                bw.write("NO" + "\n");
                bw.flush();
                return;
            }

        }
        for(int i = 0; i < ar.size(); i++) {
            bw.write(ar.get(i) + "\n");
        }
        bw.flush();
    }
}
