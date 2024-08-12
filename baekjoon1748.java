import java.io.*;

public class baekjoon1748 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args)throws IOException {
        int n = Integer.parseInt(br.readLine());
        int count = String.valueOf(n).length();
        long length = 0;

        for(int i = 1; i < count; i++){
            length += (int) (i * (9 * Math.pow(10, i - 1)));
        }//하나 전 자리수 숫자들 길이는 다 합함 이제 같은자리수 숫자들만 더해주면 됨

        long ten = (long) Math.pow(10, count - 1);
        long res = n / ten;
        length += count * (res-1) * ten;
        length += count * (n - (ten*res) + 1);

        bw.write(String.valueOf(length));
        bw.flush();
    }
}
