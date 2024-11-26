import java.io.*;
import java.util.PriorityQueue;

public class baekjoon1105 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String [] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        String Nstring = Integer.toString(N);
        String Mstring = Integer.toString(M);

        if(N == M){
            int count = 0;
            for(int i = 0; i < Nstring.length(); i++){
                if (Nstring.charAt(i) == '8') {
                    count++;
                }
            }
            bw.write(count + "\n");
            bw.flush();
            return;
        }
        else if(Nstring.length() == Mstring.length() && (Nstring.contains("8") && Mstring.contains("8"))){
            int shit = -1;
            for(int i = Nstring.length()-2; i >= 0; i--){
                if (Nstring.charAt(i) == '8' && Mstring.charAt(i) == '8') {
                    shit = i;
                    break;
                }
            }
            if(shit == -1){
                bw.write(0 + "\n");
                bw.flush();
                return;
            }
            else {
                Nstring = Nstring.substring(0, shit + 1);
                Mstring = Mstring.substring(0, shit + 1);
                PriorityQueue<Integer> pq = new PriorityQueue<>();
                for(int i = Integer.parseInt(Nstring); i <= Integer.parseInt(Mstring); i++){
                    String asdf = Integer.toString(i);
                    int count = 0;
                    for(int j = 0; j < asdf.length(); j++){
                        if(asdf.charAt(j) == '8'){
                            count++;
                        }
                    }
                    if(count == 0){
                        bw.write(0 + "\n");
                        bw.flush();
                        return;
                    }
                    else {
                        pq.add(count);
                    }
//                    ㅆㅃㅆㅃㅆㅃㅆㅃㅆㅃㅆㅃㅆㅃㅆㅆㅃㅆㅃㅆㅃㅆㅃㅆㅆㅃㅆㅆㅃㅆㅃㅆㅃㅆㅃㅆㅆㅃㅃㅆㅃㅆㅃㅆ
//                    이런시발 2일동안 한문제만 푸는게 말이되냐 실버1따리문제인데 씨
                }
                bw.write(pq.peek() + "\n");
                bw.flush();
                return;
            }

        }
        else{
            bw.write(0 + "\n");
            bw.flush();
            return;
        }
    }
}
