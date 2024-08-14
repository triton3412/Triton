import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
//Tlqkf 2일 반을 갈아넣어서 겨우 맞췄네 진짜열맏는다
public class baekjoon2503 {
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
    public static int[] strbal(int def, int att){
        int [] res = {0, 0};
        for(int i = 0 ; i < 3 ; i++){
            if(place(def, att, i)[1]){
                res[0]++;
            }
            else if(place(def, att, i)[0] && !place(def, att, i)[1]){
                res[1]++;
            }
        }
        return res;
    }//def자리에 방어할 수, att자리에 던질 수가 들어가야 함
    public static boolean many(int n){
        int [] now = part(n);
        return now[0] == now[1] || now[1] == now[2] || now[0] == now[2];
    }
    public static void main(String[] args) throws IOException {
        Queue<String[]> input = new LinkedList<>();
        Queue<Integer> solution = new LinkedList<>();
        Queue<Integer> resul = new LinkedList<>();
        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++){
            input.add(br.readLine().split(" "));
        }
        //입력값, 스트라이크, 볼 입력 받음
        for(int i = 123; i <= 987; i++){
            if(part(i)[0] == 0 || part(i)[1] == 0 || part(i)[2] == 0 || many(i)) continue;
            boolean ifit = true;
            for(int j = 0; j < count; j++){
                String [] current = input.poll();
                int [] result = strbal(i, Integer.parseInt(current[0]));
                if(result[0] != Integer.parseInt(current[1]) || result[1] != Integer.parseInt(current[2])){
                    ifit = false;
                    input.add(current);
                    break;
                }
                input.add(current);
            }
            if(ifit){
                solution.add(i);
            }
        }
        bw.write(String.valueOf(solution.size()));
        /*bw.newLine();
        while(!solution.isEmpty()){
            bw.write(solution.poll() + " ");
        }*/
        bw.flush();
    }
}
