package baekjoon.bronze.B5;
//합
import java.util.Scanner;

public class BJ8393 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        if(n>=1 && n<=10000) {
            for(int i=1; i<=n; i++) {
                sum += i;
            }System.out.println(sum);
        }

    }
}
