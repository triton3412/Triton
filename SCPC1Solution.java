import java.io.*;
// Tlqkf SCPC는 ㅈㄴ 어렵구나
public class SCPC1Solution {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) {
        try{
            int N = Integer.parseInt(br.readLine());
            for(int x=0; x<N; x++){
                int si = Integer.parseInt(br.readLine());
                String s = br.readLine();

                int count = 0;

                for(int i=1; i<s.length() - 1; i++){
                    if(s.charAt(i)=='B'){
                        if(s.charAt(i - 1)=='A' && s.charAt(i+1)=='A'){
                            count++;
                        }
                    }
                }
                for(int j = 0; j<s.length() - 1; j++){
                    if(s.charAt(j)=='A' && s.charAt(j + 1) == 'A'){
                        count += 2;
                    }
                }
                bw.write("Case #" + (x + 1) + "\n");
                bw.write(String.valueOf(count));
                bw.newLine();
                bw.flush();
            }

        } catch (IOException e){
            System.out.println("Error Detected");
        }
    }
}
