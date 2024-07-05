import java.io.*;
import java.util.Arrays;

public class baekjoon5430failed {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int[] toStr(String str) {
        String [] res = str.split("[\\[\\] ,]");
        int [] ret = new int[res.length - 1];
        for (int i = 1; i < res.length; i++) {
            ret[i - 1] = Integer.parseInt(res[i]);
        }
        return ret;
    }

    public static void R(int [] list){
        for(int i=0;i<list.length/2;i++){
            int temp = list[i];
            list[i] = list[list.length - (1 + i)];
            list[list.length - (1 + i)] = temp;
        }
    }

    public static void main(String[] args){
        try {
            String s = br.readLine();
            char [] use = s.toCharArray();//명령 입력받기

            int size = Integer.parseInt((br.readLine()));
            String str = br.readLine();

            int [] list = toStr(str);

            for(int i=0;i<use.length;i++){
                if(use[i]=='R'){
                    R(list);
                    for(int j=0;j<list.length;j++){
                        bw.write(list[j] + " ");
                        bw.flush();
                    }
                }
                else if(use[i]=='D'){
                    list = Arrays.copyOfRange(list, 1, list.length);
                    for(int j=0;j<list.length;j++){
                        bw.write(list[j] + " ");
                        bw.flush();
                    }
                }
                else{
                    bw.write("error");
                    bw.flush();
                }
                bw.newLine();
            }
        } catch(IOException e){
            System.out.println("Error Detected");
        }
    }
}
