import java.io.*;
import java.util.ArrayList;

public class baekjoon17413failed {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static ArrayList<String> list = new ArrayList<>();

    public static String reverse(String str){
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args)throws IOException {
        String inp = br.readLine();
        int count = 0;
        for(int i = 0; i < inp.length(); i++){
            if(inp.charAt(i) == '<'){
                count++;
            }
        }
        inp = inp.replace("<", " <").replace(">", "> ").trim();
        String[] str = inp.split(" ");
        int n = 0;
        while(count --> 0){
            for(int i = n; i < str.length; i++){
                if(str[i].charAt(0) == '>'){
                    str[i] = reverse(str[i]);
                    n = i + 1;
                    break;
                }
            }
        }
        for (int i = 0; i < inp.length(); i++) {
            if (inp.charAt(i) == '<') {
                for (int j = i + 1; j < inp.length(); j++) {
                    if (inp.charAt(j) == '>') {
                        list.add(inp.substring(i, j + 1));
                        break;
                    }
                }
            }
        }
        for(int i = 0; i < str.length; i++){
            if(str[i].charAt(0) != '<'){
                str[i] = reverse(str[i]);
            }
        }
        String res = "";
        for(int i = 0; i < str.length; i++){
            if(str[i].charAt(0) == '<'){
                res += str[i];
            }
            else{
                if(i == 0){
                    res += str[i];
                }
                else{
                    if(str[i - 1].charAt(str[i-1].length() - 1) == '>'){
                        res += str[i];
                    }
                    else{
                        res += " " + str[i];
                    }
                }
            }
        }
        bw.write(res);
        bw.flush();
    }
}
