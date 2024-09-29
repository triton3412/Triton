import java.io.*;
import java.util.*;

public class baekjoon21939fail {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static Map<Integer,Integer> map = new HashMap<>();
    static int reco1()throws IOException{
        Set<Integer> set = map.keySet();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Iterator<Integer> it = set.iterator();
        int min = it.next();
        while(it.hasNext()){
            int input = it.next();
            if(map.get(input) < map.get(min)){
                min = input;
            }
        }
        pq.add(min);
        Iterator<Integer> it2 = set.iterator();
        while(it2.hasNext()){
            int input = it2.next();
            if(map.get(min) == map.get(input)){
                pq.add(input);
            }
        }
        return pq.poll();
    }
    static int recomi1()throws IOException{
        Set<Integer> set = map.keySet();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Iterator<Integer> it = set.iterator();
        int max = it.next();
        while(it.hasNext()){
            int input = it.next();
            if(map.get(input) > map.get(max)){
                max = input;
            }
        }
        pq.add(max);
        Iterator<Integer> it2 = set.iterator();
        while(it2.hasNext()){
            int input = it2.next();
            if(max == input){
                pq.add(input);
            }
        }
        return pq.poll();
    }
    public static void main(String[] args)throws IOException {
        int asdf = Integer.parseInt(br.readLine());
        while(asdf-- > 0) {
            String [] inp = br.readLine().split(" ");
            map.put(Integer.parseInt(inp[0]),Integer.parseInt(inp[1]));
        }
        int asdfsadf = Integer.parseInt(br.readLine());
        while(asdfsadf-- > 0) {
            String [] inp = br.readLine().split(" ");
            if(Objects.equals(inp[0], "recommend")) {
                if (Objects.equals(inp[1], "-1")) {
                    bw.write(reco1() + "\n");
                    bw.flush();
                }
                else if (Objects.equals(inp[1], "1")) {
                    bw.write(recomi1() + "\n");
                    bw.flush();
                }
            }
            else if(Objects.equals(inp[0], "add")) {
                map.put(Integer.parseInt(inp[1]), Integer.parseInt(inp[2]));
            }
            else if(Objects.equals(inp[0], "solved")) {
                map.remove(Integer.parseInt(inp[1]));
            }
        }
        bw.flush();
    }
}
