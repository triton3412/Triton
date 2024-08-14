import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class in {
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
        Queue<Integer> input = new LinkedList<>();
        Queue<Integer> strike = new LinkedList<>();
        Queue<Integer> ball = new LinkedList<>();
        Queue<Integer> solution = new LinkedList<>();
        int count = Integer.parseInt(br.readLine());//반복할 횟수
       for(int i = 0; i < count; i++) {
           String[] inp = br.readLine().split(" ");
           input.add(Integer.parseInt(inp[0]));
           strike.add(Integer.parseInt(inp[1]));
           ball.add(Integer.parseInt(inp[2]));//이게 공격 숫자, 그 숫자의 스트 볼 개수 큐에 입력
       }
       for(int i = 123 ; i <= 987 ; i++){
           int def = input.element();
           //여기에 스트 볼 횟수가 같은지 확인하고 solution에 추가해야됨
           boolean ifit = false;
           for(int j = 0 ; j < input.size(); j++){

               int str = 0;
               int bl = 0;

               //여기부터
               for(int k = 0 ; k < 3 ; k++){//스트라이크, 볼 개수 체크
                   if(place(def, i, k)[0] && place(def, i, k)[1]){
                       str++;
                   }
                   else if(place(def, i, k)[0] && !place(def, i, k)[1]){
                       bl++;
                   }
               }
               //여기까지

               if(str == strike.size() && bl == ball.size()){
                   ifit = true;
               }
               else{
                   ifit = false;
                   break;
               }
           }
           if(ifit){
               solution.add(def);
           }
       }
       for(int i = 0; i < count; i++){
           bw.write(String.valueOf(solution.size()));
       }
       bw.flush();
    }
}
