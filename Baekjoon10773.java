import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList();
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            int n = sc.nextInt();
            if (n == 0){
                list.remove(list.size()-1);
            }
            else{
                list.add(n);
            }
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}
