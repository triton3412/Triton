import javax.naming.PartialResultException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int COUNT = 0;
    public static ArrayList<Integer> list = new ArrayList<Integer>();
    public static int num(int n){
        int count = 0;
        while(n >= 1){
            n /= 10;
            count++;
        }
        return count;
    } //숫자 자릿수 계산하는 함수
    public static int toint(int [] n){
        int num = 0;
        for (int nas : n) {
            num *= 10;
            num += nas;
        }
        return num;
    }//정수배열을 정수로 만드는 함수

    public static boolean check(int n){
        boolean found = true;
        int thi = n;
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
        if (found){
            list.add(thi);
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
        System.out.println(list);
        System.out.println(COUNT);
    }
}
