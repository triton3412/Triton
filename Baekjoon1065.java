import java.util.Scanner;

public class Baekjoon1065 {
    public static int COUNT = 0;
    public static int num(int n){
        int count = 0;
        while(n >= 1){
            n /= 10;
            count++;
        }
        return count;
    } //숫자 자릿수 계산하는 함수

    public static boolean check(int n){
        boolean found = true;
        if (n < 100){
            return true;
        }
        else{
            int[] arr = new int[num(n)];
            for(int i = 0; i < arr.length; i++){
                arr[i] = n % 10;
                n /= 10;
            }
            int dif = arr[1] - arr[0];
            for(int i = 2; i < arr.length; i++) {
                if (arr[i] - arr[i - 1] != dif) {
                    found = false;
                    break;
                }
            }
        }
        return found;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (check(i)) {
                COUNT++;
            }
        }
        System.out.println(COUNT);
    }
}
