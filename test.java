import java.io.*;
import java.util.*;

public class test {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static boolean same(String [] ends){
        for(int i = 0; i < ends.length; i++){
            String target = ends[i];
            for(int j = 0; j < ends.length; j++){
                if(ends[j].equals(target) && i != j){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args)throws IOException {
        String [] asdf = new String[3];
        for(int i = 0; i < 3; i++){
            asdf[i] = br.readLine();
        }
        bw.write(String.valueOf(same(asdf)));
        bw.flush();
    }
}
