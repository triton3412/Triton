import java.io.*;

public class test {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static boolean reverse(boolean swit){
        if(swit) return false;
        else return true;
    }
    public static void main(String[] args) throws IOException {
        boolean [] swit = new boolean[10];

        for (int i = 0; i < 10; i++) {
            swit[i] = false;
        }
        String [] input = br.readLine().split(" ");
        if(input[0].equals("1")){
            int num = Integer.parseInt(input[1]);
            for(int j = 0; j < swit.length; j++){
                if((j + 1) % num == 0){
                    swit[j] = reverse(swit[j]);
                }
            }
        }
        for(int i = 0; i < swit.length; i++){
            System.out.print(swit[i] + " ");
        }
    }
}


/*for(int i = 0; i < str.length; i++){
        if(str[i].charAt(0) == '>'){
str[i] = reverse(str[i]);
            }
                    }*/