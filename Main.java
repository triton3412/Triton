import java.io.*;

public class Main {
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
        }

        int count = Integer.parseInt(br.readLine());
        for(int i = 0; i<count; i++){
            String [] input = br.readLine().split(" ");
            if(input[0].equals("1")){
                int num = Integer.parseInt(input[1]);
                for(int j = 0; j < swit.length; j++){
                    if((j+1)%num == 0){
                        swit[j] = reverse(swit[j]);
                    }
                }
                print(swit);
                bw.newLine();
                bw.flush();
            }
            else if (input[0].equals("2")) {
                int cou = 1;
                int numb = Integer.parseInt(input[1]) - 1;
                swit[numb] = reverse(swit[numb]);
                while(numb - cou > 0 && numb + cou < swit.length){
                    if(swit[numb - cou] == swit[numb + cou]){
                        swit[numb - cou] = reverse(swit[numb - cou]);
                        swit[numb + cou] = reverse(swit[numb + cou]);
                    }
                    cou++;
                }
                print(swit);
                bw.newLine();
                bw.flush();
            }
        }
        print(swit);
    }
}
