import java.io.*;
import java.util.LinkedList;

public class baekjoon10845 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void push(LinkedList<Integer> arr, int n) throws IOException {
        arr.addLast(n);
    }

    public static void pop(LinkedList<Integer> arr) throws IOException {
        if (arr.isEmpty()) {
            bw.write(String.valueOf(-1));
        } else {
            bw.write(String.valueOf(arr.removeFirst()));
        }
        bw.newLine();
        bw.flush();
    }

    public static void size(LinkedList<Integer> arr) throws IOException {
        bw.write(String.valueOf(arr.size()));
        bw.newLine();
        bw.flush();
    }

    public static void empty(LinkedList<Integer> arr) throws IOException {
        if (arr.isEmpty()) {
            bw.write(String.valueOf(1));
        } else {
            bw.write(String.valueOf(0));
        }
        bw.newLine();
        bw.flush();
    }

    public static void back(LinkedList<Integer> arr) throws IOException {
        if (arr.isEmpty()) {
            bw.write(String.valueOf(-1));
        } else {
            bw.write(String.valueOf(arr.getLast()));
        }
        bw.newLine();
        bw.flush();
    }
    public static void front(LinkedList<Integer> arr) throws IOException {
        if (arr.isEmpty()) {
            bw.write(String.valueOf(-1));
        } else {
            bw.write(String.valueOf(arr.getFirst()));
        }
        bw.newLine();
        bw.flush();
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> arr = new LinkedList<>();
        int n;

        try {
            n = Integer.parseInt(br.readLine());

            while (n-- > 0) {
                String commission = br.readLine();
                String[] com = commission.split(" ");

                switch (com[0]) {
                    case "push":
                        push(arr, Integer.parseInt(com[1]));
                        break;
                    case "pop":
                        pop(arr);
                        break;
                    case "size":
                        size(arr);
                        break;
                    case "empty":
                        empty(arr);
                        break;
                    case "front":
                        front(arr);
                        break;
                    case "back":
                        back(arr);
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("입력 또는 출력 중 오류가 발생했습니다.");
        }
    }
}
