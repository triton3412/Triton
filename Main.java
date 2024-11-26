import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String [] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int min = 2000000000;
        if(N == M){
            int count = 0;
            for(int j = 0; j < Integer.toString(N).length(); j++){
                if (Integer.toString(N).charAt(j) == '8') {
                    count++;
                }
            }
            bw.write(count + "\n");
            bw.flush();
            return;
        }
        for(int i = N; i <= M; i++){
            String target = Integer.toString(i);
            String Nstring = Integer.toString(N);
            String Mstring = Integer.toString(M);
            if (Nstring.charAt(0) != '8' || Mstring.charAt(0) != '8') {
                if(Nstring.length() == Mstring.length() && Mstring.contains("8") && Nstring.contains("8")){
                    int shit = -1;
                    for(int x = Nstring.length() - 2; x >= 0; x--){
                        if(Mstring.charAt(x) == '8' && Nstring.charAt(x) == '8'){
                            shit = x;
                            break;
                        }
                    }
                    if(shit == -1){
                        bw.write(0 + "\n");
                        bw.flush();
                        return;
                    }
                    String Ns = Nstring.substring(0, shit+1);
                    String Ms = Mstring.substring(0, shit+1);
                    int Nasdf = 0;
                    int Masdf = 0;
                    for(int s = 0; s < Ns.length(); s++){
                        if(Ns.charAt(s) == '8'){
                            Nasdf++;
                        }
                        if(Ms.charAt(s) == '8'){
                            Masdf++;
                        }
                    }
//                    bw.write(Ns + " " + Ms + "\n");
                    bw.write(Math.min(Nasdf, Masdf) + "\n");
                    bw.flush();
                    return;
                }
                else{
                    bw.write(0 + "\n");
                    bw.flush();
                    return;
                }
            }
            else{
                int count = 0;
                for(int j = 0; j < target.length(); j++){
                    if (target.charAt(j) == '8') {
                        count++;
                    }
                }
                if(count == 0){
                    bw.write(0 + "\n");
                    bw.flush();
                    return;
                }
                else{
                    if(count < min){
                        min = count;
                    }
                }
                count = 0;
            }
        }
        bw.write(min + "\n");
        bw.flush();
    }
}
