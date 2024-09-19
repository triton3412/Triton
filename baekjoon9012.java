import java.io.*;
import java.util.Stack;

public class baekjoon9012 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        while(count-- > 0) {
            stack.removeAllElements();
            String input = br.readLine();
            char [] guaro = input.toCharArray();
            for(int i = 0; i < input.length(); i++) {
                if(guaro[i] == ')' && stack.contains('(')) {
                    stack.pop();
                }
                else{
                    stack.push(guaro[i]);
                }
            }
            if(stack.isEmpty()){
                bw.write("YES\n");
            }
            else{
                bw.write("NO\n");
            }
        }
        bw.flush();
    }
}
