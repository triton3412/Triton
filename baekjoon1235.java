import java.io.*;

public class baekjoon1235 {
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
    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(br.readLine());
        String [] inp = new String[count];
        for(int i = 0; i<count; i++){
            inp[i] = br.readLine();
        }
        String [] ends = new String[count];
        int cou = 1;
        int size = inp[0].length();
        for(int i = 0; i<inp.length; i++){
            ends[i] = inp[i].substring(size-cou, size);
        }
        for(int x = 0; x < size; x++){
            if(same(ends)){
                break;
            }
            else {
                cou++;
                for (int i = 0; i < count; i++) {
                    ends[i] = inp[i].substring(size - cou, size);
                }
            }

        }
        bw.write(cou + "\n");
        /*for(int i = 0; i<count; i++){
            bw.write(ends[i]+" ");
        }*/
        bw.flush();
    }
}
