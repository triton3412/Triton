import java.util.Arrays;
import java.util.Scanner;

public class Main { //숫자 자릿수 계산하는 함수
    public static int COUNT = 0;
    public static int num(int n){
        int count = 0;
        while(n >= 1){
            n /= 10;
            count++;
        }
        return count;
    }
    public static boolean check(int n){
        boolean found = true;
        int count = 0;
        int [] arr = new int[num(n) - 1];
        for(int i = 0; i < arr.length; i++){
            arr[i] = n%10;
            n/=10;
        }
        int dif = n%10 - (n/10)%10;
        for(int i = 1; i <= arr.length - 1; i++) {
            if (arr[i] - arr[i - 1] != dif) {
                found = false;
            }
        }
        if(found){
            System.out.print(Arrays.toString(arr));
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
