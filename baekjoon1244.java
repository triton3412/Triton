import java.io.*;

public class baekjoon1244 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static boolean reverse(boolean swit){
        if(swit) return false;
        else return true;
    }
    public static void print(boolean [] swit) throws IOException{
        for(int i = 0; i< swit.length; i++){
            if(swit[i]){
                bw.write("1" + " ");
            }
            else{
                bw.write("0" + " ");
            }
            if((i+1)%20 == 0){
                bw.newLine();
            }
        }
        bw.newLine();
        bw.flush();
    }

    public static void main(String[] args)throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] init = br.readLine().split(" ");
        boolean [] swit = new boolean[n];
        for(int i = 0; i<n; i++){
            if(init[i].equals("1")){
                swit[i] = true;
            }
            else {
                swit[i] = false;
            }
        }//입력받은 배열 저장

        int count = Integer.parseInt(br.readLine());
        for(int i = 0; i<count; i++){
            String [] input = br.readLine().split(" ");
            if(input[0].equals("1")){
                int num = Integer.parseInt(input[1]);
                for(int j = num; j <= swit.length; j+=num){
                    swit[j-1] = reverse(swit[j-1]);
                }
            }
            else if (input[0].equals("2")) {
                int num = Integer.parseInt(input[1]) - 1;
                int left = num - 1;
                int right = num + 1;
                swit[num] = reverse(swit[num]);
                while(left >= 0 && right < swit.length){
                    if(swit[left] == swit[right]){
                        swit[left] = reverse(swit[left]);
                        swit[right] = reverse(swit[right]);
                        left--; right++;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        print(swit);
    }
}
