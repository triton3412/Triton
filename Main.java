import java.io.*;
import java.util.*;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int aver(int [] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum/arr.length;
    }

    public static int mid(int [] arr) {
        int middle = 0;
        int [] sor = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sor);
        middle = sor[arr.length/2];
        return middle;
    }

    public static int most(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        return Collections.max(map.values());//이거 지워
    }

    public static int range(int [] arr) {
        Arrays.sort(arr);
        return (arr[arr.length-1] - arr[0]);
    }

    public static void main(String[] args){
        try{
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(br.readLine());
                bw.write(arr[i] + " ");
            }
            bw.newLine();
            bw.flush();

            bw.write(String.valueOf(aver(arr)));
            bw.newLine();
            bw.write(String.valueOf(mid(arr)));
            bw.newLine();
            bw.write(String.valueOf(most(arr)));
            bw.newLine();
            bw.write(String.valueOf(range(arr)));
            bw.newLine();
            bw.flush();
        } catch (IOException e){
            System.out.println("Error Detected");
        }
    }
}
