import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class baekjoon11723 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        while(n--> 0){
            String [] input = br.readLine().split(" ");
            if(input[0].equals("add")){
                set.add(Integer.parseInt(input[1]));
            }
            else if(input[0].equals("remove")){
                set.remove(Integer.parseInt(input[1]));
            }
            else if(input[0].equals("check")){
                if (set.contains(Integer.parseInt(input[1]))) {
                    bw.write(1 + "\n");
                }
                else{
                    bw.write(0 + "\n");
                }
            }
            else if(input[0].equals("toggle")){
                if(set.contains(Integer.parseInt(input[1]))){
                    set.remove(Integer.parseInt(input[1]));
                }
                else{
                    set.add(Integer.parseInt(input[1]));
                }
            }
            else if(input[0].equals("all")){
                set.clear();
                for(int i = 1; i <= 20; i++){
                    set.add(i);
                }
            }
            else if(input[0].equals("empty")){
                set.clear();
            }
        }
        bw.flush();
    }
}
