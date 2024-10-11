import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class baekjoon17413failed {
    static String reverse(String s) {
        String rev = "";
        Stack<Character> st = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }
        while(!st.isEmpty()) {
            rev += st.pop();
        }
        return rev;
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args)throws IOException {
        String input = br.readLine();
        ArrayList<String> arr = new ArrayList<>();
        if(input.charAt(0) == '<') {
            int start = 0;
            for(int i = start; i < input.length(); i++) {
                if(input.charAt(i) == '<') {
                    for(int j = start; j < input.length(); j++) {
                        if(input.charAt(j) == '>') {
                            arr.add(input.substring(i, j+1));
                            start = j;
                        }
                    }
                }
                else if(input.charAt(i) == ' ') {
                    for(int j = start; j < input.length(); j++) {
                        if(input.charAt(j) == ' ' || input.charAt(j) == '<') {
                            arr.add(input.substring(i, j));
                            start = j;
                        }
                    }
                }
                else if(input.charAt(i) == '>'){
                    for(int j = start; j < input.length(); j++) {
                        if(input.charAt(j) == '<' || input.charAt(j) == ' ') {
                            arr.add(input.substring(i+1, j));
                            start = j;
                        }
                    }
                }
            }
        }
        for(int i = 0; i < arr.size(); i++) {
            bw.write(arr.get(i) + " ");
        }
        bw.flush();
    }
}
