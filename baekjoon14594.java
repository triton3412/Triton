import java.io.*;

public class baekjoon14594 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int [] wall = new int [Integer.parseInt(br.readLine())*2 - 1];
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < wall.length; i++) {
            if(i%2 == 0) {
                wall[i] = 0;
            }
            else{
                wall[i] = 1;
            }
        }
        while(count-- > 0) {
            String [] inp = br.readLine().split(" ");
            int start = Integer.parseInt(inp[0]);
            int end = Integer.parseInt(inp[1]);

            for(int i = start * 2 - 1; i < end * 2 - 1; i++) {
                if(wall[i] == 1) {
                    wall[i] = 0;
                }
            }
        }

        /*for (int i = 0; i < wall.length; i++) {
            bw.write(wall[i]+" ");
        }
        bw.newLine();*/
        int shit = 0;
        for(int i = 0; i < wall.length; i++) {
            if(wall[i] == 1) {
                shit++;
            }
        }
        bw.write(shit + 1 + "\n");
        bw.flush();
    }
}