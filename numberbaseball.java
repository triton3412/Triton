import java.io.*;

public class numberbaseball {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static int[] part(int n){
        int [] part = new int[3];
        part[0] = n/100;
        part[1] = (n%100)/10;
        part[2] = n%10;
        return part;
    }
    public static boolean contains(int def, int attnum){//숫자를 보유하는지 확인
        for(int i = 0 ; i < 3 ; i++){
            if(part(def)[i] == attnum){
                return true;
            }
        }
        return false;
    }
    public static boolean [] place(int def, int att, int n){//숫자를 포함하고 숫자의 위치가 맞는지 확인
        boolean [] res = {false, false};
        if(contains(def, part(att)[n])){//def는 방어자 숫자, att는 공격자 숫자, n은 숫자 번호
            res[0] = true;
            if(part(def)[n] == part(att)[n]){
                res[1] = true;
            }
        }
        return res;
    }
    public static void main(String[] args)throws IOException {
        int def = Integer.parseInt(br.readLine());
        //여기까지가 수비 숫자 입력
        int an = 5;
        while(true){
            int strike = 0;
            int ball = 0;
            int att = Integer.parseInt(br.readLine());
            for(int i = 0 ; i < 3 ; i++){
                if(place(def, att, i)[0] && place(def, att, i)[1]){
                    strike++;
                }
                else if(place(def, att, i)[0] && !place(def, att, i)[1]){
                    ball++;
                }
            }
            bw.write(strike + " 스트라이크 " + ball + " 볼\n");
            bw.flush();// 여기까지가 스트라이크, 볼 체크
        }
    }
}
