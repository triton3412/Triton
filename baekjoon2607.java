import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class baekjoon2607 {
    static boolean samemap(List<Character> tglist, List<Character> list){
        for(int i = 0; i<tglist.size(); i++){
            if(!list.contains(tglist.get(i))){
                return false;
            }
        }
        for(int i = 0; i<list.size(); i++){
            if(!tglist.contains(list.get(i))){
                return false;
            }
        }
        return true;
    }
    static boolean diff2(List<Character> tglist, List<Character> list){
        int tglistpl = 0;
        int listpl = 0;
        for(int i = 0; i<tglist.size(); i++){
            if(!list.contains(tglist.get(i))){
                tglistpl++;
            }
        }
        for(int i = 0; i<list.size(); i++){
            if(!tglist.contains(list.get(i))){
                listpl++;
            }
        }
        if(tglistpl == 1 && listpl == 1){
            return true;
        }
        return false;
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(br.readLine())-1;
        int words = 0;
        String target = br.readLine();
        Map<Character, Integer> tgmap = new HashMap<>();
        for(int i = 0; i < target.length(); i++) {
            tgmap.put(target.charAt(i), tgmap.getOrDefault(target.charAt(i), 0) + 1);
        }
        List<Character> tgkeys = new ArrayList<>(tgmap.keySet());
        while(count-- > 0) {
            int diff = 0;
            String word = br.readLine();
            if(Math.abs(word.length() - target.length()) <= 1) {
                Map<Character, Integer> map = new HashMap<>();
                for(int i = 0; i < word.length(); i++) {
                    map.put(word.charAt(i), map.getOrDefault(word.charAt(i), 0) + 1);
                }
                List<Character> keys = new ArrayList<>(map.keySet());
                for(int i = 0; i < keys.size(); i++) {
                    if (tgmap.containsKey(keys.get(i))){
                        diff += Math.abs(map.get(keys.get(i)) - tgmap.get(keys.get(i)));
                    }
                    else {
                        diff += map.get(keys.get(i));
                    }
                }
                for(int j = 0; j < tgkeys.size(); j++) {
                    if(!map.containsKey(tgkeys.get(j))) {
                        diff += tgmap.get(tgkeys.get(j));
                    }
                }
                if (diff <= 2) {
                    words++;
                    bw.write(word + "\n");
                }
            }
        }
        bw.write(words + "\n");
        bw.flush();
    }
}
