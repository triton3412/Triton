import java.io.*;
import java.util.*;

public class baekjoon5430 {
    static void DQprint(Deque<Integer> dq)throws Exception{
        bw.write("[");
        int size = dq.size();
        for(int i=0;i<size;i++){
            if(i == size-1){
                bw.write(dq.poll()+"");
            }
            else{
                bw.write(dq.poll() + ",");
            }
        }
        bw.write("]");
    }
    static int count = 0;
    static Deque<Integer> D(Deque<Integer> D)throws IOException{
        if(count % 2 == 0){
            D.pollFirst();
        }
        else{
            D.pollLast();
        }
        return D;
    }
    static Deque<Integer> R(Deque<Integer> D){
        List<Integer> list = new ArrayList<>(D);
        Collections.reverse(list);
        D = new ArrayDeque<>(list);
        return D;
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws Exception {
        int shit = Integer.parseInt(br.readLine());
        while(shit --> 0){
            Deque<Integer> D = new ArrayDeque<>();
            String command = br.readLine();
            int size = Integer.parseInt(br.readLine());
            String inp = br.readLine();
            String [] input;
            inp = inp.replaceAll("\\[", "").replaceAll("]", "");
            input = inp.split(",");//여기까지가 입력
            if(size != 0){
                for(int i = 0; i < input.length; i++){
                    D.add(Integer.parseInt(input[i]));
                }
            }
            boolean error = false;
            for(int i = 0; i < command.length(); i++){
                if(command.charAt(i) == 'D'){
                    if(D.isEmpty()){
                        error = true;
                        break;
                    }
                    else{
                        D = D(D);
                    }
                }
                else if(command.charAt(i) == 'R'){
                    count++;
                }
                //bw.write(D + "\n");
            }
            if(error) bw.write("error\n");
            else {
                if(count % 2 == 0){
                    DQprint(D);
                    bw.newLine();
                }
                else{
                    DQprint(R(D));
                    bw.newLine();
                }
            }
            count = 0;
            error = false;
        }
        bw.flush();
    }
}
